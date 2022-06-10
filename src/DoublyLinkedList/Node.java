/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoublyLinkedList;

/**
 *
 * @author yusuf.dur
 */

    public class Node<T> {
    T data;
    Node <T> next;
    Node <T> previous;
    
      public Node(T data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}

