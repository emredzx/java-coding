package inheritance_1;

public class Manager extends Employee{    // SUBCLASS
    private int teamnumber;
        public Manager (String name,String department,double salary,int teamnumber){
            super(name, department, salary);
            this.teamnumber = teamnumber;
        }
        public void showTeam(){
            System.out.println("**************************************");
            System.out.println("This manager is responsible from "+this.teamnumber+" team.");
            System.out.println("**************************************");
        }
        public void type(){
            System.out.println("**************************************");
            System.out.println("This is a manager type of object.");
            System.out.println("**************************************");
        }
        /*
        public void showInfo(){
            String info = "Employee name : " + getName()+"\n"
                    +"Department : " + getDepartment() +"\n"
                    +"Salary : " + getSalary() + "\n"
                    +"Number of team : " + this.teamnumber;
            System.out.println("**************************************");
            System.out.println(info);
            System.out.println("**************************************");


            //we can ride the same info part or.. (You should remove stars for better output)
            super.showInfo();
            System.out.println("Number of team : " + this.teamnumber);
        }

         */
}
