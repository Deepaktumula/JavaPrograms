import java.util.*;
public class Bill
{
public static double calculateBill(double units)
    {

        if (units <= 250) {
            return units * 1.0;
        }
        else if (units <= 500) {
            return (250 * 1.0)
                    + (units - 250)
                    * 1.50;
        }
        else if (units <= 1000) {
            return (250 * 1.0)
                    + (250 * 1.50)
                    + (units - 500)
                    * 2.0;
        }

        return 0.0;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Units (1-1000)");
        double units = sc.nextDouble();
        System.out.println(calculateBill(units));
    }
}