import java.util.*;
class BZero
{
public static void main(String args[])
{
int i,j;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of Array::");
int n=sc.nextInt();
int arr[]=new int[n],a[]=new int[n];
System.out.println("Enter the Elements::");
for(i=0;i<n;i++)
arr[i]=sc.nextInt();
j=0;
for(i=0;i<n;i++)
{
if(arr[i]==0)
{
a[j]=arr[i];
j++;
}
}
for(i=0;i<n;i++)
{
if(arr[i]!=0)
{
a[j]=arr[i];
j++;
}
}
System.out.println("DEEPAK and Roll:201940443");
System.out.println("Output is::");
for(i=0;i<n;i++)
System.out.print(a[i]+" ");
}
}