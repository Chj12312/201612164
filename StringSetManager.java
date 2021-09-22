import java.util.*;

enum StringCommand {ADD,SORT,REMOVE,CLEAN,QUIT,INVALID}

public class StringSetManager {

    public static void main(String[] args){

        final Scanner scanner =  new Scanner(System.in);
        List<String> list = new ArrayList<String>();

        while(true){

            final StringCommand command = getCommand(scanner);

            if( command == StringCommand.QUIT){
                System.out.println("BYE!");
                break;
            }
            if( command == StringCommand.INVALID){
                System.out.println("Invalid!!");
                break;
            }

            switch (command){
                case ADD: {
                    final String str = getString(scanner);
                    add(list, str);
                    break;
                }
                case SORT: {
                    final String str = getString(scanner);
                    sort(list, str);
                    break;
                }
                case REMOVE: {
                    final String str = getString(scanner);
                    remove(list, str);
                    break;
                }
                case CLEAN: {
                    clean(list);
                    break;
                }
            }
            System.out.println("Element Size: " + list.size() + ", Values = " + list);
        }


    }


    private static String getString(Scanner a){

        String str = a.next();

        return str;
    }
    private static void add(List<String> arr, String a){

        if (!arr.contains(a)){
            arr.add(a);
        }
    }
    private static void remove(List<String> arr, String a){
        arr.remove(a);
    }
    private static void clean(List<String> arr){
        arr.clear();
    }
    private static void sort(List<String> arr, String a){

        if(a.toLowerCase(Locale.ROOT).equals("asc")){
            Collections.sort(arr);
        }else if (a.toLowerCase(Locale.ROOT).equals("desc")) {
            arr.sort(Comparator.reverseOrder());
        }
    }
    private static StringCommand getCommand(Scanner a){

        StringCommand sc = null;
        String str = a.next();

        switch (str.toLowerCase(Locale.ROOT)){

            case "add": {
                sc = StringCommand.ADD;
                break;
            }
            case "sort": {
                sc = StringCommand.SORT;
                break;
            }
            case "remove": {
                sc = StringCommand.REMOVE;
                break;
            }
            case "clean": {
                sc = StringCommand.CLEAN;
                break;
            }
            case "quit": {
                sc = StringCommand.QUIT;
                break;
            }
            default: {
                sc = StringCommand.INVALID;
                break;
            }
        }
        return sc;
    }
}