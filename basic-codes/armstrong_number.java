import java.util.Scanner;

public class armstrong_number {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = console.nextInt();
        int tmp = number;
        int temp = number;
        int sum = 0;
        int count = 0;
        while (tmp != 0) {
            tmp /= 10;
            count++;
        }
        do{
            int digit_value = temp % 10;
            temp /= 10;
            sum += Math.pow(digit_value,count);
        }while (temp > 0);
        if (number == sum) {
            System.out.print(number + " is an Armstrong number.");
        }
        else {
            System.out.print(number + " is not an Armstrong number.");
        }
    }
}
