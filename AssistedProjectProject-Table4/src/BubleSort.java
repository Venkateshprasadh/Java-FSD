import java.util.Scanner;

public class BubleSort 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array elements");
		int temp=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<(n-i);j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("after sorting");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
