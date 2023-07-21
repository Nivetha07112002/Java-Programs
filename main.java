import java.util.*;
class box{
void display()
{
int l,b,area;
Scanner s=new Scanner(System.in);
l=s.nextInt();
b=s.nextInt();
area=l*b;
System.out.println(area);
}}
class main{
public static void main(String[] args)
{
box my=new box();
my.display();
}}