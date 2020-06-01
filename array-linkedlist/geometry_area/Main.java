package geometry_area;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String operations = "Square area : 1\n"
                            +"Triangle area : 2\n"
                            +"Circle area : 3\n"
                            +"Exit : q";
        while (true){
            System.out.println(operations);
            Shape shape;
            System.out.print("Choose that which calculation do you want : ");
            String operation  = console.nextLine();
            if (operation.equals("q")){
                System.out.println("************************************");
                System.out.println("Exiting...");
                System.out.println("************************************");
                break;
            }
            else if (operation.equals("1")){
                System.out.print("Side of square : ");
                int side = console.nextInt();
                console.nextLine();
                shape = new Square("Square",side);
                shape.areaCalculate();
            }
            else if (operation.equals("2")){
                System.out.print("Side 1 of triangle : ");
                int side1 = console.nextInt();
                System.out.print("Side 2 of triangle : ");
                int side2 = console.nextInt();
                System.out.print("Side 3 of triangle : ");
                int side3 = console.nextInt();
                console.nextLine();
                shape = new Triangle("Triangle",side1,side2,side3);
                shape.areaCalculate();
        }
            else if (operation.equals("3")){
                System.out.print("Radius of circle : ");
                int radius = console.nextInt();
                console.nextLine();
                shape = new Circle("Circle",radius);
                shape.areaCalculate();
    }
            else{
                System.out.println("************************************");
                System.out.println("Enter a valid calculation..");
                System.out.println("************************************");
            }
            }
        }
}
