import java.util.*;
public class Area{
public static void main (String[] args){
Scanner sc = new Scanner (System.in) ;
double l,b,h;
System.out.println("enter the length");
l = sc.nextDouble();
System.out.println("enter the breadth");
b = sc.nextDouble();
System.out.println("enter the height");
h = sc.nextDouble();
double area = 2*((l*b)+(b*h)+(l*h));
double volume = l*b*h;
System.out.println("area"+area);
System.out.println("volume"+volume);
}}
