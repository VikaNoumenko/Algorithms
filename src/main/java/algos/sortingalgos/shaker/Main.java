package algos.sortingalgos.shaker;

/**
 * 18.03.2018
 * Main
 *
 * @author Victoria Noumenko
 * @version v1.0
 */

public class Main {

    public static void main(String[] args) {
        int[] mas = new int[10];

        //input data
        for(int i = 0; i < mas.length;i++){
            mas[i] = (int) Math.round(Math.random()*100);
            System.out.print(mas[i] + " ");

        }
        //alg
        int left =1, right = mas.length - 1;
        do{
            for(int i = right; i>=left; i--){
                if(mas[i-1] > mas[i]){
                    int temp = mas[i];
                    mas[i] = mas[i-1];
                    mas[i-1] =temp;
                }
            }
            left++;
            for(int i = left; i<=right; i++){
                if(mas[i-1] > mas[i]){
                    int temp = mas[i];
                    mas[i] = mas[i-1];
                    mas[i-1] =temp;
                }
            }
            right--;
        }while(left<= right);
        //output data
        System.out.println();
        for(int i = 0; i < mas.length;i++)
            System.out.print(mas[i] + " ");

    }
}




