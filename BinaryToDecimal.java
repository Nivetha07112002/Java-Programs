import java.util.Scanner;
public class BinaryToDecimal {
public static int convertToDecimal(int binaryData) {
int decimalData = 0;
int base = 1;
while (binaryData > 0) {
int lastDigit = binaryData % 10;
decimalData += lastDigit * base;
base *= 2;
binaryData /= 10;
}
return decimalData;
}
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
int binaryData = obj.nextInt();
int decimalData = convertToDecimal(binaryData);
System.out.println(decimalData);
}
}
