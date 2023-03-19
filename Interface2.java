interface Vehical{
void showPrice();
void showColor();
}
class Car implements Vehical
{
String color;
double price;
Car(String color, double price)
{
this.color = color;
this.price = price;
}
public void showColor()
{
System.out.println("Car's color is: "+ color);
}
public void showPrice(){
System.out.println("Car's price is: Rs "+ price);
}
}
class SUV implements Vehical
{
String color;
double price;
SUV(String color, double price)
{
this.color = color;
this.price = price;
}
public void showColor()
{
System.out.println("SUV color is:: "+ color);
}
public void showPrice()
{
System.out.println("SUV price is:: Rs "+ price);}
}
class Minivan implements Vehical
{
String color;
double price;
Minivan(String color, double price)
{
this.color = color;
this.price = price;
}
public void showColor()
{
System.out.println("Minivan color is:: "+ color);
}
public void showPrice()
{
System.out.println("Minivan price is:: Rs "+ price);
}
}
public class Interface2
{
public static void main(String []args)
{
System.out.println("Deepak and Roll::201940443");
Car car = new Car("green", 7567667.4);
SUV suv = new SUV("blue", 567445.8);
Minivan minivan = new Minivan("whitw", 767845.4);
car.showColor();
car.showPrice();
suv.showColor();
suv.showPrice();
minivan.showColor();
minivan.showPrice();
}
}