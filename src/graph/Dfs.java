/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

/**
 *
 * @author fsmblm0
 */
public class Dfs <T>{
    void dfsIterative(Node <T> startNode){
        Stack <Node<T>> stack=new Stack<>();
        stack.push(startNode);
        startNode.visited=true;
        
        while(!stack.isEmpty()){
            Node<T> pop=stack.pop();
            System.out.print(pop.data+" ");
            
            for (Node<T> neighbour : pop.getNeighbourList()) {
                if(!neighbour.visited){
                    stack.push(neighbour);
                    neighbour.visited=true;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Node<String> ns=new Node("S");
        Node<String> na=new Node("A");
        Node<String> nb=new Node("B");
        Node<String> nc=new Node("C");
        Node<String> nd=new Node("D");
        Node<String> ne=new Node("E");
        Node<String> ng1=new Node("G1");
        Node<String> ng2=new Node("G2");
        
        ns.addNeighbour(nb);
        ns.addNeighbour(na);
        
        na.addNeighbour(nd);
        na.addNeighbour(nc);
        
        nc.addNeighbour(nd);
        nc.addNeighbour(ns);
        
        nb.addNeighbour(ng2);
        nb.addNeighbour(ne);
        
        nd.addNeighbour(nb);
        nd.addNeighbour(ng1);
        
        ne.addNeighbour(ng2);
        
        ng1.addNeighbour(nc);
        ng2.addNeighbour(nb);
        
        Dfs<String> dfs=new Dfs();
        dfs.dfsIterative(ns);
    }
}
