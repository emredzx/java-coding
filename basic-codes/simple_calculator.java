import java.util.Scanner;

public class simple_calculator {
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        String operations = "********************************\n"
                            +"Addition symbol : +\n"
                            +"Subtraction symbol : -\n"
                            +"Multiplication symbol : *\n"
                            +"Division symbol : /\n"
                            +"********************************";
        System.out.println(operations);
        System.out.print("Enter the symbol of operation : ");
        String operation = console.nextLine();
        int x,y,sum;
        switch (operation){
            case "+":
                System.out.print("First number : ");
                x = console.nextInt();
                System.out.print("Second number : ");
                y = console.nextInt();
                sum = x + y;
                System.out.print("Result : "+sum);
                System.out.print("\n********************************");
                break;
            case "-":
                System.out.print("First number : ");
                x = console.nextInt();
                System.out.print("Second number : ");
                y = console.nextInt();
                sum = x - y;
                System.out.print("Result : "+sum);
                System.out.print("\n********************************");
                break;
            case "*":
                System.out.print("First number : ");
                x = console.nextInt();
                System.out.print("Second number : ");
                y = console.nextInt();
                sum = x * y;
                System.out.print("Result : "+sum);
                System.out.print("\n********************************");
                break;
            case "/":
                System.out.print("First number : ");
                double a = console.nextDouble();
                System.out.print("Second number : ");
                double b = console.nextDouble();
                double res = a / b;
                System.out.print("Result : "+res);
                System.out.print("\n********************************");
                break;
            default:
                System.out.print("Invalid operation");
                System.out.print("\n********************************");
                break;
        }

    }
}
