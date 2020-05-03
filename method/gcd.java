import java.util.Scanner;

public class gcd {
    public static int gcd_finder(int x,int y){
        int gcd = 1;
        for (int i = 1; i <= x && i <= y; i++){
            if ((x % i == 0) && (y % i == 0)){
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int x = console.nextInt();
        System.out.print("Enter the second number : ");
        int y = console.nextInt();
        System.out.print("GCD is : " + gcd_finder(x,y));
    }
}
