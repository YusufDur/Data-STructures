/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTS;

/**
 *
 * @author yusuf.dur
 */
public class BST<T extends Comparable<T>> {

    Node<T> root;

    void insert(T data) {

        if (root == null) {
            root = new Node<>(data);
        } else {
            Node<T> temp = root;
            //Node<T> newNode = new Node<>(data);
            while (temp != null) {
                if (temp.data.compareTo(data) < 0) {
                    if (temp.right == null) {
                        temp.right = new Node(data);
                        return;
                    }
                    temp = temp.right;
                } else if (temp.data.compareTo(data) > 0) {
                    if (temp.left == null) {
                        temp.left = new Node(data);
                        return;
                    }
                    temp = temp.left;
                } else {
                    System.out.println("aynı veri eklenemez");
                    return;
                }
            }
        }
    }

    Node<T> insert(T data, Node<T> temp) {

        if (temp == null) {
            temp = new Node<>(data);
            return temp;
        } else {
            if (data.compareTo(temp.data) > 0) {
                temp.right = insert(data, temp.right);
            } else if (data.compareTo(temp.data) < 0) {
                temp.left = insert(data, temp.left);
            }
            return temp;
        }
    }

    T min() {
        Node<T> temp = root;
        if (temp == null) {
            System.out.println("liste bos");
        }
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp.data;

    }

    T min(Node<T> n) {
        if (n == null) {
            return null;
        }
        if (n.left == null) {
            return n.data;
        }
        return min(n.left);

    }

    T max() {
        Node<T> temp = root;
        if (temp == null) {
            System.out.println("liste bos");
        }
        while (temp.right != null) {
            temp = temp.right;
        }
        return temp.data;

    }

    Node<T> deleteRec(T key, Node<T> temp) {

        if (temp == null) {
            return null;
        } else {
            if (key.compareTo(temp.data) > 0) {
                temp.right = deleteRec(key, temp.right);
            } else if (key.compareTo(temp.data) < 0) {
                temp.left = deleteRec(key, temp.left);
            } else {
                if (temp.left == null) {
                    temp = temp.right;
                } else if (temp.right == null) {
                    temp = temp.left;

                } else {
                    temp.data = min(temp.right);
                    temp.right = deleteRec(temp.data, temp.right);

                }
            }
        }

        return temp;
    }

    void preorder(Node<T> temp) {
        if (temp == null)
            return;
        System.out.println(temp.data);
        preorder(temp.left);
        preorder(temp.right);

    }

    void inorder(Node<T> temp) {
        if (temp == null)
            return;
        inorder(temp.left);
        System.out.println(temp.data);
        inorder(temp.right);

    }

    void postorder(Node<T> temp) {
        if (temp == null)
            return;
        postorder(temp.left);
        postorder(temp.right);
        System.out.println(temp.data);
    }

}