  import java.util.Scanner;

public class InsertSort 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++)
		{
			int temp=arr[i];
			int j=i-1;
			while(j>=0&& arr[j]>temp)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		System.out.println("after sorting");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
