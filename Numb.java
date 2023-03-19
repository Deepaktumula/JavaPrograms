public class Numb
{
public static void main(String[] args)
{
int i,j;
for(i=1;i<=100;i++)
{
int temp=0;
for(j=2;j<=i-1;j++)
{
if(i%j==0)
{
temp++;
}
}
if(temp==0)
{
System.out.println(i);
}
}
}
}