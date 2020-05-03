import java.util.Scanner;

public class bmi_conditions {
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Weight (kg) (example : 56,8) : ");
        double weight = console.nextDouble();
        System.out.print("Height (m) (example : 1,74) : ");
        double height = console.nextDouble();
        double bmi = weight / (height*height);
        System.out.println("\nBody Mass Index = "+bmi);
        if (bmi<18.5){
            System.out.println("You're in the underweight range");
        }
        else if(bmi>=18.5 && bmi<25){
            System.out.println("You're in the healthy weight range");
        }
        else if (bmi>=25 && bmi<30){
            System.out.println("You're in the overweight range");
        }
        else{
            System.out.println("You're in the obese range");
        }
    }
}
