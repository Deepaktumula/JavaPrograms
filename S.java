public class S
{
int len,br,side;
void area_rect(int a,int b)
{
//len=a;
//br=b;
System.out.println("Area of rectangle: "+a*b);
}
void area_sqr(int a)
{
//side=a;
System.out.println("Area of Square: "+a*a);
}
public static void main(String args[])
{
S rectangle=new S();
rectangle.len=10;
rectangle.br=5;
rectangle.area_rect((rectangle.len),(rectangle.br));
S square=new S();
square.side=15;
square.area_sqr(square.side);
}
}

