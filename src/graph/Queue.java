/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;


/**
 *
 * @author fsmblm0
 */
public class Queue <T>{
    Node <T> front,rear;
    
    void enqueue(T data){
        Node <T> newNode =new Node(data);
        if(isEmpty()){
            front=rear=newNode;
        }else{
            rear.next=newNode;
            rear=newNode;
        }
    }
    T dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return null;
        }else{
            T data=front.data;
            if(size()==1){
                front=rear=null;
            }else{
                front=front.next;
            }
            return data;
        }
    }
    boolean isEmpty(){
        return front==null;
    }
    void print(){
        Node <T> temp=front;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    int size(){
        if(isEmpty())   return 0;
        if(front==rear) return 1;
        Node <T> temp=front;
        int count=1;
        while(temp!=rear){
            count++;
            temp=temp.next;
        }
        return count;
    }
}
