import java.util.Scanner;

public class TypeMain {
    public static void main(String[] args) {
        /* Your code here!*/
        String s_type;
        Scanner scanner = new Scanner(System.in);
        s_type = scanner.nextLine();
        scanner.close();

        // 스캐너로 입력 받기
        printType(s_type);
        System.out.println("Type conversion to int...");
        // printType() 호출
        int i_type = Integer.valueOf(s_type);
        printType(i_type);
        System.out.println("Type conversion int to float...");
        // 형변환 ( String --> int)
        float f_type = (float) i_type;
        printType(f_type);
        // 형변환 ( int --> float)
    }
    private static void printType(String x) {
        System.out.println(x + " is a string");
    }
    private static void printType(int x) {
        System.out.println(x + " is an int");
    }
    private static void printType(float x) {
        System.out.println(x + " is a float");
    }
}