package inheritance_1;

public class Main {
    public static void main(String[] args){
        Manager manager1 = new Manager("emredzx","SE",5000,3);
        manager1.showInfo();
        manager1.work();
        manager1.showTeam();
        Employee employee1 = new Employee("dzxemre","IT",5000);
        employee1.showInfo();
        employee1.work();
        //this method is not defined for employee class : employee1.showTeam();
        employee1.type(); //overriding
        manager1.type(); //overriding
        //we can do overriding to showinfo method for show the number of team
    }
}
