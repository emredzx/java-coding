import java.util.Arrays;
import java.util.Scanner;

public class string_figure_arrays {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String name = console.nextLine();
        System.out.println("*************************");
        int raws=name.length();
        char[] namearray = name.toCharArray();
        for (int i=0;i<raws;i++) {
            char[] uscarray = new char[name.length()];
            Arrays.fill(uscarray,'_');
            uscarray[i]=namearray[i];
            System.out.println(uscarray);
        }
        System.out.print("*************************");
    }
}
