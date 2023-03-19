import java.util.*;
class Interest{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int rate,time;
double principal;
System.out.println("enter the principal:");
principal = sc.nextDouble();
System.out.println("enter the rate:");
rate = sc.nextInt();
System.out.println("enter the time:");
time = sc.nextInt();
double simpleinterest = principal * time * rate;
double compoundinterest = principal*Math.pow((1+rate),time)-principal;
System.out.println("simple interest: "+simpleinterest);
System.out.println("compound interest:"+compoundinterest);
}}

