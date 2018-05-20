package algos.arrayreverse;

import java.util.Arrays;

/**
 * 20.05.2018
 * ArrayReverse
 *
 * @author Victoria Noumenko
 * @version v1.0
 */

public class ArrayReverse {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 9, 5, 1, 7};
        reverse(numbers);
    }


    public static void reverse(int[] input) {
        System.out.println("original array : " + Arrays.toString(input));
        if (input == null || input.length <= 1) {
            return;
        }
        for (int i = 0; i < input.length / 2; i++) {
            int temp = input[i];
            input[i] = input[input.length - 1 - i];//swap
            input[input.length - 1 - i] = temp;
        }
        System.out.println("reversed array : " + Arrays.toString(input));
    }
}
