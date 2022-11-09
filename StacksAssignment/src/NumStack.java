public interface NumStack<N> {
    public void push(N element);
    public N pop();
    public N peek();
    public int size();
    public boolean isEmpty();
}
