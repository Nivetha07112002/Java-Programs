import java.io.*;
import java.util.*;
class Subset{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
int n=obj.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=obj.nextInt();
int solution=new int[n];
subset(arr[],n,0,solution[]);