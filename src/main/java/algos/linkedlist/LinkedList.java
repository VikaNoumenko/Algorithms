package algos.linkedlist;

import algos.linkedlist.nodes.Node;

/**
 * 18.03.2018
 * LinkedList
 *
 * @author Victoria Noumenko
 * @version v1.0
 */

public class LinkedList {
    private Node head;
    private Node tail;

    private int count;

    public LinkedList() {
        head = null;
        tail = null;
        count = 0;
    }


    public void addToTail(int value) {

        Node newNode = new Node(value);


        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = tail.getNext();
        }

        count++;
    }

    public void remove(int value) {
        Node current = head;

        while (current.getNext() != null) {
            if (current.getNext().getValue() == value) {
                current.setNext(current.getNext().getNext());
                return;
            }
            current = current.getNext();
        }
    }

    public void show() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}
