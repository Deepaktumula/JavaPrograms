import java.util.*;
public class Search
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int arr[]={10,20,30,56,78};
int i,item;boolean found=false;
System.out.print("enter an element to search::");
item=sc.nextInt();
for(i=0;i<arr.length;i++)
{
if(arr[i]==item)
{
found=true;
break;
}
}
if(found)
System.out.print("The element found at position"+(i+1));
else
System.out.print("element not found");
}
}