import java.util.Scanner;
public class Student
{
String name;
int roll;
Student(String nm, int rol)
{
name= nm;
roll= rol;
}
void display(){
System.out.println("Name:"+name);
System.out.println("Roll number:"+roll);
}
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter number of students:");
int n= sc.nextInt();
Student[] obj= new Student[n];
for(int i=0; i<n; i++){
System.out.println("Enter name");
String nm= sc.next();
System.out.println("Enter roll number");
int rol= sc.nextInt();
obj[i]= new Student(nm,rol);
}
System.out.println("Students details are:");
for(int i=0; i<n; i++){
 obj[i].display();
}
}
}