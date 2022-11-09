package org.columbusstate.ds;

public class LinearNode<T> {
    T content;

    LinearNode<T> next;

    public void setContent(T value){
        this.content = value;
    }

    public void setNext(LinearNode<T> next){
        this.next = next;
    }

    public T getContent(){
        return content;
    }

    public LinearNode<T> getNext(){
        return next;
    }
}
