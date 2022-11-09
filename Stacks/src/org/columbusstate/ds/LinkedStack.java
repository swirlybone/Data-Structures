package org.columbusstate.ds;

public class LinkedStack<T> implements Stack<T> {
    LinearNode<T> top;
    int size = 0;

    @Override
    public void push(T element) {
        LinearNode<T> newTop = new LinearNode<T>();
        newTop.setContent(element);

        newTop.setNext(top);
        top = newTop;
        size = size + 1;
    }

    @Override
    public T pop() {
        if(size  == 0)
        {
            return null;
        }

        LinearNode<T> pastTop = top;
        top = top.getNext();

        pastTop.setNext(null);

        T value = pastTop.getContent();
        pastTop = null; // removing reference from memory

        size = size - 1;
        return value;
    }

    @Override
    public T peek() {
        if(size == 0){
            return null;
        }

        return top.getContent();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
