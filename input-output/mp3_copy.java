import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class mp3_copy {
    private static ArrayList<Integer> content = new ArrayList<Integer>();
    public static void readfile(){
        FileInputStream file = null;
        try {
            file = new FileInputStream("Crying Lightning - Arctic Monkeys.mp3");
            int index;
            while ((index = file.read()) != -1){
                content.add(index);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (file != null) {
                    file.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void copy(String filename){
        FileOutputStream file = null;
        try {
            file = new FileOutputStream(filename);
            for (int value : content){
                file.write(value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (file != null) {
                    file.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        readfile();
        long starttime = System.currentTimeMillis();
        copy("cryinglightning.mp3");
        long finishtime = System.currentTimeMillis();
        long total = (finishtime-starttime) / 1000;
        System.out.println("It took " + total + " seconds.");
    }
}
