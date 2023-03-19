import java.util.*;
public class Multiplymatrix
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j,r1,r2,c1,c2,k,Sum=0;
System.out.println("Enter no of rows and columns of first matrix:");
r1=sc.nextInt();
c1=sc.nextInt();

int First[][]=new int[r1][c1];

System.out.print("Enter the elements of first matrix:");
for(i=0;i<r1;i++)
for(j=0;j<c1;j++)
First[i][j]=sc.nextInt();

System.out.println("Enter no of rows and columns of Second matrix:");
r2=sc.nextInt();
c2=sc.nextInt();
if(c1!=r2)
System.out.print("Matrix not possible:");
else
{
int Second[][]=new int[r2][c2];
int Multiply[][]=new int[r1][c2];

System.out.println("Enter the elements of second matrix:");
for(i=0;i<r2;i++)
for(j=0;j<c2;j++)
Second[i][j]=sc.nextInt();

for(i=0;i<r1;i++)
{
for(j=0;j<c2;j++)
{
for(k=0;k<r2;k++)
Sum=Sum+First[i][k]*Second[k][j];

Multiply[i][j] = Sum;
Sum=0;
}
}
System.out.println("Multiply of matrix:");
for(i=0;i<r1;i++)
{
for(j=0;j<c2;j++)
System.out.print(Multiply[i][j]+"\t");
System.out.print("\n");
}
}
}
}


