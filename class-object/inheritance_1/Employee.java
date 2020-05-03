package inheritance_1;

public class Employee { // SUPERCLASS

    private String name;
    private String department;
    private double salary;

    public Employee(String name,String department,double salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public void work(){
        System.out.println("**************************************");
        System.out.println("Employee named " + this.name + " in the department of "+ this.department + " started to working.");
        System.out.println("**************************************");
    }
    public void showInfo(){
        String info = "Employee name : " + this.name+"\n"
                    +"Department : " + this.department +"\n"
                    +"Salary : " + this.salary;
        System.out.println("**************************************");
        System.out.println(info);
        System.out.println("**************************************");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void type(){
        System.out.println("**************************************");
        System.out.println("This is an employee type of object.");
        System.out.println("**************************************");
    }

}
