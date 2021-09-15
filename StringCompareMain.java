import java.util.Locale;
import java.util.Scanner;

public class StringCompareMain {
    public static void main(String[] args){
        String str1, str2;

        Scanner scanner = new Scanner(System.in);

        str1 = scanner.nextLine();
        str2 = scanner.nextLine();//문자열 입력

        printEquals(str1,str2);//일치 비교

        printEqualsIgnoreCase(str1,str2);//대소문자 무시 일치 비교

        printLowerCase(str1,str2);//소문자 변경 일치 비교

        printSwitch(str1,str2);//문자열 치환 일치 비교

    }
    private static void printEquals(String x,String y) {

        boolean bool;
        bool = x.equals(y);

        System.out.println(bool);
    }
    private static void printEqualsIgnoreCase(String x,String y) {

        boolean bool;
        bool = x.equalsIgnoreCase(y);

        System.out.println(bool);
    }
    private static void printLowerCase(String x,String y) {

        boolean bool;
        y = y.toLowerCase(Locale.ROOT);
        bool = x.equals(y);

        System.out.println(bool);
    }
    private static void printSwitch(String x,String y) {

        boolean bool;
        x = x.replace("easy","fun");
        bool = x.equalsIgnoreCase(y);

        System.out.println(bool);
    }
}