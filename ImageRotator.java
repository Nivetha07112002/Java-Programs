import java.util.Scanner;
public class ImageRotator {
public static int[][] rotateImage(int[][] image, int flag) {
int m = image.length;
int n = image[0].length;
int[][] rotatedImage = new int[n][m]; 
if (flag == 0) {
for (int i = 0; i < m; i++) {
for (int j = 0; j < n; j++) {
rotatedImage[n - 1 - j][i] = image[i][j];
}
}
} else if (flag == 1) {
for (int i = 0; i < m; i++) {
for (int j = 0; j < n; j++) {
rotatedImage[j][m - 1 - i] = image[i][j];
}
}
} else {
System.out.println("Invalid");
}
return rotatedImage;
}
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.print(" ");
int m = obj.nextInt();
System.out.print(" ");
int n = obj.nextInt();
int[][] image = new int[m][n];
System.out.println(" ");
for (int i = 0; i < m; i++) {
for (int j = 0; j < n; j++) {
image[i][j] = obj.nextInt();
}
}
System.out.print(" ");
int flag = obj.nextInt();
int[][] rotatedImage = rotateImage(image, flag);
System.out.println(" ");
printImage(rotatedImage);
obj.close();
}
public static void printImage(int[][] image) {
for (int i = 0; i < image.length; i++) {
for (int j = 0; j < image[i].length; j++) {
System.out.print(image[i][j] + " ");
}
System.out.println();
}
}
}
