package filaLinkedList;

import filaarray.FilaArrayI;

/**
 *
 * @author ric_l
 */
public class Fila implements FilaArrayI{
    private Node nodeFront;
    private Node nodeRear;    
    private int t;

    public Fila(Node node) {
        this.nodeFront = node;
        this.nodeRear = node;
    }
            
    public void enqueue(int numero) {
        Node novoNode = new Node(null); //Node proximo
        novoNode.setNumero(numero);
        
        if(isEmpty()){ //Caso a fila esteja vazia fazemos esse elemento ser o front e o rear
            nodeFront = novoNode;
            nodeRear = novoNode;
        } else {
            this.nodeRear.setNodeProx(novoNode); //Faz com que o novo elemento seja o ultimo da fila
            this.nodeRear = novoNode; //Atualizar o mais novo elemento da ultima posição da fila    
        }
           
        t++;
    }
    
    public int dequeue() throws EFilaVazia{
        if(isEmpty()){
            throw new EFilaVazia();
        }
        int numero = nodeFront.getNumero();
        
        Node antigo = nodeFront;                
        nodeFront = nodeFront.getNodeProx();
        antigo.setNodeProx(null);
        
        t--;
        return numero;
    }
    
    public int top() throws EFilaVazia{
        if(isEmpty()){
            throw new EFilaVazia();
        }
        return nodeFront.getNumero();
    }

    @Override
    public boolean isFull() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean isEmpty() {
        return nodeFront == null;
    }
    
    public int size() {
        return t;
    }
}
