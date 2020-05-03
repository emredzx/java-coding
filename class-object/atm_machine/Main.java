package atm_machine;

public class Main {
    public static void main(String[] args){
        ATM atm = new ATM();
        Account account = new Account("emredzx", "123456",10000);
        atm.working(account);
    }
}
