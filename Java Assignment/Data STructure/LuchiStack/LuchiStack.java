
public class LuchiStack{

    private int [] stack;

    private int count;

    public LuchiStack(){

        stack = new int [10];
        count = 0;
    }

     public boolean isEmpty(){

        return count == 0;
    }

     public void push(int value){

        if(count == stack.length){
            resize();
    }

        stack[count] = value; 
        count++;
    }

    public int peek(){

        if(isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }

        return stack[count - 1];

    }

    public int pop(){

        if(isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        count --;
        return stack[count];
    }

    public int size(){

    return count;
}

    public void clear(){

    count = 0;
}

    public void resize(){

    int [] newStack = new int[stack.length * 2];

        for(int index = 0; index < stack.length; index ++){

            newStack[index] = stack[index];
}
        stack = newStack;
}   
}

