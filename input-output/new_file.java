import java.io.FileOutputStream;
import java.io.IOException;

public class new_file {
    public static void main(String[] args) {
        FileOutputStream file = null;
        {
            try {
                file = new FileOutputStream("employee.txt");
                //byte[] array = {69,77,82,69,68,90}; or
                String name = "EMREDZ";
                byte[] array = name.getBytes();
                file.write(array);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (file != null) {
                        file.close();
                    }
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }

        }
    }
}