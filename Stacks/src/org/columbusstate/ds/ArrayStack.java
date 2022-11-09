package org.columbusstate.ds;

public class ArrayStack<T> implements Stack<T> {
    public static final int INITIAL_SIZE = 10;
    T[] stack = (T[])(new Object[INITIAL_SIZE]);
    int top  = 0;

    //add element to the top of the stack
    public void push(T element){
        if(top == stack.length)
        {
            // stack is full, need to resize;
            expandArray();
        }

        stack[top] = element;
        top = top + 1;
    }

    private void expandArray()
    {
        T[] newArray = (T[])(new Object[stack.length * 2]);

        for(int i = 0; i < stack.length; i++){
            newArray[i] = stack[i];
        }

        stack = newArray;
    }

    public T pop(){
        if(!isEmpty())
        {
            // remove element from the top of the stack
            T element = stack[top - 1];
            top = top - 1;
            stack[top] = null;

            return element;
        }
        return null;
    }

    public T peek(){
        if(!isEmpty())
        {
            // returns a reference of the top of the stack
            T element = stack[top - 1];
            return element;
        }
        return null;
    }

    public int size(){
        return top;
    }
    public boolean isEmpty(){
        return top == 0;
    }
}
