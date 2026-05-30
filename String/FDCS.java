// For "Find Duplicate Characters in a String", the best interview approach is usually using a HashMap.
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FDCS {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();

            HashMap<Character, Integer> map = new HashMap<>();

            for (char ch : str.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println(entry.getKey() + " -> " + entry.getValue());
                }
            }
        }
    }
}