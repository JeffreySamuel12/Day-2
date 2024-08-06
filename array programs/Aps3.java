import java.util.*;

public class Aps3 {
    public static void main(String[] args) {
        String input = "apple";
	int[] frequency = new int[256];

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            frequency[c]++;
        }

        
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) i + ": " + frequency[i]);
            }
        }
    }
}