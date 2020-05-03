package music;

import java.util.Scanner;

public class Main {

    private static Musicians musicians = new Musicians();
    private static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to musicians list..");
        show_operations();
        boolean exit = false;
        String operation;
        while (!exit){
            System.out.print("Choose an operation : ");
            operation = console.nextLine();
            switch (operation){
                case "0":
                    show_operations();
                    break;
                case "1":
                    show();
                    break;
                case "2":
                    add();
                    break;
                case "3":
                    update();
                    break;
                case "4":
                    delete();
                    break;
                case "5":
                    search();
                    break;
                case "q":
                    exit = true;
                    break;
            }
        }
    }
    public static void show_operations(){
        System.out.println("*********************************");
        String operations = "Show operations again : 0\n" +
                "Show musicians : 1\n" +
                "Add musician : 2\n" +
                "Update musician : 3\n" +
                "Delete musician : 4\n" +
                "Search musician : 5\n" +
                "'I want to exit' : q";
        System.out.println(operations);
        System.out.println("*********************************");
    }
    public static void show(){
        musicians.showMusicians();
    }
    public static void add(){
        System.out.print("Enter the name of the musician : ");
        String name = console.nextLine();
        musicians.addMusician(name);
    }
    public static void update(){
        System.out.print("Enter the musician that you want to update : ");
        String bupdate = console.nextLine();
        System.out.print("Enter the new musician name : ");
        String aupdate = console.nextLine();
        musicians.updateMusician(bupdate,aupdate);
    }
    public static void delete(){
        System.out.print("Enter the musician that you want to delete : ");
        String delete = console.nextLine();
        musicians.deleteMusician(delete);
    }
    public static void search(){
        System.out.print("Enter the musician that you want to search : ");
        String search = console.nextLine();
        musicians.searchMusician(search);
    }
}
