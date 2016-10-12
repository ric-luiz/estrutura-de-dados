package filaarray;

/**
 *
 * @author ric_l
 */
public class Fila implements FilaArrayI{
    private int[] a;
    private int front;
    private int rear;
    
    private int capacidade;
    private int taxaCrescimento;

    public Fila(int capacidade, int taxaCrescimento) {
        this.capacidade = capacidade;
        this.taxaCrescimento = taxaCrescimento;
        this.front = 0;
        this.rear = 0;
        a = new int[capacidade];
    }        
        
    public void enqueue(int numero) {
        if(isFull()){
            int[] novoArray;
            if(taxaCrescimento>0){
                capacidade+=taxaCrescimento;
                novoArray = new int[taxaCrescimento];
            } else {
                capacidade*=2;
                novoArray = new int[capacidade];                
            }
            
            for(int i=0;i<a.length;i++){
                novoArray[i] = a[i];
            }            
            rear = a.length-1;
            front = 0;
            a = novoArray;
        }
        a[rear] = numero;
        rear = (rear+1)%capacidade;        
    }
    
    public int dequeue() throws EFilaVazia{
        if(isEmpty()){
            throw new EFilaVazia();
        }
        int numero = a[front];
        front = (front+1)%capacidade;
        return numero;        
    }
    
    public int top() throws EFilaVazia{
        if(isEmpty()){
            throw new EFilaVazia();
        }
        return a[front];
    }

    public boolean isFull() {
        return rear+1 == capacidade;
    }
    
    public boolean isEmpty() {
        return rear == front;
    }
    
    public int size(){
        return (capacidade-front+rear)%capacidade;
    }
    
    public void capacidade(){
        System.out.println("Capacidade:" +capacidade+" Front:"+front+" Rear:"+rear);
    }
}
