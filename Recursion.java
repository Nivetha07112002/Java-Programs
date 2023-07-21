import java.util.Scanner;
class Recursion{
public static void main(String args[]){
int a,b,gcd;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the Number: ");
a=obj.nextInt();
b=obj.nextInt();
gcd=getGcd(a,b);
System.out.println("GCD= " + gcd);
}
if(b==0){
return a;
}
else{
return getGcd(b,a%b);
}}
