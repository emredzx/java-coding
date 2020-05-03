package employees;

public class Developer extends Employee {
    private String proglang;
    public Developer(String name, String surname, int id,String proglang) {
        super(name, surname, id);
        this.proglang = proglang;
    }
    public void writeProg(String progname){
        System.out.println("Developer named " + getName() + " is working on the program named : " +progname);
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Developer languages : " +this.proglang);
    }
}
