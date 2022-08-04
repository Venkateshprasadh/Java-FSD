import java.util.Scanner;

public class QuickSort 
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
		System.out.println("Before sorting");
		QuickSort q = new QuickSort();
		q.display(arr,n);
		q.quicksort(arr,0,n-1);
		System.out.println("after sorting");
		q.display(arr, n);
		
	}

	public void quicksort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if(start<end)
		{
			int div=divide(arr,start,end);
			quicksort(arr, start, div-1);
			quicksort(arr, div+1, end);
			}
		
		
	}

	private int divide(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int pivot=arr[end];
		int i =(start-1);
		for(int j=start;j<=end-1;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[end];
		arr[end]=temp;
		return (i+1);
	}

	public void display(int[] arr, int n) {
		// TODO Auto-generated method stub
		int i;
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}
