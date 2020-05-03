package employees;

public class Employee {

    private String name;
    private String surname;
    private int id;

    public Employee(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }
    public void showInfo(){
        String info = "Employee Informations..\n"
                    +"Name : " + this.name + "\n"
                    + "Surname : " + this.surname + "\n"
                    + "ID : " + this.id ;
        System.out.println(info);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
