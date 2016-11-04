package sequeciaLinkedList;

/**
 *
 * @author ric_l
 */
public interface ISequencia {
    public int size();
    public int atRank();
    public int rankOf();
    public Node elemAtRank();
    public Node first();
    public Node last();
    public Node before();
    public Node after();
    public void replaceElement(Node NewElement,Node OldElement);
    public void swapElements(Node element1, Node element2);
    public void replaceAtRank(Node element,int rank);
    public void insertAtRank(Node element,int rank);
    public void removeAtRank(int rank);
    public void insertFirst(Node element);
    public void insertLast(Node element);
    public void insertAfter(Node element,Node targetElement);
    public void insertBefore(Node element,Node targetElement);
    public void remove(Node element);
}
