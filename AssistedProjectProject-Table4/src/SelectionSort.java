import java.util.Scanner;

public class SelectionSort 
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
		SelectionSort s = new SelectionSort();
		s.sort(arr);
		System.out.println("after sorting");
		s.display(arr);
	}

	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		int n =arr.length;
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
				//swaping min element with sirst element
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		
	}
	public void display(int[] arr) {
		// TODO Auto-generated method stub
		int i;
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}
