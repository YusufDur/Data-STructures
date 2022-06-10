/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

/**
 *
 * @author yusuf.dur
 */
public class main {
    
    public static void main(String[] args) {
        Stack stack = new Stack(50);
        stack.push(6);
        stack.push(8);
        stack.push(10);
        System.out.println(stack.pop());
        stack.print();
    }
}
