import java.util.*;
import java.util.Scanner;
public class Threads 
{
public static void main(String[] args) 
{
Thread odd = new Thread(new OddNumb());
odd.start();
Thread even = new Thread(new EvenNumb());
even.start();
}
}
class OddNumb implements Runnable 
{
public void run()
{
try 
{
System.out.println("Odd Numbers are::");
for (int i = 1; i < 100; i++) 
{
if(i%2)!=0;
System.out.print(i+",");
}
}
catch (Exception e) 
{ 
System.out.println("Exception");
}
}    
} 
class EvenNumb implements Runnable 
{
public void run()
{
try 
{
System.out.println("Even Numbers are::");
for (int i = 0; i < 100; i++) 
{
if(i%2==0)
System.out.print(i+",");
} 
}
catch (Exception e) 
{
System.out.println("Exception is caught!!");
}
}
}