import java.util.Scanner;

public class body_mass_index {
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Weight (kg) (example : 56,8) : ");
        double weight = console.nextDouble();
        System.out.print("Height (m) (example : 1,74) : ");
        double height = console.nextDouble();
        double bmi = weight / (height*height);
        System.out.println("\nBody Mass Index = "+bmi);
        System.out.println("\n" +
                "    below 18.5 – you're in the underweight range\n" +
                "    between 18.5 and 24.9 – you're in the healthy weight range\n" +
                "    between 25 and 29.9 – you're in the overweight range\n" +
                "    30+ – you're in the obese range");
    }
}
