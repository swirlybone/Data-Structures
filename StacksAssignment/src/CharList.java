public class CharList<T> implements CharStack {
    public static final int INITIAL_SIZE = 10;
    T[] stack = (T[])(new Object[INITIAL_SIZE]);
    int top  = 0;

    @Override
    public void push(Object element) {
        if (top == stack.length) {
            // stack is full, need to resize;
            //expandArray();
        }
    }

    @Override
    public Object pop() {
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
