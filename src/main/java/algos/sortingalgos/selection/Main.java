package algos.sortingalgos.selection;

import java.util.Random;

/**
 * 18.03.2018
 * Main
 *
 * @author Victoria Noumenko
 * @version v1.0
 */

public class Main {


    public static void main(String[] args) {
        int randomNumbers [] = new int[10];
        Random random = new Random();

        for(int i=0;i< randomNumbers.length;i++)
        {
            randomNumbers[i] = random.nextInt(10);
            System.out.print(randomNumbers [i]+ " ");
        }
        SelectionSort(randomNumbers);
        System.out.println(" ");
        for(int i=0; i < randomNumbers.length; i++){
            System.out.print(randomNumbers[i] + " ");
        }
    }

    public static int[] SelectionSort(int[] arrayToSort) {
        int index =0;//мин элем
        int min = 0;
        for(int i=0; i < arrayToSort.length; i++){
            min = arrayToSort[i];
            index = i;
            for(int j=i+1; j < arrayToSort.length; j++){
                if(arrayToSort[j] < min){
                    index = j;
                    min = arrayToSort[j];
                }
            }
            if(arrayToSort[i]!=arrayToSort[index]){
                arrayToSort[index] = arrayToSort[i];
                arrayToSort[i]=min;
            }
        }

        return arrayToSort;
    }

}
