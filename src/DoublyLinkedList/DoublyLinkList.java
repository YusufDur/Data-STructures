/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoublyLinkedList;

/**
 *
 * @author yusuf.dur
 */
class DoublyLinkedList<T> {

    Node<T> head, tail;

    public DoublyLinkedList(T data) {
        Node<T> newNode = new Node(data);
        head = tail = newNode;
    }

    void addFirst(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) { // head null olma ihtimali warsa yeni head olustur
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
    }

    void addLast(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }

    }

    void addAfter(T find, T data) {
        if (head == null) {
            System.out.println("liste bos");
        } else if (tail.data.equals(find)) {
            addLast(data);
        } else {
            Node<T> temp = head;
            while (temp != null && !temp.data.equals(find)) {
                temp = temp.next;
            }
            if (temp != null) {
                Node<T> newNode = new Node<T>(data);
                newNode.next = temp.next;
                newNode.previous = temp;
                temp.next.previous = newNode;
                temp.next = newNode;
            } else {
                System.out.println("not found");
            }

        }
    }

    T removeFirst() {
        if (head == null) {
            System.out.print("no");
            return null;
        } else {
            T data = head.data;
            head = head.next;
            return data;
        }
    }

    T removeLast() {
        if (head == null) {
            System.out.println("null");
            return null;
        } else {
            T data = tail.data;
            tail = tail.previous;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
            return data;
        }
    }

    void remove(T data) {
        if (head == null) {
            System.out.println("null");
        } else if (tail.data.equals(data)) {
            removeLast();
        } else if (head.data.equals(data)) {
            removeFirst();
        } else {
            Node<T> temp = head.next;
            while (temp != null && !temp.data.equals(data)) {
                temp = temp.next;
                if (temp != null) {
                    temp.next.previous = temp.previous;
                    temp.previous.next = temp.next;
                } else {
                    System.out.println("no found");
                }

            }
        }
    }

    int size() {
        Node<T> temp = head;
        int count = 0;
        while (temp != tail) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    void print() {
        Node<T> temp = head;
        // System.out.print("[ ");

        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;

        }
        /// System.out.print("]");

    }

}
