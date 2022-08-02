import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class FindNSmallElement 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no of elements");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int temp=0;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println("enter nth smallest element to be found");
		int s=sc.nextInt();
		System.out.println(arr[s-1]);
		
	}
}
