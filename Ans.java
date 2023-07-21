import java.util.*;
class Complex{
int real;
int imag;
Public Complex(int r, int i){
real = r;
imag = i;
}
public static Complex sum(Complex x, Complex y){
return new Complex((x.real+y.real),(x.imag+y.imag));
}
public static Complex difference(Complex x, Complex y){
return new Complex((x.real-y.real),(x.imag-y.imag));
}
public static Complex product(Complex x, Complex y){
return new Complex(((x.real*y.real)-(x.imag*y.imag)),((x.real*y.imag)+(x.imag*y.real)));
}
public void printComplex(){
if(real == 0 && imag!=0){
System.out.println(imag+"i");
}
else if(imag == 0 && real!=0){
System.out.println(real);
}
else{
System.out.println(real+"+"+imag+"i");
}
}
}

							
