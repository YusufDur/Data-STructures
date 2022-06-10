package Queue1;

public class Node<T> {

    T data;
    Node<T> nextNode;

    public Node(T data) {
        this.data = data;
        this.nextNode = null;
    }

}