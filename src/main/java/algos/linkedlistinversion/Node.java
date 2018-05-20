package algos.linkedlistinversion;

/**
 * 20.05.2018
 * Node
 *
 * @author Victoria Noumenko
 * @version v1.0
 */

public class Node {
    public Node next;
    public int v;

    public Node(int v, Node next) {
        this.v = v;
        this.next = next;
    }

    public static Node reverse(Node n) {
        Node first = n;
        Node second = n.next;
        Node third = second.next;

        first.next = null;
        second.next = first;

        Node current = third;
        Node previous = second;

        while (current != null) {
            Node next = current.next;
            current.next = previous;

            previous = current;
            current = next;
        }

        return previous;
    }
}
