import java.util.Scanner;

public class sphere_volume {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the value of radius : ");
        double radius = console.nextDouble();
        double pi = 3.141592653589793;
        double volume=(4/3d)*pi*(radius*radius*radius);
        System.out.println(volume);
    }
}
