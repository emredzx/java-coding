import java.util.Scanner;

public class user_login {
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        String sys_username = "emredz";
        String sys_password = "123456";
        int counter = 3;
        System.out.println("******************************");
        System.out.println("Welcome to user login...");
        System.out.println("You have 3 attempts..");
        System.out.println("******************************");
        while (true){
            System.out.print("Username : ");
            String username = console.nextLine();
            System.out.print("Password : ");
            String password = console.nextLine();
            if (username.equals(sys_username) && password.equals(sys_password)){
                System.out.println("Hello, you're welcome..");
                System.out.print("******************************");
                break;
            }
            else if (username.equals(sys_username) && !password.equals(sys_password)){
                counter -= 1;
                System.out.println("You have entered wrong password..");
                System.out.println("You have "+ counter + " remaining attempts..");
                System.out.println("******************************");
            }
            else if (!username.equals(sys_username) && password.equals(sys_password)){
                counter -= 1;
                System.out.println("You have entered wrong username..");
                System.out.println("You have "+ counter + " remaining attempts..");
                System.out.println("******************************");

            }
            else{
                counter -= 1;
                System.out.println("You have entered wrong username and password..");
                System.out.println("You have "+ counter + " remaining attempts..");
                System.out.println("******************************");
            }
            if (counter == 0) {
                System.out.println("Access denied..");
                System.out.println("Maximum number of attempts exceeded.");
                System.out.print("******************************");
                break;
            }
        }
    }
}
