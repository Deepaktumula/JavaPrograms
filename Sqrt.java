import java.util.Scanner;
public class Sqrt
{
    public static void main(String []args)
{
        int sum=0;
        double numArr[] = new double[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 numbers to find its SquareRoot: ");
        for(int i=0; i<10; i++) 
        numArr[i] = scan.nextDouble();
        System.out.println("SquareRoot: ");
        for( double n : numArr )
{
            System.out.println("SquareRoot of "+ n +" is " + Math.sqrt(n));
            if(n%2==0) sum+=n;
        }
        System.out.println("\nSum of even numbers is: "+ sum);
    }
}