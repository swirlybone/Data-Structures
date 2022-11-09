package org.columbusstate.ds;

public class LinkedQueue<E> implements Queue<E> {
    LinearNode<E> head;
    LinearNode<E> tail;
    int size = 0;


    @Override
    public boolean enqueue(E value) {

        LinearNode<E> newNode = new LinearNode<E>();
        newNode.setContent(value);

        if(head != null) {
            tail.setNext(newNode);
        }
        else{
            head = newNode;
        }
        tail = newNode;

       // size = size + 1;
        return true;
    }

    @Override
    public E dequeue() {
        if(head != null)
        {
            LinearNode<E> currentHead = head;
            head = head.getNext(); // currentHead.getNext();

            currentHead.setNext(null);
            E content = currentHead.getContent();

            //size = size - 1;

            currentHead = null; //making sure you remove the reference/object from memory.

            return content;
        }
        return null;
    }

    @Override
    public E offer() {
       if(head !=null) {
           return head.getContent();
       }

       return null;
    }

    @Override
    public int length() {
        //return size;
        /*int counter = 0;
        LinearNode<E> temp = head;

        while(temp != null)
        {
            counter = counter + 1;
            temp = temp.getNext();
        }

        return counter;*/
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
}
