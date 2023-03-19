import java.util.*;
public class Prime
{
public static void main(String[] args)
{
int i,j,c=0;
System.out.print("Prime No:");
for(i=2;i<=100;i++)
{
for(j=2;j<=Math.sqrt(i);j++)
{
if(i%j==0)
c=1;
}
if(c==0)
System.out.println(+i);
c=0;
}
}
}

