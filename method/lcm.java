import java.util.Scanner;

public class lcm {
    public static int lcm_finder(int x,int y){
        int gcd = 1;
        for (int i = 1; i <= x && i <= y; i++){
            if ((x % i == 0) && (y % i == 0)){
                gcd = i;
            }
        }
        return (x * y) / gcd;

    }
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int x = console.nextInt();
        System.out.print("Enter the second number : ");
        int y = console.nextInt();
        System.out.print("LCM is : " + lcm_finder(x,y));
    }
}
