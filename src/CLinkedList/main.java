/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLinkedList;

/**
 *
 * @author yusuf.dur
 */
public class main {
    public static void main(String[] args) {
        CLinkedList l = new CLinkedList();
        l.addFirst(l);
        l.addLast(2);
        l.addLast(3);
        l.addLast(4);
        l.addLast(4);
        l.addLast(4);
        l.addLast(4);
        l.addLast(4);
        l.removeAll(4);

        
        //l.insertAfter(7, 2);
        l.print();
    }
}
