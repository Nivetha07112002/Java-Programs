import java.util.*;
public class Games
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
int min=Integer.MAX_VALUE;
long sum=0;
for(int i=0;i<n;i++)
{
min=Math.min(min,arr[i]);
sum=sum+arr[i];
}
System.out.println(sum-n*min);
}
}
