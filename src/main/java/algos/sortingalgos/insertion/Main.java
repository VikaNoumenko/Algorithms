package algos.sortingalgos.insertion;

/**
 * 18.03.2018
 * Main
 *
 * @author Victoria Noumenko
 * @version v1.0
 */

public class Main {

    public static void main(String[] args) {
        int[] mas = new int[5];

        //input data
        for(int i = 0; i < mas.length;i++){
            mas[i] = (int) Math.round(Math.random()*5);
            System.out.print(mas[i] + " ");

        }
        //alg
        int j,temp;
        for(int i = 0; i< mas.length; i++){
            temp = mas[i];
            for(j = i-1; j >= 0 && mas[j] > temp; j--){
                mas[j+1] = mas[j];

            }
            mas[j+1] = temp;
        }
        //output data
        System.out.println();
        for(int i = 0; i < mas.length;i++)
            System.out.print(mas[i] + " ");

    }
}

