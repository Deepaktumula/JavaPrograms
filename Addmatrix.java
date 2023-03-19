import java.util.*;
public class Addmatrix
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j,r,c;
System.out.println("Enter no of rows and columns:");
r=sc.nextInt();
c=sc.nextInt();

int First[][]=new int[r][c];
int Second[][]=new int[r][c];
int Sum[][]=new int[r][c];
System.out.println("Enter the elements of first matrix:");
for(i=0;i<r;i++)
for(j=0;j<c;j++)
First[i][j]=sc.nextInt();
System.out.println("Enter the elements of second matrix:");
for(i=0;i<r;i++)
for(j=0;j<c;j++)
Second[i][j]=sc.nextInt();

for(i=0;i<r;i++)
for(j=0;j<c;j++)
Sum[i][j]=First[i][j]+Second[i][j];

System.out.println("Sum of matrix:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
System.out.println(Sum[i][j] +"\t");
System.out.println();
}
}
}


