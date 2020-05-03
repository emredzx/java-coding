package employees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner console  = new Scanner(System.in);
        System.out.println("Welcome to employees program...");
        String operations = "**************************************\n"
                            +"Developer operations : 1\n"
                            +"Manager operations : 2\n"
                            +"For exit press 'q'\n"
                            +"**************************************";
        System.out.println(operations);
        while (true){
            System.out.print("Choose the operation : ");
            String operation = console.nextLine();
            if (operation.equals("q")){
                System.out.print("Exiting...");
                break;
            }
            else if (operation.equals("1")){
                Developer developer = new Developer("Emre","Dönmez",6,"Java,Python");
                String operations1 = "**************************************\n"
                                    +"Writing program : 1\n"
                                    +"Show informations : 2\n"
                                    +"For exit press 'q'\n"
                                    +"**************************************";
                System.out.println(operations1);
                while (true){
                    System.out.print("Enter the developer operation : ");
                    String operation1 = console.nextLine();
                    if (operation1.equals("q")){
                        System.out.println("Exiting from developer operations...");
                        break;
                    }
                    else if(operation1.equals("1")){
                        System.out.print("Enter the program name : ");
                        String progname = console.nextLine();
                        developer.writeProg(progname);
                    }
                    else if(operation1.equals("2")) {
                        developer.showInfo();
                    }
                    else{
                        System.out.println("Enter a valid developer operation...");
                    }
                }
            }
            else if (operation.equals("2")){
                Manager manager = new Manager("Pamir","Erdem",7,1);
                String operations2 = "**************************************\n"
                        +"Show informations : 1\n"
                        +"For salary increase : 2\n"
                        +"For exit press 'q'\n"
                        +"**************************************";
                System.out.println(operations2);
                while (true){
                    System.out.print("Enter the manager operation : ");
                    String operation2 = console.nextLine();
                    if (operation2.equals("q")){
                        System.out.println("Exiting from manager operations...");
                        break;
                    }
                    else if(operation2.equals("1")){
                        manager.showInfo();
                    }
                    else if(operation2.equals("2")){
                        System.out.print("Enter the amount of money : ");
                        double money = console.nextInt();
                        console.nextLine();
                        manager.salaryInc(money);
                        }
                    else {
                        System.out.println("Enter a valid manager operation...");
                     }
                    }
                }
            else{
                System.out.println("Enter a valid operation...");
            }
        }
    }
}
