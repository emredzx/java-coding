package atm_machine;

import java.util.Scanner;

public class Login {
    public boolean login(Account account){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the username : ");
        String username = console.nextLine();
        System.out.print("Enter the password : ");
        String password = console.nextLine();
        return account.getUsername().equals(username) && account.getPassword().equals(password);
    }
}
