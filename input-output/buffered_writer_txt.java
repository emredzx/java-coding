import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class buffered_writer_txt {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("employee.txt",true))){
            writer.write("Pamir Erdem,Technical Architect");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}