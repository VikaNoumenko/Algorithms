package algos.stack;

/**
 * 18.03.2018
 * Main
 *
 * @author Victoria Noumenko
 * @version v1.0
 */

public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        stack.push('a');
        stack.push('b');
        stack.push('c');

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
