abstract class Figure
{
protected double area;
abstract public double find_Area();
}
class Circle extends Figure
{
double radius;
Circle(double r)
{
radius=r;
}
public double find_Area()
{
area = Math.PI*radius*radius;
return area;
}
}
class Square extends Figure
{
double side;
Square(double s)
{
side=s;
}
public double find_Area()
{
area = side*side;
return area;
}
}
public class Area1
{
public static void main(String[] args)
{
System.out.println("Deepak and Roll::201940443");
Figure c = new Circle(12.4);
Figure s = new Square(4.2);
System.out.println(c.find_Area());
System.out.println(s.find_Area());
}
}