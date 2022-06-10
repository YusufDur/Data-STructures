/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue1;

/**
 *
 * @author fsmblm0
 */
public class Queue<T> {

    Node<T> front, rear;

    void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.nextNode = newNode;
            rear = newNode;
        }

    }

    T dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            T data = front.data;
            if (size() == 1) {
                front = rear = null;
            } else {
                front = front.nextNode;
            }
            return data;
        }
    }

    boolean isEmpty() {
        return front == null;
    }

    void print() {
        Node <T> temp = front;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.nextNode;
        }
    }

    int size() {
        if(isEmpty()) return 0;
        if(front.data.equals(rear.data)) return 1;
        Node <T> temp = front;
        int count = 1;
        while(temp != rear){
            count++;
            temp = temp.nextNode;
        }
        return count;
    }

}
