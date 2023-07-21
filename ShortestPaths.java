import java.util.Scanner;
public class ShortestPaths {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(); 
        if (n < 2) {
            System.out.println("Invalid Input");
            return;
        }
        int s = Integer.MAX_VALUE;
        int s2 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int d = obj.nextInt(); 
            if (d < s) {
                s2 = s;
                s = d;
            } else if (d < s2 && d != s) {
                s2 = d;
            }
        }
        if (s == s2) {
            System.out.println("Equal");
        } else {
            System.out.println(s + " " + s2);
        }
    }
}
