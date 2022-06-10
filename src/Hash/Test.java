/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hash;

/**
 *
 * @author fsmblm0
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("* hash table *");
        HashTable<Integer, String> ht = new HashTable(5);
        ht.put(1, "A");
        ht.put(2, "B");
        ht.put(22, "C");
        ht.put(222, "D");
        ht.put(222, "E");
        ht.print();
        System.out.println("key : 222 = " + ht.get(222));

        System.out.println("\n** hash table ll **");
        HashTable_LinkedList<Integer, String> htll = new HashTable_LinkedList<>(5);
        htll.put(1, "A");
        htll.put(2, "B");
        htll.put(22, "C");
        htll.put(222, "D");
        htll.put(222, "E");
        htll.print();
        System.out.println("key : 222 = " + htll.get(222));
        
    }
}
