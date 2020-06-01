import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class map_letter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Type here : ");
        String words = console.nextLine();
        Map<Character,Integer> frequency = new TreeMap<Character, Integer>();
        for(int i = 0 ; i < words.length() ; i++){
            char c = words.charAt(i);
            if (frequency.containsKey(c)){
                frequency.replace(c,frequency.get(c) + 1);
            }
            else {
                frequency.put(c,1);
            }
        }
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()){
            System.out.println("Character " + entry.getKey() + " is used " + entry.getValue() + " times.");
        }
    }
}
