import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
//code is a real mess but it is for doing sth with linkedlists
public class linkedlist_example {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("İstanbul");
        linkedList.add("Edirne");
        linkedList.add("Tekirdağ");
        linkedlist_tour(linkedList);
    }
    public static void print_operations(){
        System.out.println("************************************");
        System.out.println("Show operations : 0");
        System.out.println("Go to the next city : 1");
        System.out.println("Go to the previous city : 2");
        System.out.println("For exit press 'q'");
        System.out.println("************************************");
    }
    public static void linkedlist_tour(LinkedList<String> linkedList){
        ListIterator<String> iterator = linkedList.listIterator();
        print_operations();
        Scanner console = new Scanner(System.in);
        boolean exit = false;
        boolean next = true;
        while (!exit){
            System.out.print("Choose an operation : ");
            String operation = console.nextLine();
            switch (operation){
                case "0":
                    print_operations();
                    break;
                case "1":
                    if (!next){
                        if (iterator.hasNext()){
                            iterator.next();
                        }
                        next = true;
                    }
                    if (iterator.hasNext()){
                        System.out.println("You are going to the next city : " + iterator.next());
                    }
                    else {
                        System.out.println("Tour has been finished.");
                        next = true;
                    }
                    break;
                case "2":
                    if (next){
                        if (iterator.hasPrevious()){
                            iterator.previous();
                        }
                        next = false;
                    }
                    if (iterator.hasPrevious()){
                        System.out.println("You are going to the previous city : " + iterator.previous());
                    }
                    else{
                        System.out.println("Your tour is starting...");
                    }
                    break;
                case "q":
                    exit = true;
                    System.out.println("Exiting..");
                    break;

            }
        }

    }
}
