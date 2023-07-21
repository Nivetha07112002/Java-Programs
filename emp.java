class Emp{
private String name, address;
private int year, salary;
public Employee(String n,int y,String add){
name = n;
year = y;
address = add;
}
public String getName(){
return name;
}
public int getYear(){
return year;
}
public String getAddress(){
return address;
}
}
class Emp{
public static void main(String[] args){
Employee e1 = new Employee("Robert", 1994, 500000, "64C- WallsStreet");
Employee e2 = new Employee("Sam", 2000, 740000, "68d- WallsStreet");
Employee e3 = new Employee("John", 1999, 600000, "26B- WallsStreet");
System.out.println("Name Year of joining Salary Address");
System.out.println(e1.getName()+" "+e1.getYear()+"\"+e1.getSalary()+"\t"+e1.getAddress());  
System.out.println(e2.getName()+"\t\t"+e2.getYear()+"\t\t\t"+e2.getSalary()+"\t"+e2.getAddress());     
System.out.println(e3.getName()+"\t"+e3.getYear()+"\t\t\t"+e3.getSalary()+"\t"+e3.getAddress());  
}
}