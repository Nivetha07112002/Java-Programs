import java.util.*;

public class ni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();

        // Initialize a HashMap with the frequency of each character
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Calculate the minimum count of each character required to form "hackerearth"
        int[] counts = {2, 2, 1, 1, 2, 1, 2};
        int minCount = Integer.MAX_VALUE;
        for (int i = 0; i < counts.length; i++) {
            char c = "hackerearth".charAt(i);
            int count = freq.getOrDefault(c, 0) / counts[i];
            minCount = Math.min(minCount, count);
        }

        // Print the minimum count
        System.out.println(minCount);
    }
}
