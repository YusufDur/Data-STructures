/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLinkedList;

/**
 *
 * @author yusuf.dur
 */
public class CLinkedList<T> {

    Node<T> head;
    Node<T> tail;
    private int size;

    public CLinkedList() {
        this.size = 0;
    }

    void addFirst(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) { // head null olma ihtimali warsa yeni head olustur
            head = tail = newNode;
        } else {
            newNode.nextNode = head;
            head = newNode;
        }
        tail.nextNode = head;
        size++;
    }

    void addLast(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) { // head null olma ihtimali warsa yeni head olustur
            head = tail = newNode;
        } else {
            tail.nextNode = newNode;
            tail = newNode;
        }
        tail.nextNode = head;
        size++;
    }

    void insertAfter(T data, T search) {
        if (head == null) {
            System.out.println("bulunamadı");
        } else if (tail.data.equals(search)) {
            addLast(data);
        } else {
            Node<T> temp = head;
            while (!temp.equals(tail) && !temp.data.equals(search)) {
                temp = temp.nextNode;
            }
            if (temp != tail) {
                Node<T> newNode = new Node<>(data);
                newNode.nextNode = temp.nextNode;
                temp.nextNode = newNode;
                size++;
            } else {
                System.out.println("bulunamadı!");
            }
        }
    }

    T removeFirst() {
        if (head == null) {
            System.out.print("no");
            return null;
        } else if (head.equals(tail)) {
            T data = head.data;
            head = tail = null;
            size--;
            return data;
        } else {
            T data = head.data;
            head = head.nextNode;
            tail.nextNode = head;
            size--;
            return data;
        }
    }

    T removeLast() {
        if (head == null) {
            System.out.println("null");
            return null;
        } else if (head.equals(tail)) {
            T data = head.data;
            head = tail = null;
            size--;
            return data;
        } else {
            T data = tail.data;
            Node temp = head;
            while (!temp.nextNode.equals(tail)) {
                temp = temp.nextNode;
            }
            tail.nextNode = head;
            tail = temp;
            size--;
            return data;
        }
    }

    T remove(T data) {
        if (head == null) {
            System.out.println("Empty List!");
            return null;
        } else if (head.data.equals(data)) {
            return removeFirst();
        } else if (tail.data.equals(data)) {
            return removeLast();
        } else {
            Node<T> temp = head;

            while (!temp.nextNode.equals(head) && !temp.nextNode.data.equals(data)) {
                temp = temp.nextNode;
            }
            if (!temp.equals(tail)) {
                temp.nextNode = temp.nextNode.nextNode;
                size--;
                return data;
            } else {
                System.out.println("Bulunamadı");
                return null;
            }
        }
    }

    T removeAll(T data) {
        if (head == null) {
            System.out.println("Empty List!");
            return null;
        } else {
            Node<T> temp = head;
            while (!temp.nextNode.equals(head)) {
                while (!temp.nextNode.equals(head) && !temp.nextNode.data.equals(data)) {
                    temp = temp.nextNode;
                }
                if (!temp.equals(tail)) {
                    temp.nextNode = temp.nextNode.nextNode;
                    size--;
                    continue;
                } else {
                    System.out.println("Bulunamadı");
                    return null;
                }
            }

        }
        return null;
    }

    public void print() {
        Node<T> temp = head;
        // System.out.print("[ ");

        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.nextNode;

        }
    }

}
