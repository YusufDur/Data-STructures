    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue1;

/**
 *
 * @author yusuf.dur
 */
public class Queue_array<T>{
    int size;
    Node[] dataArray;
    int rear = 1;
    int front = 0;
    int capacity;
    
    public Queue_array(int capacity) {
        T[] dataArray = (T []) new Object[capacity];
        this.capacity = capacity;
    }
    
    boolean isEmpty(){
        return size == 0;
    }
    boolean isFull(){
        return size == capacity;
    }
    
    void enQueue(T data){
        if(isFull()){
            System.out.println("queue full");
        }else{
            dataArray[rear++] = (Node<T>) data;
            rear = rear % (dataArray.length);
            size++;
        }
        
    }
    
    T dequeue(){
        if(!isEmpty()){
            T removedata = (T) dataArray[front++];
            front = front % dataArray.length;
            return removedata;
        }else{
            System.out.println("is empty");
            return null;
        }    
    }
    
    int size (){
        return size;
    }
    
    void print (){
        for (int i = front; i < size + front; i++) {
            System.out.println(dataArray[i % dataArray.length] + " ");
        }
    }
}
