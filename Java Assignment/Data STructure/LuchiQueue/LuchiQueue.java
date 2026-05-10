
public class LuchiQueue{

    private  int [] queue;
    private int front;
    private int rear;
    private int count;

    public LuchiQueue(){
        queue = new int [5];
        front = 0;
        rear = 0;
        count = 0;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public void push(int value){
        if(count == queue.length){
            throw new RuntimeException("Queue if full");
        }
        queue[rear] = value;
        rear = (rear + 1) % queue.length;
        count ++;
    }
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Queue if empty");
        }
        return queue[front];
    }

    public int pop(){
        if(isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int value = queue[front];
        front = (front + 1) % queue.length;
        count--;
        return value;
    }
    public int size(){
    
        return count;
}

    public void clear(){

        front = 0;
        rear = 0;
        count = 0;

}

}

