import java.util.Scanner;
class Userinput{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
System.out.println("Enter number 1:");
byte num1=obj.nextByte();
System.out.println("Enter number 2:");
short num2=obj.nextShort();
System.out.println("Enter number 3:");
int num3=obj.nextInt();
System.out.println("Enter number 4:");
long num4=obj.nextLong();
System.out.println("Enter number 5:");
float num5=obj.nextFloat();
System.out.println("Enter number 6:");
double num6=obj.nextDouble();
System.out.println("Enter true or false:");
boolean condition=obj.nextBoolean();
System.out.println("Enter a name:");
String name=obj.nextLine();
obj.nextLine();
}}