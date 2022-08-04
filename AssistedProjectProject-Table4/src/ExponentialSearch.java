import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearch 
{
	public static void main(String[] args)
	{
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
		System.out.println("enter number to be searched");
		
		int key=sc.nextInt();
		int result = exponentialsearch(arr, 
                arr.length, key);

		System.out.println((result < 0) ? 
				"Element is not present in array" :
					"Element is present at index " + 
           result);
		
	}
	static int exponentialsearch(int arr[] ,int n,int key)
	{
		Arrays.sort(arr);
		
		if(arr[0]==key)
		{
			return 0;
		}
		
		int i=1;
		while(i<=n && arr[i]<=key)
		{
			i=i*2;
		}
		return Arrays.binarySearch(arr, i/2, 
                Math.min(i, n-1), key);
	}
}
