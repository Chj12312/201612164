import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayCopyMain {
    public static void main(String[] args) {
        //입력으로부터 배열을 생성하시오
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        //shallow copy 수행 코드를 작성하시오
        modifyArray(arr, 1);
        System.out.println("Shallow Copy: " + Arrays.toString(arr));

        //deep copy 수행 코드를 작성하시오
        modifyArray(arr, 1);
        System.out.println("Deep Copy: " + Arrays.toString(arr));
    }

    private static void modifyArray(int[] array, int index){
        array[index] = 15;
    }
}
