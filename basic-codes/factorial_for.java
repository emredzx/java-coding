import java.util.Scanner;

public class factorial_for {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int fact = console.nextInt();
        int sum = 1;
        for (int i = 1;i<=fact;i++){
            sum = sum*i;
        }
        System.out.print(fact+"! = "+sum);
    }
}
