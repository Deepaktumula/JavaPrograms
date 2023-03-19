import java.util.Scanner;

public class Buzznumb
{
    public static void main(String args[])
{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter p: ");
        int p = in.nextInt();
        System.out.print("Enter q: ");
        int q = in.nextInt();
        if (p < q) 
{
            System.out.println("Buzz Numbers between " + p + " and " + q);
            for (int i = p; i <= q; i++) 
{
                if (i % 10 == 7 || i % 7 == 0)
                    System.out.println(i);
            }
        }
        else {
            System.out.println("Invalid Inputs!!!");
            System.out.println("p should be less than q");
        }

    }
}