package pilhaLinkedList;

/**
 *
 * @author ric_l
 */
public class Node {
    private int numero;
    private Node nodeProx;

    public Node(int numero) {
        this.numero = numero;        
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Node getNodeProx() {
        return nodeProx;
    }

    public void setNodeProx(Node nodeProx) {
        this.nodeProx = nodeProx;
    }
        
}
