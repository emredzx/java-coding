package atm_machine;

import java.util.Scanner;

public class ATM {
    public void working(Account account){
        Login login = new Login();
        Scanner console = new Scanner(System.in);
        System.out.println("You're Welcome..");
        System.out.println("*****************************");
        System.out.println("User Login");
        System.out.println("*****************************");
        int counter = 3;
        while (true){
            if (login.login(account)){
                System.out.println("Access Granted.");
                System.out.println("********************************");
                break;
            }
            else{
                System.out.println("Signup Failed.");
                counter -= 1;
                System.out.println("You have "+counter+" remaining attempts.");
                System.out.println("********************************");
            }
            if (counter == 0){
                System.out.println("Access denied..");
                System.out.println("Maximum number of attempts exceeded.");
                System.out.println("********************************");
                return;
            }
        }
        String information = "********************************\n"
                +"Show balance : 1\n"
                +"Make withdraw : 2\n"
                +"Deposit money : 3\n"
                +"EXIT : q\n"
                +"********************************\n";
        System.out.print(information);
        while (true){
            System.out.print("Choose the operation : ");
            String operation = console.nextLine();
            if (operation.equals("1")){
                System.out.println("Your balance : "+account.getBalance());
                System.out.println("********************************");
            }
            else if (operation.equals("2")){
                System.out.print("Enter money to be withdrawn : ");
                double withdrawn = console.nextDouble();
                console.nextLine();
                account.moneyWithdraw(withdrawn);
                System.out.println("********************************");
                }
            else if (operation.equals("3")){
                System.out.print("Enter money to be deposited : ");
                double deposit = console.nextDouble();
                console.nextLine();
                account.moneyDeposit(deposit);
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
