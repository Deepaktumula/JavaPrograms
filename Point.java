import static java.lang.Math.*; //importing static methods
class Point
{ double x,y;
Point(double a, double b) { x=a; y=b; }
double distance(Point p1, Point p2)
{ return sqrt( pow((p2.x-p1.x),2) + pow((p2.y-p1.y),2));
}
public static void main(String args[])
{ Point p1=new Point(3,4);
Point p2=new Point(6,8);
System.out.println("Distance between the two points is :: " +

p1.distance(p1,p2));

}
}