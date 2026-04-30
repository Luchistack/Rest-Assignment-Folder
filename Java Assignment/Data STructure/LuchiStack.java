

import java.util.ArrayDeque;
import java.util.Deque;

public class LuchiStack{

    private Deque <Integer> stack;

    private int count;

    public LuchiStack(){
        new ArrayDeque<Integer>();
    }

     public boolean isEmpty(){
        return stack.isEmpty();
    }

     public void push(int value){
        stack.push(value);
    }
    public int peek(){

        if(isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }

        return stack.peek();

    }

    public int pop(){

        if(isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.pop();
    }
}

