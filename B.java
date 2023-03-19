import java.util.*;

class reverse
{  
 void reverse(String st)
 {  
int len=st.length();
String rw="";
for(int i=len-1;i>=0;i--)
  {  
   rw=rw+st.charAt(i);
  }  
  System.out.println("Reverse of string is " + rw);  
 }

 void reverse(int n)
 { 
  int r =0,d;
  while(n>0)
  {
   d=n%10;
   r=r*10+d;
   n=n/10;
  }
  System.out.println("reverse of no " + r);  
 }
}

class B extends reverse
{
 public static void main(String args[])
 {
  reverse ob = new reverse();
  ob.reverse("DEEPAK");
  ob.reverse(24);
 }
}