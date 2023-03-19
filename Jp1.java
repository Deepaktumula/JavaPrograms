import java.util.*;
public class Jp1
{
public static void main (String args[])
{
int n,temp,r,reverse=0;
System.out.print("Enter a Number::");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
temp=n;
while(n!=0)
{
r=n%10;
reverse=(reverse*10)+r;
n=n/10;
}
if (temp==reverse)
System.out.println("PAlindrome");
else
System.out.println("Not a Palindrome");
}
}




