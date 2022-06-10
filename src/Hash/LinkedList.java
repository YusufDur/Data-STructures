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
public class LinkedList <T, G >{
    HashEntry <T,G> head;

    public LinkedList() {
        
    }
    void addFirst(T key, G value) {
        HashEntry<T,G> newEntry = new HashEntry<>(key,value);
        if (head == null) {
            head = newEntry;
        } else {
            newEntry.next = head;
            head = newEntry;
        }
    }
    
    void addLast(T key, G value) {
        HashEntry<T,G> newEntry = new HashEntry<>(key,value);
        if (head == null) {
            head = newEntry;
        } else {
            HashEntry<T,G> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newEntry;
        }
    }
    void print() {
        HashEntry<T,G> temp = head;

        while (temp != null) {
            System.out.print("["+temp.key+","+temp.value+"]" + "->");
            temp = temp.next;
        }
        System.out.print(" Null");
    }
    
    G get(LinkedList l , T key){
        HashEntry<T,G> temp = head;

        while (temp != null) {
            if(temp.key.equals(key)){
                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }
    
    int size(){
        int size = 0;
        HashEntry<T,G> temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }
            
    
}
