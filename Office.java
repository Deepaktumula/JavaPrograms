import java.util.*;
abstract class Employee 
{
String name;
int id;
}
class Manager extends Employee
{ 
String name, department;
double salary, bonus;
public void accept() 
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Name: "); 
name=sc.nextLine();
System.out.print("Enter ID: ");
id=Integer.parseInt(sc.nextLine()); 
System.out.print("Enter Department: ");
department=sc.nextLine();
System.out.print("Enter Salary: "); 
salary=Double.parseDouble(sc.nextLine());
System.out.print("Enter Bonus: ");
bonus=Double.parseDouble(sc.nextLine()); 
}
public void display() 
{ 
System.out.println("Name: "+name); 
System.out.println("ID: "+id);
System.out.println("Department: "+department);
System.out.println("Salary: "+salary);
System.out.println("Bonus: "+bonus); 
System.out.println("Total Salary: "+(salary+bonus));
}
}
public class Office 
{ 
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,i,j=0; 
double total=0,temp=0; 
System.out.print("Enter How Many Objects You Want: "); 
n=Integer.parseInt(sc.nextLine());
Manager M[]=new Manager[n];
for(i=0;i<n;i++) 
{
System.out.println("Enter Details of Employee "+(i+1));
M[i]=new Manager();
M[i].accept();
total=M[i].salary+M[i].bonus;if(total>temp)
{
j=i;
temp=total;
}
System.out.println();
}
System.out.println("Maximun Payout Employee is: -");
M[j].display();
}
}