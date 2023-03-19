import java.util.*;
public class Array
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[]=new int[3];
System.out.print("enter the elements::");
for(int i=0;i<3;i++)
arr[i]=sc.nextInt();
System.out.print("The elements are::\t");
for(int i=0;i<3;i++)
System.out.print(arr[i]+" ");
System.out.println();
}
}