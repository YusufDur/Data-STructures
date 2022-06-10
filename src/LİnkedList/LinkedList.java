/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LİnkedList;


/**
 *
 * @author yusuf.dur
 */
public class LinkedList<T> {
    Node<T> head;

    public LinkedList(T data) {
        this.head = new Node<T>(data);
    }

    void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.nextNode = head;
            head = newNode;
        }
    }

    void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.nextNode != null) {
                temp = temp.nextNode;
            }
            temp.nextNode = newNode;
        }
    }

    void insertAfter(T data, T search) {
        Node<T> temp = head;
        while (temp != null && temp.data != search) {
            temp = temp.nextNode;
        }
        if (temp != null) {
            Node<T> newNode = new Node<>(data);
            newNode.nextNode = temp.nextNode;
            temp.nextNode = newNode;
        } else {
            addLast(data);
        }
    }

    public void deleteElement(T data) {
        if (head == null) {
            System.out.println("List Is Empty");
        } else if (head.data.equals(data)) {
            head = head.nextNode;
        } else {
            Node<T> temp = head.nextNode;
            Node<T> prev = head;
            while (temp != null && !temp.data.equals(data)) {
                prev = temp;
                temp = temp.nextNode;
            }
            if (temp != null) {
                prev.nextNode = temp.nextNode;
            } else {
                System.out.println("Element Not Found!");
            }

        }
    }

    public void print() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.nextNode;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public int size(LinkedList<T> list) {
        int size = 0;
        if (head == null) {
            size = 0;
        } else {
            Node<T> temp = head;
            while (temp.nextNode != null) {
                size++;
                temp = temp.nextNode;
            }
        }
        return size;
    }

    public void insertQ1(int n){
        if(n % 2 == 0){
            
        }
    }

}
