class Swap
{
void swap(int a, int b) //member function
{ a = a+b;
b = a-b;
a=a-b;
}
}
class Swaping
{ public static void main(String args[])

{ int a=50, b=100;

Swap sp = new Swap();
System.out.print("Values Before Swap #### ");
System.out.println("a = " + a + " and b = " + b);
sp.swap(a, b);
System.out.print("Values After Swap ##### ");
System.out.println("a = " + a + " and b = " + b);
}
}