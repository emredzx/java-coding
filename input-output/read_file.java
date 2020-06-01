import java.io.FileInputStream;
import java.io.IOException;

public class read_file {
    public static void main(String[] args) {
        FileInputStream file = null;
        try {
            file = new FileInputStream("file.txt");
            int index;
            StringBuilder text = new StringBuilder();
            while ((index = file.read()) != -1){
                text.append((char) (index));
            }
            System.out.print(text);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert file != null;
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
