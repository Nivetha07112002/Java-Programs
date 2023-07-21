import java.util.Scanner;
public class PipeJunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  
        int M = scanner.nextInt();  
        int R = scanner.nextInt();  
        int[] a = new int[N];
        int[] b = new int[M];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();  
        } 
        for (int i = 0; i < M; i++) {
            b[i] = scanner.nextInt();
        }
        int sumofa = calculateSum(a, R);
        int sumofb = calculateSum(b, R);
               if (sumofa == sumofb) {
            System.out.println("BALANCED");
        } else if (sumofa > sumofb) {
            int diff = sumofa - sumofb;
            int addedPipeCapacity = diff + R;
            System.out.println(-addedPipeCapacity);
        } else {
            int diff = sumofb - sumofa;
            int addedPipeCapacity = diff + R;
            System.out.println(addedPipeCapacity);
        }
    }
      private static int calculateSum(int[] pipes, int R) {
        int sum = 0;
        for (int pipe : pipes) {
            int actualCapacity = pipe - R;
            sum += actualCapacity;
        }
        return sum;
    }
}