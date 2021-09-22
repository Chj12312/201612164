import java.util.*;

enum Shape{TRIANGLE, RECTANGLE, CIRCLE, QUIT, INVALID}

public class AreaCalculator {
    public static void main(String[] args){

        final Scanner scanner = new Scanner(System.in);

        while (true){

            final Shape shape = getShape(scanner);
            double area;

            switch (shape){

                case TRIANGLE :{
                    final double base = scanner.nextDouble();
                    final double height = scanner.nextDouble();
                    area = tri(base, height);
                    System.out.println("Area of Triangle: " + String.format("%.2f",area));
                    break;
                }
                case RECTANGLE :{
                    final double width = scanner.nextDouble();
                    final double height = scanner.nextDouble();
                    area = rec(width, height);
                    System.out.println("Area of Rectangle: " + String.format("%.2f",area));
                    break;
                }
                case CIRCLE :{
                    final double radius = scanner.nextDouble();
                    area = cir(radius);
                    System.out.println("Area of Circle: " + String.format("%.2f",area));
                    break;
                }
            }
            if( shape == Shape.QUIT){
                System.out.println("BYE!");
                break;
            }
            if( shape == Shape.INVALID){
                System.out.println("Invalid!!");
            }
        }
    }
    private static double tri(double a, double b){
        double area;

        area = (a*b)/2;

        return area;

    }
    private static double rec(double a, double b){
        double area;

        area = a*b;

        return area;
    }
    private static double cir(double a){
        double area;

        area = a*a*Math.PI;

        return area;
    }

    private static Shape getShape(Scanner sc){
        Shape s = null;
        String str = sc.next();

        switch (str.toLowerCase(Locale.ROOT)){

            case "triangle": {
                s = Shape.TRIANGLE;
                break;
            }
            case "rectangle": {
                s = Shape.RECTANGLE;
                break;
            }
            case "circle": {
                s = Shape.CIRCLE;
                break;
            }
            case "quit":{
                s= Shape.QUIT;
                break;
            }
            default: {
                s = Shape.INVALID;
                break;
            }
        }
        return s;
    }
}