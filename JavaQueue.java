/* This program implements a simple queue data structure in Java. It defines a Queue class with methods to enqueue, dequeue, peek, and check if the queue is empty or full. The main method demonstrates how to use the Queue class by performing various operations on it. */
import java.util.*;

public class JavaQueue{
    public static void main(String args[]){
        Queue q1 = new Queue();
        System.out.println(q1.isEmpty());
        System.out.println(q1.isFull());

        q1.enqueue(78);
        q1.enqueue(3);
        q1.enqueue(7);
        q1.enqueue(12);
        q1.enqueue(21);

        
        System.out.println(q1.peek());
        q1.dequeue();
        System.out.println(q1.peek());



    }
}

class QueueNode{
    int val;
    QueueNode PointToNext;

    QueueNode(int val){
        this.val = val;
        PointToNext = null;
    }
}

class Queue{
    int size = 0;
    QueueNode Front = null, Rear = null;
    
    boolean isEmpty(){
        return Front == null;
    }

    boolean isFull(){
        return false;
    }
    int peek(){
        if (isEmpty()){
            System.out.print("Queue is empty");
            return -1;
        }
        return Front.val;

    }

    void enqueue(int x){
        QueueNode Temp = new QueueNode(x);
      
        if(isEmpty()){
            Front = Temp;
            Rear = Temp;
        }
        else{
            Rear.PointToNext = Temp;
            Rear = Temp;
        }
        size++;
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("first element gone");
            Front = Front.PointToNext;
            size--;
        }
    }
}
 
