package algos.queue;

/**
 * 18.03.2018
 * Main
 *
 * @author Victoria Noumenko
 * @version v1.0
 */

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue('a');
        queue.enqueue('b');
        queue.enqueue('c');

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
