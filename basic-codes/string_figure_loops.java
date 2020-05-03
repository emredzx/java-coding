import java.util.Scanner;

public class string_figure_loops {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String name = console.nextLine();
        System.out.println("*************************");
        int namelenght=name.length();
        for (int i=0;i<namelenght;i++) {
            for (int f = 0; f < i; f++) {
                System.out.print("_");
            }
            for (int k = i; k <= i; k++) {
                System.out.print(name.charAt(k));
            }
            for (int j = namelenght - i - 1; j > 0; j--) {
                System.out.print("_");
            }
            System.out.println();
        }
        System.out.print("*************************");
    }
}
