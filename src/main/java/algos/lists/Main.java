package algos.lists;

/**
 * 18.03.2018
 * Main
 *
 * @author Victoria Noumenko
 * @version v1.0
 */

public class Main {

    public static void main(String[] args) {
    ArrayList array = new ArrayList();
    array.addToEnd(10);
    array.addToEnd(15);
    array.addToEnd(10);
    array.addToEnd(10);
    array.addToEnd(10);
    array.addToEnd(10);
    array.addToEnd(10);
    array.addToEnd(10);
    array.addToEnd(10);
    array.addToEnd(10);
    array.addToEnd(10);

    ArrayList otherArray = new ArrayList();
    otherArray.addToEnd(1);
    otherArray.addToEnd(5);
    otherArray.addToEnd(0);
    otherArray.addToBegin(11);

    otherArray.addByIndex(777, 3);

    otherArray.reverse();

    array.show();
    otherArray.show();
}
}