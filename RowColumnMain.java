import java.util.Scanner;
public class RowColumnMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int st= scanner.nextInt();
        int st2= scanner.nextInt();
        int st3;
        scanner.close();


        for (int i = 1; i <=st ; i++) {
            System.out.println();
            System.out.print(1+st2*(i-1));
            st3 = 1+st2*(i-1);

            for (int j = 1; j < st2; j++) {
                System.out.print(","+((st3+j)));
            }
        }

            }

        }

