import java.util.Scanner;

public class ArrayRangeSum 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number of array elements");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter from and to range to be added");
		int p=sc.nextInt();
		int q=sc.nextInt();
		int sum=0;
		for(int i=p;i<=q;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum is: "+sum);
	}
}
