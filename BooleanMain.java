import java.util.Scanner;

public class BooleanMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] cmd = scanner.nextLine().split(" ");
        int a = Integer.parseInt(cmd[0]);
        int b = Integer.parseInt(cmd[1]);

        System.out.println("Number1 : " + a + ", Number2 : " + b);

        printLarge(a,b);
        printSmall(a,b);
        printEqual(a,b);

    }
    private static void printLarge(int x, int y){
        boolean bool;

        if(x > y){
            bool = true;
        }else{bool = false;}

        System.out.println("Number1 > Number2 ? "+ bool);
    }
    private static void printSmall(int x, int y){
        boolean bool;

        if(x < y){
            bool = true;
        }else{bool = false;}

        System.out.println("Number1 < Number2 ? "+bool);
    }
    private static void printEqual(int x, int y){
        boolean bool;

        if(x == y){
            bool = true;
        }else{bool = false;}

        System.out.println("Number1 = Number2 ? "+bool);
    }
}