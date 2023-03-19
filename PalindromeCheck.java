import java.util.*;
class PalindromeCheck
{ 
static String revString(String w)
{ 
int len=w.length();
String rw="";
for(int i=len-1; i >= 0; i --)
rw= rw+w.charAt(i);
return (rw);
}
public static void main(String ar[]) 
{ Scanner sc=new Scanner(System.in); 
String st1, st2;
System.out.print("Enter any Word :: "); 
st1=sc.next();
st2=st1; st1=revString(st1);
if(st1.equalsIgnoreCase(st2)) 
System.out.println("PALINDROME");
else 
System.out.println("Not a Palindrome");
}
}