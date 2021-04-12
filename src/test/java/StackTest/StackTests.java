package StackTest;

import dev.jimenez.withnodes.Stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

public class StackTests {

    @Test
    void stack_is_empty(){

        Stack demo = new Stack();
        Assertions.assertTrue(demo.isEmpty());
    }

    @Test
    void push_test(){

        Stack demo = new Stack();
        int i = 5;

        demo.push(i);
        Assertions.assertFalse(demo.isEmpty());

    }

    @Test
    void peek_test(){
        Stack demo = new Stack();
        int i = 5;
        int j = 10;
        demo.push(i);
        demo.push(j);

        Assertions.assertEquals(10, demo.peek());
    }

    @Test
    void peek_test_null(){
        Stack demo = new Stack();

        Assertions.assertEquals(null, demo.peek());
    }

    @Test
    void pop_test_empty_stack(){
        // EMPTY STACK EXCEPTION
        Stack demo = new Stack();

        Assertions.assertThrows(EmptyStackException.class, ()->{
            demo.pop();
        });
    }

    @Test
    void pop_test(){
        Stack demo = new Stack();
        int i = 5;

        demo.push(i);

        Assertions.assertEquals(5, demo.pop());
    }

}
