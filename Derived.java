class Base
{
int i;
}
class Derived extends Base
{
int i;//THIS i HIDES i IN CLASS A
Derived(int a,int b)
{
super.i=a;
this.i=b;
}
void show()
{
System.out.println("i in super class =" +super.i);
System.out.println("i in subclass =" +this.i);//this.i can be replaced by i
}
public static void main(String args[])
{
Derived d=new Derived(2,5);
d.show();
}
}