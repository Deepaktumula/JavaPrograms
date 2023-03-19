class Table
{
synchronized void printTable(int n)
{
for(int i=1;i<=10;i++)
{
System.out.println(n + " X " + i + "=" + n*i);
try
{
Thread.sleep(5);
}
catch (Exception e)
{
System.out.println(e);
}
}
}
}
class Thread1 extends Thread
{
Table t;
Thread1(Table t)
{
this.t = t;
}
public void run()
{
t.printTable(5);
System.out.println("\n");
}
}
class Thread2 extends Thread
{
Table t;
Thread2(Table t)
{
this.t = t;
}
public void run()
{
t.printTable(10);
System.out.println("\n");
}
}
class Thread3 extends Thread
{
Table t;
Thread3(Table t)
{
this.t = t;
}
public void run()
{
t.printTable(7);
System.out.println("\n");
}
}
class PrintTables
{
public static void main(String args[])
{
Table obj = new Table();
Thread1 t1 = new Thread1(obj);
Thread2 t2 = new Thread2(obj);
Thread3 t3 = new Thread3(obj);
t1.start();
t2.start();
t3.start();
}
}



