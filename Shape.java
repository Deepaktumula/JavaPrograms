public class Shape
{
int len,br,side;
void area_rect()
{
System.out.println("Area of rectangle: "+len*br);
}
void area_sqr()
{
System.out.println("Area of Square: "+side*side);
}
public static void main(String args[])
{
Shape rectangle=new Shape();
rectangle.len=10;
rectangle.br=5;
rectangle.area_rect();
Shape square=new Shape();
square.side=10;
square.area_sqr();
}
}

