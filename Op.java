public class Op
{ 
public static void main(String args[])
{ 
int k1,k2,result=0;
if(ar.length != 3)
{ 
System.out.println("int1 op int2"); 
System.exit(0);
} 
k1 = Integer.parseInt(args[0]); 
k2 = Integer.parseInt(args[2]);
if(ar[1].equals("+")) 
result=k1+k2;
else if(ar[1].equals("-")) 
result=k1-k2;
else if(ar[1].equals("*")) 
result=k1*k2;
else if(ar[1].equals("/")) 
result=k1/k2;
else if(ar[1].equals("%")) 
result=k1%k2;
else
{ 
System.out.println("Unknown Operator "+args[1]);
System.exit(0);
}
System.out.println(args[0] + " "+ args[1] + " " + args[2]+" = "+result);
}
}