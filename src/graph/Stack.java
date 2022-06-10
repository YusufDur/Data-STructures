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
public class Stack<T> {

    Node<T> head;

    public Stack() {
        
    }

    void push(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    T pop() {
        if (head == null) {
            return null;
        } else {
            T data = head.data;
            head = head.next;
            return data;

        }
    }

    T peek() {
        return (head == null) ? null : head.data;
    }

    boolean isEmpty() {
        return head == null;
    }

    int size() {
        if (head == null) {
            return 0;
        } else {
            Node<T> temp = head;
            int size = 0;
            while (temp != null) {
                temp = temp.next;
                size++;
            }
            return size;
        }

    }

    void print() {
        if (isEmpty()) {
            System.out.println("Empty List!");
        } else {
            Node<T> temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ->");
                temp = temp.next;

            }
            System.out.println("null");

        }
    }

}
