package pilhas;

/**
 *
 * @author ric_l
 */
public interface PilhaF {        
    public void push(int numero);
    public int pop();
    public int top();
    public boolean isEmpty();
    public int size();
    public boolean isFull();
}
