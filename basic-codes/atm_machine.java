import java.util.Scanner;

public class atm_machine {
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the balance : ");
        double money = console.nextDouble();
        String information = "********************************\n"
                            +"Show balance : 1\n"
                            +"Make withdraw : 2\n"
                            +"Deposit money : 3\n"
                            +"EXIT : q\n"
                            +"********************************\n";
        System.out.print(information);
        console.nextLine();
        while (true){
            System.out.print("Choose the operation : ");
            String operation = console.nextLine();
            if (operation.equals("1")){
                System.out.println("Your balance : "+money);
                System.out.println("********************************");
            }
            else if (operation.equals("2")){
                System.out.print("Enter money to be withdrawn : ");
                double withdrawn = console.nextDouble();
                console.nextLine();
                if (money - withdrawn < 0){
                    System.out.println("Insufficient balance. Your balance is : " + money);
                    System.out.println("********************************");
                }
                else{
                    money -= withdrawn;
                    System.out.println("New balance is : " + money);
                    System.out.println("********************************");
                }
            }
            else if (operation.equals("3")){
                System.out.print("Enter money to be deposited : ");
                double deposit = console.nextDouble();
                console.nextLine();
                money += deposit;
                System.out.println("New balance is : " + money);
                System.out.println("********************************");
            }
            else if (operation.equals("q")){
                System.out.println("Goodbye...");
                System.out.print("********************************");
                break;
            }
            else {
                System.out.println("Invalid operation.");
                System.out.println("********************************");
            }
        }
    }
}
