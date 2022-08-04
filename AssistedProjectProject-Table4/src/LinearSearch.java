import java.util.Scanner;

public class LinearSearch 
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
		System.out.println("enter key to find");
		int key = sc.nextInt();
		int flag=-1,i;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
			
		}
		if(flag==1)
		{
			System.out.println("element found in: "+(i+1));
		}
		else
		{
			System.out.println("not found");
		}
	}
}
