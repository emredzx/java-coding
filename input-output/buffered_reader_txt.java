import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class buffered_reader_txt {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("employee.txt")))){
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
