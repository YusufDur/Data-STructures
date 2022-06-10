/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

/**
 *
 * @author yusuf.dur
 */
public class Stack<T> {

    Node<T> head;

    public Stack() {
        
    }
    
    public Stack(T data) {
        this.head = new Node(data);
    }

    void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.nextNode = head;
            head = newNode;
        }
    }

    T pop() {
        if (head == null) {
            return null;
        } else {
            T data = head.data;
            head = head.nextNode;
            return data;
        }
    }
    T peek(){
        return (head == null)?null : head.data;
    }
    
    boolean isEmpty(){
        return head==null;
    }
    int size(){
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.nextNode;
        }
        return size;
    }
    void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.nextNode;
        }
        System.out.print("NULL");
        System.out.println();
    }
    

}
