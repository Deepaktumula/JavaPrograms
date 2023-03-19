import java.util.*;
public class Armstrong
{
    public static void main(String []arg)
{
        int num, tempNum, rem, armNum=0;
        num = tempNum = Integer.parseInt(arg[0]);
        int digit=0;
        while(tempNum>0)
{
            tempNum /=10;
            digit++;
        }
        tempNum = num;
        while(tempNum>0)
{
            rem = tempNum%10;
            tempNum /=10;
            armNum += Math.pow(rem,digit);
        }

        if(num == armNum) System.out.println(num +" is an ARMSTRONG Number");
        else System.out.println(num +" is NOT an Armstrong Number");
    }
}