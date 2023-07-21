import java.util.*;
class matrix{
public static void main(String[] args){
int b[][]=new int[3][3];
Scanner a=new Scanner(System.in);
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
b[0][0]=a[0]+a[2];
b[0][1]=a[0][1];
b[0][2]=a[0][1];
b[1][0]=a[1]+a[2];
b[1][1]=a[1][1];
b[1][2]=a[0][1];
b[2][0]=a[0]+a[2];
b[2][1]=a[2][1];
b[2][2]=a[0][1];
System.out.print(b[i][j]+"");
}
System.out.println();
}}}