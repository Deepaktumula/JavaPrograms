import java.util.*;
public class Primenumb
{
public static void main(String[] args)
{
int i,m,flag=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the numb:");
int n=sc.nextInt();
m=n/2;
for(i=2;i<=m;i++)
{
    if(n%i==0)
        System.out.print("not a prime");
flag=1;
break;
}
if(flag==0)
System.out.print("Prime");
}
}


