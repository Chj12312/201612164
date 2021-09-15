
import java.util.Scanner;

public class OperatorMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] cmd = scanner.nextLine().split(" ");
        int dividend = Integer.parseInt(cmd[0]);
        int divisor = Integer.parseInt(cmd[1]);
        scanner.close();//정수 2개 입력

        printQuotient(dividend,divisor);//나눗셈 결과

        printDivision(dividend,divisor);//피제수 표현

    }
    private static void printQuotient(int x, int y) {
        double q;

        q =  (double)x/y;

        System.out.println(x + " / " + y + " = " + String.format("%.3f",q));
    }
    private static void printDivision(int x, int y) {

        int q,r;

        q = x/y;
        r = x%y;

        System.out.println(x+" = " + q + " x " + y + " + " + r);
    }
}