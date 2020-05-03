import java.util.Scanner;

public class bigger_number {
    public static void main (String[] args){
        Scanner console  = new Scanner(System.in);
        System.out.print("First number : ");
        int a = console.nextInt();
        System.out.print("Second number : ");
        int b = console.nextInt();
        System.out.print("Third number : ");
        int c = console.nextInt();
        if (a>=b && a>=c){
            System.out.print("Bigger number is : " + a);
        }
        else if (b>=a && b>=c){
            System.out.print("Bigger number is : " + b);
        }
        else  {
            System.out.print("\nBigger number is : " + c);
        }

    }
}
