public class Account {
    private String accNumber;
    private double balance;
    private String accName;
    private String email;
    private String phoneNumber;

    //constructor
    public Account(String accNumber,double balance,String accName,String email,String phoneNumber){
        this.accNumber = accNumber;
        this.balance = balance;
        this.accName = accName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public void sumAccount(){
        System.out.println("Account number is : " + this.accNumber);
        System.out.println("Account balance is : " + this.balance);
        System.out.println("Account name is : " + this.accName);
        System.out.println("Account e-mail is : " + this.email);
        System.out.println("Account phone number is : " + this.phoneNumber);
    }
    public void moneyDeposit(double money){
        this.balance += money;
        System.out.println("New balance is : " + this.balance);
    }
    public void moneyWithdraw(double money){
        if(money > this.balance){
            System.out.println("You have not enough money. Your money is : " + this.balance);
        }
        else{
            this.balance -= money;
            System.out.println("New balance is : " + this.balance);
        }
    }
    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public static void main(String[] args){
        Account account1 = new Account("31256075",10000,"Emre Dönmez","emredzx@emredzx.com","+00(000) 000 00 00");
        account1.sumAccount();
        System.out.println("********************************************************");
        account1.moneyDeposit(3000);
        System.out.println("********************************************************");
        account1.sumAccount();
        System.out.println("********************************************************");
        account1.moneyWithdraw(10000);
        System.out.println("********************************************************");
        account1.sumAccount();
        System.out.println("********************************************************");
    }
}