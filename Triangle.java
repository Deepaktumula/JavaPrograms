import java.util.*;
public class Triangle{
public static void main(String args[]) {          
Scanner sc= new Scanner(System.in);
System.out.println("Enter the 1st side:");
int a= sc.nextInt();
System.out.println("Enter the 2nd side:");
int b= sc.nextInt();
System.out.println("Enter the 3rd side:");
int c= sc.nextInt();
if((a+b)>c && (a+c)>b && (b+c)>a){
int s =(a+b+c)/2;
double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("Area of Triangle is" + area);}
else  
System.out.println("Area of Triangle does not exist");
}}
