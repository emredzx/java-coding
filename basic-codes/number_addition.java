import java.util.Scanner;

public class number_addition {
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = console.nextInt();
        int sum = 0;
        do {
            sum += (number % 10);
            number /= 10;
        }while (number > 0);
        System.out.print("Sum of the digits of the number is : "+sum);
    }
}
