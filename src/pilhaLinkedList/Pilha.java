package pilhaLinkedList;

import pilhasarray.PilhaF;

/**
 *
 * @author ric_l
 */
public class Pilha implements PilhaF{
       
    private int t;    
    private Node pilha;

    public Pilha(Node pilha) {
        this.pilha = pilha;        
    }        
    
    public void push(int numero) {
        Node novoNode = new Node(numero);
        novoNode.setNodeProx(this.pilha);
        pilha = novoNode;
        t++;
    }
    
    public int pop() throws PilhaVaziaException{
        if(isEmpty()){
            throw new PilhaVaziaException();
        }        
        int numero = pilha.getNumero();
        
        //Retirando primeiro elemento
        Node antigo = pilha;
        pilha = antigo.getNodeProx();
        antigo.setNodeProx(null); //faz com que o elemento n esteja conectado a nenhum outro da pilha
        antigo = null; //Acelera o processo de delete
        t--;
        
        return numero;
    }
    
    public int top() throws PilhaVaziaException{        
        if(isEmpty()){
            throw new PilhaVaziaException();
        }        
        return pilha.getNumero();
    }
    
    public boolean isEmpty() {
        return pilha == null;
    }
    
    public int size() {
        return t;
    }
        
    @Override
    public boolean isFull() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
