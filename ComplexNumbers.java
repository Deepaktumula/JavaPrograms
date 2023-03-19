class Complex
{
double real, img;
public Complex(double r, double i)
{ 
real = r;
img = i;
}
public Complex add(Complex c)
{
return new Complex(real + c.real, img + c.img);
}
void display( )
{ 
System.out.print(real);
System.out.printf("%+.2gi\n", img);
}
}
public class ComplexNumbers
{
public static void main(String args[])
{
Complex c1 = new Complex(3.3,4);
Complex c2 = new Complex(3.6,2.4);
Complex c3 = c1.add(c2);
System.out.print("Sum of Two Complex Numbers = ");
c3.display();
}
}