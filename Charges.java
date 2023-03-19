import java.io.*;
import java.util.*;
public class Charges
{
	
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter weight of parcel: ");
int wt = sc.nextInt();
double charge = 0;
if (wt <= 250)
charge = 60;
else 
{
int ch = wt - 250;
charge = 60 + (Math.ceil((double)ch/50.0)*10);
}
System.out.println("Parcel charges = " + charge);
}
}