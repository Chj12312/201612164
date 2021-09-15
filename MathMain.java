import java.util.Arrays;
import java.util.Scanner;

public class MathMain {
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int[] inputs = new int[input];

        for(int i = 0 ; i < input ; i++){
            inputs[i] = sc.nextInt();
        }

        System.out.println("Enter N:");
        int max = getMax(inputs);
        System.out.println("Max element : " + max + " in " + Arrays.toString(inputs));
        int min = getMin(inputs);
        System.out.println("Min element : " + min + " in " + Arrays.toString(inputs));
    }

    private static int getMax(int[] a){

        int max = a[0];

        for(int i = 0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }

        return max;
    }
    private static int getMin(int[] a){
        int min = a[0];

        for(int i = 0;i<a.length;i++){
            if(a[i]<min){
                min = a[i];
            }
        }

        return min;
    }
}