/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hash;

import LİnkedList.Node;

/**
 *
 * @author fsmblm0
 */
public class HashTable_LinkedList<T, G> {

    LinkedList<T, G>[] table;

    public HashTable_LinkedList(int N) {
        table = new LinkedList[N];

        for (int i = 0; i < table.length; i++) {
            table[i] = new LinkedList<>();
        }
    }

    int hashindex(T key) {
        String s = String.valueOf(key);
        int key2 = Integer.valueOf(s);

        return key2 % table.length;
    }

    boolean isUnique(LinkedList l, T key) {
        HashEntry temp = l.head;
        while (temp != null) {
            if (temp.key.equals(key)) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    boolean put(T key, G value) {
        int index = hashindex(key);

        if (!isUnique(table[index], key)) {
            System.out.println("Same key!");
            return false;
        }
        table[index].addLast(key, value);
        return true;
    }

    void print() {
        for (int i = 0; i < table.length; i++) {
            if (table[i].size() == 0) {
                System.out.println("[" + i + "]  null");
            } else {
                System.out.print("[" + i + "]  ");
                table[i].print();
            }
        }
    }
    
    G get(T key){
        int index = hashindex(key);
        
        return table[index].get(table[index],key);
    }

}
