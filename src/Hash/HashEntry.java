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
public class HashEntry <T, G>{
    T key;
    G value;
    HashEntry <T,G> next;
    public HashEntry(T key, G value) {
        this.key = key;
        this.value = value;
    }
    
}
