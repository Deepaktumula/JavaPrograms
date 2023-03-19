import java.util.*;
public class Palindrome
{
public static void main(String[] args)
{
int r,sum=0,temp,n=151;
temp=n;
while(n>0)
{
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(temp==sum)
System.out.print("Its a Palindrome");
else
System.out.print("Not a palindrome");
}
}

