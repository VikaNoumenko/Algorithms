package algos.linkedlist.nodes;

/**
 * 18.03.2018
 * Node
 *
 * @author Victoria Noumenko
 * @version v1.0
 */

public class Node {
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
