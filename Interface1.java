import java.util.*;
interface Pedestrian
{
int ped_legs=4;
public void running();
}
interface Flyer
{
int flyer_legs=2;
public void flying();
}
class FlyingTiger implements Pedestrian,Flyer
{
public void legs()
{
int legs=ped_legs+flyer_legs;
System.out.println("\nThe Total Number of legs for Flying tiger is::"+legs);
}
public void running()
{
System.out.println("The Flying tiger runs");
}
public void flying()
{
System.out.println("\nThe Flying tiger can fly also");
}
}
public class Interface1
{
public static void main(String args[])
{
System.out.println("Deepak and Roll::201940443");
FlyingTiger f=new FlyingTiger();
f.running();
f.flying();
f.legs();
}
}