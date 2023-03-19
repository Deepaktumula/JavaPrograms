class A extends Thread
{
public void run()
{
char ch='A';
for(int i=0;i<=5;i++)
System.out.println((char)ch++);
System.out.println("Exit from A");
}
}
class B extends Thread
{
public void run()
{
for(int j=1;j<=100;j+=2)
System.out.println(j);
System.out.println("EXit from B");
}
}
class C extends Thread
{
public void run()
{
for(int k=0;k<=100;k+=2)
System.out.println(k);
System.out.println("EXit from C");
}
}
class Test
{
public static void main(String args[])
{
new A().start();
new B().start();
new C().start();
}
}
