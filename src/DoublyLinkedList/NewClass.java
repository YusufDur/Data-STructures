/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoublyLinkedList;

/**
 *
 * @author yusuf.dur
 */
class main {

    public static void main(String[] args) {
        DoublyLinkedList<String> sinifListesi = new DoublyLinkedList<>("tugce");
        sinifListesi.addFirst("ahmet");
        sinifListesi.addLast("buse");
        sinifListesi.addAfter("tugce", "son");
        sinifListesi.remove("son");
        sinifListesi.print();
    }
}
