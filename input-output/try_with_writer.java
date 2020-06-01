import java.io.FileWriter;
import java.io.IOException;

public class try_with_writer {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("file.txt")) { //for more file ; ( ... ) ; (...)
            writer.write("EMREDZ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
