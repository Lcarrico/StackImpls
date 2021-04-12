package dev.jimenez;

import java.util.EmptyStackException;

public class Stack implements Stackable{

    int size = 0;
    int[] arr = new int[100];

    @Override
    public boolean isEmpty() {
        if (size == 0){
            return true;
        }
        return false;
    }

    @Override
    public int push(int i) {
        arr[size++] = i;
        return arr[size-1];
    }

    @Override
    public Integer peek() {
        return !isEmpty() ? arr[size-1] : null;
    }

    @Override
    public int pop() {
        if (isEmpty()){
            throw new EmptyStackException();
        }

        return arr[--size];
    }

}
