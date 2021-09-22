import java.util.*;

enum Command{ADD, PRINT, QUIT,INVALID}

public class SwitchMain2 {
    public static void main(String[] args){

        final Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while (true){

            final Command command = getCommand(scanner);

            switch (command){

                case ADD :{
                    final String m = getMonth(scanner);
                    setMonth(list, m);
                    break;
                }
                case PRINT :{
                    System.out.println(list);
                    break;
                }
            }
            if( command == Command.QUIT){
                System.out.println("Bye");
                break;
            }
            if( command == Command.INVALID){
                System.out.println("Invalid Command");
            }
        }
    }

    private static String getMonth(Scanner sc){
        String m = "";
        int i = sc.nextInt();

        switch (i){
            case 1: {
                m = "January";
                break;
            }
            case 2: {
                m = "February";
                break;
            }
            case 3: {
                m = "March";
                break;
            }
            case 4: {
                m = "April";
                break;
            }
            case 5: {
                m = "May";
                break;
            }
            case 6: {
                m = "June";
                break;
            }
            case 7: {
                m = "July";
                break;
            }
            case 8: {
                m = "August";
                break;
            }
            case 9: {
                m = "September";
                break;
            }
            case 10: {
                m = "October";
                break;
            }
            case 11: {
                m = "November";
                break;
            }
            case 12: {
                m = "December";
                break;
            }
        }
        return m;
    }
    private static List setMonth(List<String> arr, String a){

        arr.add(a);

        return arr;
    }
    private static Command getCommand(Scanner sc){
        Command c = null;
        String str = sc.next();

        switch (str.toLowerCase(Locale.ROOT)){

            case "add": {
                c = Command.ADD;
                break;
            }
            case "print": {
                c = Command.PRINT;
                break;
            }
            case "quit":{
                c = Command.QUIT;
                break;
            }
            default: {
                c = Command.INVALID;
                break;
            }
        }
        return c;
    }
}