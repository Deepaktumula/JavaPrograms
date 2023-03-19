import java.util.*;
abstract class Student
{
abstract void marks(); 
void study()
{
System.out.println("Std reads more Subjects");
}
}
class Topper extends Student
{
void marks() 
{
System.out.println("Std secured 98 marks");
}
}
public class Abstract
{
public static void main(String args[])
{
System.out.println("Deepak and Roll::201940443");
Topper t=new Topper();
t.study();
t.marks();
}
}