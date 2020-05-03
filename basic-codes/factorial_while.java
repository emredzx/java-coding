import java.util.Scanner;

public class factorial_while {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int fact = console.nextInt();
        int cfact = fact;
        int sum = 1;
        while (fact > 0){
            sum *= fact;
            fact--;
        }
        System.out.print(cfact+"! = "+sum);
    }
}
