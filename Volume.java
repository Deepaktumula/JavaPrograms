import java.util.Scanner;
import java.lang.Math;
class Sphere{
double r;
Sphere(double r)
{
this.r=r;
}
double volume()
{
return Math.PI*r*r*r*4/3;
}
}
class Cylinder extends Sphere
{
double h;
Cylinder(double r, double h){
super(r);
this.h=h;
}
double volume(){
return Math.PI*r*r*h;
}
}
class Cone extends Cylinder
{
Cone(double r, double h)
{
super(r,h);
}
double volume(){
return Math.PI*r*r*h/3;
}
}
public class Volume{
public static void main(String []args){
boolean flag = true;
while(flag)
{
System.out.println("1 Sphere");
System.out.println("2 Cylinder");
System.out.println("3 Cone");
System.out.println("4 Exit");
System.out.print("input your choice: ");
Scanner scan = new Scanner(System.in);
int ch = scan.nextInt();
double r, h;
switch(ch)
{
case 1: System.out.print("Input the radius of sphere: ");
r = scan.nextFloat();
Sphere sphere = new Sphere(r);
System.out.println("Volume of Sphere: "+ sphere.volume());
break;
case 2: System.out.print("Input the radius of Cylinder: ");
r = scan.nextFloat();
System.out.print("Input the height of Cylinder: ");
h = scan.nextFloat();
Cylinder cylinder = new Cylinder(r, h);
System.out.println("Volume of Cylinder: "+ cylinder.volume());
break;
case 3: System.out.print("Input the radius of Cone: ");
r = scan.nextFloat();
System.out.print("Input the height of Cone: ");
h = scan.nextFloat();
Cone cone = new Cone(r, h);
System.out.println("Volume of Cone: "+ cone.volume());
break;
case 4: 
flag = false;
break;
}
}
}
}