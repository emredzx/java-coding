package beyblade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to beyblade program...");
        System.out.println("Beyblades are : 'Dragoon' , 'Draciel' , 'Driger' , 'Dranzer'");
        System.out.println("For exit press 'q'");
        System.out.println("*********************************************");
        Scanner console = new Scanner(System.in);
        while (true){
            System.out.print("Enter the beyblade that you want to produce : ");
            String operation = console.nextLine();
            if (operation.equals("q")){
                System.out.println("Exiting...");
                break;
            }
            else{
                Factory factory = new Factory();
                Beyblade beyblade = factory.createBeyblade(operation);
                if (beyblade == null){
                    System.out.println("Enter a valid beyblade name...");
                }
                else {
                    beyblade.showInfo();
                    beyblade.attack();
                    beyblade.releaseBeast();
                }
            }
        }
    }
}
