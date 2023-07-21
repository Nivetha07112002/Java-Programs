import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class fifth {
public static void main(String args[] ) throws Exception {
BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
int name_length = Integer.parseInt(reader.readLine()); 
String name = reader.readLine();
int h = 0;
int a = 0;
int c = 0;
int k = 0;
int e = 0;
int r = 0;
int t = 0;
int count = 0;
for(int i = 0; i<name_length;i++){
if(name.charAt(i) =='h'){
h++;
}
else if(name.charAt(i) =='a'){
a++;
}
else if(name.charAt(i) =='c'){
c++;
}
else if(name.charAt(i) =='k'){
k++;
}
else if(name.charAt(i) =='e'){
e++;
}
else if(name.charAt(i) =='r'){
r++;
}
else if(name.charAt(i) =='t'){
t++;
}
else{
continue;
}
if(h >= 2 && a >= 2 && c >= 1 && k >= 1 && e>=2 && r>=2 && t>=1){
count ++;
h = h-2;
a = a-2;
c = c-1;
k = k-1;
e = e-2;
r = r-2;
t = t-1;
}
}
System.out.print(count);
}
}