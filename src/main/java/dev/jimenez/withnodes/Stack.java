package dev.jimenez.withnodes;

import java.util.EmptyStackException;

public class Stack {
    int length = 0;
    Node top = null;


    public boolean isEmpty(){
        return length == 0;
    }


    public void push(int value){
        top = new Node(value, top);
        length++;
    }


    public Integer peek() {
        if (length == 0){
            return null;
        }

        return top.getValue();
    }


    public int pop(){
        if (length == 0){
            throw new EmptyStackException();
        }

        length--;

        int value = top.getValue();
        top = top.getNode();
        return value;
    }

    public boolean contains(int value){
        Node first = this.top;
        while(first != null){
            if (first.getValue() == value)
                return true;
            first = first.getNode();
        }
        return false;
    }
}
