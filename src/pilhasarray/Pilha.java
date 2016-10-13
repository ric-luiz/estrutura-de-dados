package pilhasarray;

/**
 *
 * @author ric_l
 */
public class Pilha implements PilhaF{
    private int capacidade;
    private int tc;
    
    private int t;
    private int[] a;

    public Pilha(int capacidade, int taxaCrescimento) {
        this.capacidade = capacidade;
        this.tc = taxaCrescimento;
        this.t = -1;
        a = new int[capacidade];
    }        
        
    public void push(int numero) {
        if(isFull()){   //Fazemos a duplicação ou acrescimo do array aqui            
            int[] novoArray;
            
            if(tc > 0){ //taxa fixa
                novoArray = new int[tc];
            } else { //duplicação
                novoArray = new int[capacidade*2];
                capacidade=capacidade*2;
            }
            
            //Passa os dados do velho array para o novo array
            for(int i=0;i<a.length;i++){
                novoArray[i] = a[i];
            }
            a = novoArray; //passamos o novoArray para ser o oficial            
        }                        
        a[++t]=numero;        
    }
    
    public int pop() throws PilhaVaziaException{        
        if(isEmpty()){
            throw new PilhaVaziaException();
        }        
        return a[t--];
    }
    
    public int top() throws PilhaVaziaException{
        if(isEmpty()){
            throw new PilhaVaziaException();
        }        
        return a[t];
    }
    
    public boolean isEmpty() {
        return t==-1;              
    }
    
    public int size() {
        return t+1;
    }
    
    public boolean isFull() {
        return t+1==capacidade;
    }
    
}
