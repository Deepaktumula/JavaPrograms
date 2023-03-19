class Swap
{
int a,b; //Instance Variables
Swap(int i,int j) //parameterised Constructor
{
a=i;
b=j;
}
void swap(Swap s) //Method which is of Object reference
{
int temp;
temp =s.a;
s.a =s.b;
s.b =temp;
}
void print() //Method to print
{
System.out.println("a="+a + " and b="+b);
}
}
class PassObject
{
public static void main(String args[])
{
Swap sp=new Swap(10,20);
System.out.println("Before swapping:");
sp.print();
sp.swap(sp); //Calling a swap member function with the help of object
System.out.println("after swapping:");
sp.print();
}
}