package filaLinkedList;

/**
 *
 * @author ric_l
 */
public class Node {
    private int numero;
    private Node nodeProx;
    private Node nodeAnt;

    public Node(int numero, Node nodeProx, Node nodeAnt) {
        this.numero = numero;
        this.nodeProx = nodeProx;
        this.nodeAnt = nodeAnt;
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

    public Node getNodeAnt() {
        return nodeAnt;
    }

    public void setNodeAnt(Node nodeAnt) {
        this.nodeAnt = nodeAnt;
    }
        
}
