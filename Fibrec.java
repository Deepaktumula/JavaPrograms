import java.util.*; 
class Fibrec
{ 
static int c; 
static void fibo(int a, int b, int n) 
{ 
if(c <= n) 
{ 
System.out.print(c + " "); 
a=b; b=c; c=a+b; 
fibo(a, b, n); 
} 
}
public static void main(String args[]) 
{ 
Scanner sc=new Scanner(System.in); 
Fibrec f = new Fibrec(); 
int a=0, b=1, num; 
System.out.print("Enter a numb"); 
num=sc.nextInt(); 
System.out.println("\nThe FIBONACCI Series below: " + num); 
fibo(a, b, num);
}
}