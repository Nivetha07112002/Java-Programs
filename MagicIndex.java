import java.util.Scanner;
public class MagicIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Size of the array
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt(); // Input array elements
            }

            int magicIndex = findMagicIndex(arr);
            System.out.println(magicIndex);
        }

        scanner.close();
    }

    public static int findMagicIndex(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == i) {
                return i; // Magic index found
            }
        }

        return -1; // No magic index found
    }
}
