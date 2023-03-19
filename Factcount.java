import java.util.*;
public class Factcount
{
public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n=sc.nextInt();
        int i,count=0;
        System.out.print("Factors of " + n + " are: ");
    for ( i = 1; i <= n; ++i) 
{
      if (n % i == 0) 
{
        System.out.print(i + " ");
      }
    }
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            count++; 
        }
        System.out.println("NUMBER OF FACTORS OF "+n+" IS "+count);
    }
}