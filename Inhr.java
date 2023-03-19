class A
{
int i=10;
void show1()
{
System.out.println("Inside showData1 in A i="+i);
}
}
class B extends A
{
int j=20;
void show2()
{
System.out.println("Inside showData2 in A i="+i+" B,j ="+j);
}
}
public class Inhr
{
public static void main(String args[])
{
//A obj1=new A();
//obj1.show1();
B obj2=new B();
obj2.show1();
obj2.show2();
}
}