package employees;

public class Manager extends Employee{
    private int groupnumber;
    public Manager(String name, String surname, int id,int groupnumber) {
        super(name, surname, id);
        this.groupnumber = groupnumber;
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Group number : " + this.groupnumber);
    }
    public void salaryInc(double money){
        System.out.println(getName() + " said that new rise is incoming.." + money + " Added to salaries...Thank you " + getName() + " " +  getSurname() + "..<3");
    }
}
