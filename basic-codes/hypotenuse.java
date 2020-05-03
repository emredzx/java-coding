import java.util.Scanner;

public class hypotenuse {
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        double a,b;
        System.out.print("First leg : ");
        a = console.nextDouble();
        System.out.print("Second leg : ");
        b = console.nextDouble();
        double hypo = Math.sqrt((a*a) + (b*b));
        System.out.println("\nHypotenuse = "+hypo);
    }
}
