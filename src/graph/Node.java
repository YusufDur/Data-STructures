/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.util.LinkedList;


/**
 *
 * @author fsmblm0
 */
public class Node <T>{
    T data;
    Node <T> next;
    boolean visited;
    LinkedList<Node <T>> neighbourList;
    
    public Node(T data) {
        this.data = data;
        next=null;
        visited=false;
        neighbourList=new LinkedList<>();
    }
    
    void addNeighbour(Node<T> node){
        neighbourList.add(node);
    }
    
    LinkedList<Node<T>> getNeighbourList(){
        return neighbourList;
    }
    
}
