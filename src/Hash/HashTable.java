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
public class HashTable<T, G> {

    private HashEntry<T, G>[] table;

    public HashTable(int N) {
        table = new HashEntry[N];
    }

    //linear probing
    boolean put(T key, G value) {
        int index = hashindex(key);
        if (table[index] == null) {
            table[index] = new HashEntry(key, value);
            return true;
        }
        if (table[index].key == key) {
                System.out.println("Same key!");
                return false;
        }
        int tempindex = index;
        index = (index+1) % table.length;
        while (index != tempindex && table[index] != null) {
            if (table[index].key == key) {
                System.out.println("Same key!");
                return false;
            }
            index = (++index) % table.length;
        }
        if (table[index] == null) {
            table[index] = new HashEntry(key, value);
            return true;
        }
        System.out.println("Hash Table is full!");
        return false;

    }

    int hashindex(T key) {
        String s = String.valueOf(key);
        int key2 = Integer.valueOf(s);

        return key2 % table.length;
    }

    void print() {
        for (int i = 0; i < table.length; i++) {
            if (table[i] == null) {
                System.out.println("[" + i + "] null");
            } else {
                System.out.println("[" + i + "] " + "["
                        + table[i].key.toString() + "," + table[i].value.toString() + "]");

            }
        }
    }
    G get(T key){
        int index=hashindex(key);
        
        if(table[index]!=null && table[index].key==key){
           return table[index].value;
        }
        //linear probing
        int tempindex=index;
        index=(index+1)%table.length;
        while(tempindex!=index && table[index]!=null){
            if(table[index].key==key){
                return table[index].value;
            }
             index=(index+1)%table.length;
        }
        System.out.println("Key not exsist!");
        return null;
    }

}
