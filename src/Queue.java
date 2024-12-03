
public class Queue <K>{
    int n = 5;
    K[] ar1 = (K[]) new Object[9];
    int front = -1; //front of the queue
    int rear = -1; // rear/back of queue

    public void queue(K k){
        //  pre increment used (++varName)
        ar1[++rear] = k;
        if(front == -1){
            front = 0;
        }
    }

    public void dequeue(){
        if(front == rear){
            System.out.println("Queue is Empty");
            rear = -1;
            front = -1;
        } else {
            System.out.println(ar1[++front]);
        }
    }

    // the current method to track the front
    public void curr(){
        if(front == -1){
            System.out.println("Cannot Print");
        }
        else System.out.println(ar1[front]);
    }
}