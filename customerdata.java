import java.util.*;
class customerdata
{
public static void main(String [] args)
{
Scanner in = new Scanner(System.in);
Scanner ins = new Scanner(System.in);
String cname,ctype;
int bn;
double current,previous,tbill,units;
void getdata()
{
System.out.print ("\n\t Enter consumer number  ");
bn = in.nextInt();
System.out.print ("\n\t Enter Type of connection  ");
ctype = ins.nextLine();
System.out.print ("\n\t Enter consumer name  ");
cname = ins.nextLine();
System.out.print ("\n\t Enter previous month reading  ");
previous= in.nextDouble();
System.out.print ("\n\t Enter current month reading  ");
current= in.nextDouble();
}
void calc()
{
units=current-previous;
if(ctype.equals("D"))
{
if (units<=100)
tbill=1 * units;
else if (units>100 && units<=200)
tbill=2.50*units;
else if(units>200 && units<=500)
tbill= 4*units;
else
tbill= 6*units;
}
}
}
}