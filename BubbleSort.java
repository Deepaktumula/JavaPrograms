import java.util.*;
public class Bubblesort
{
public static void main(String args[]) 
{
Scanner in = new Scanner(System.in);
int n = 10;
int arr[] = new int[10];
int temp;
System.out.println("Enter the elements of the array:");
for (int i = 0; i < n; i++) 
{
arr[i] = in.nextInt();
}
for (int i = 0; i < n - 1; i++) 
{
for (int j = 0; j < n - i - 1; j++)
{
if (arr[j] < arr[j + 1]) 
{
temp = arr[j];
arr[j] = arr[j+1];
arr[j+1] = temp;
}
} 
}
System.out.println("Sorted Array:");
for (int i = 0; i < n; i++) 
{
System.out.print(arr[i] + " ");
}
}
}