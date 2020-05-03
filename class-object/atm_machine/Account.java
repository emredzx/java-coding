package atm_machine;

public class Account {

    private String username;
    private String password;
    private double balance;

    public Account(String username, String password, double balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }
    public void moneyDeposit(double money){
        this.balance += money;
        System.out.println("New balance is : " + this.balance);
    }
    public void moneyWithdraw(double money){
        if(money > this.balance){
            System.out.println("Insufficient balance. Your balance is : " + this.balance);
        }
        else {
            this.balance -= money;
            System.out.println("Your new balance is : " + this.balance);
        }
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
