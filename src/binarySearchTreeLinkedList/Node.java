package binarySearchTreeLinkedList;

/**
 *
 * @author ric_l
 */
public class Node {
    private int numero;
    private Node LeftChild;
    private Node RightChild;
    private Node Father;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Node getLeftChild() {
        return LeftChild;
    }

    public void setLeftChild(Node LeftChild) {
        this.LeftChild = LeftChild;
    }

    public Node getRightChild() {
        return RightChild;
    }

    public void setRightChild(Node RightChild) {
        this.RightChild = RightChild;
    }

    public Node getFather() {
        return Father;
    }

    public void setFather(Node Father) {
        this.Father = Father;
    }
        
}
