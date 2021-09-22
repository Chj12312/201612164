import java.lang.reflect.Array;
import java.util.*;


public class BinaryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        final int j = n;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(n > 0) { arr.add(n%2); n /= 2;
        }
        Collections.reverse(arr);
        System.out.println("Number "+j+ " in Binary Number:");

        for(int i = 0; i<arr.size(); i++) {
            System.out.print(arr.get(i));
        }






    }

}
