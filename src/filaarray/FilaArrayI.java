package filaarray;

/**
 *
 * @author ric_l
 */
public interface FilaArrayI {
    public void enqueue(int numero);
    public int dequeue();
    public int top();
    public boolean isFull();
    public boolean isEmpty();
    public int size();
}
