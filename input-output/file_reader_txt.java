import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class file_reader_txt {
    public static String stars= "**************************************";
    public static void main(String[] args) {
        readAll();
        System.out.println(stars);
        readCri();
        System.out.println(stars);
    }
    public static void readAll (){
        try(Scanner scanner = new Scanner(new FileReader("employee.txt"))){
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void readCri(){
        try(Scanner scanner = new Scanner(new FileReader("employee.txt"))){
            while (scanner.hasNextLine()){
                String info = scanner.nextLine();
                String[] array = info.split(",");
                if (array[1].equals("Software Engineering")){
                    System.out.println(info);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
