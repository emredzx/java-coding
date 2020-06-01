import java.io.FileWriter;
import java.io.IOException;

public class file_writer {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("file.txt");//true for overwrite
            writer.write("EMREDZ");

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                assert writer != null;
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
