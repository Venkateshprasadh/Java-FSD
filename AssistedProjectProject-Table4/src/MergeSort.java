import java.util.Scanner;

public class MergeSort 
{
	
	public static void mergesort(int[] arr,int lb,int ub)
	{
		if(lb<ub)
		{
			int mid=(lb+ub)/2;
			mergesort(arr,lb,mid);
			mergesort(arr,mid+1,ub);
			merge(arr,lb,mid,ub);
		}
	}
	public static void merge(int []arr,int lb,int mid,int ub)
	{
		
		int brr[] = new int[arr.length];
		
		int i=lb;
		int j=mid+1;
		int k=lb;
		
		while(i<=mid && j<=ub)
		{
			if(arr[i]<=arr[j])
			{
				brr[k]=arr[i];
				i++;
			}
			else
			{
				brr[k]=arr[j];
				j++;
			}
			k++;
		}
		if(i>mid)
		{
			while(j<=ub)
			{
				brr[k]=arr[j];
				j++;
				k++;
			}
		}
		else
		{
			while(i<=mid)
			{
				brr[k]=arr[i];
				i++;
				k++;
			}
		}
		
		for(k=lb;k<ub;k++)
		{
			arr[k]=brr[k];
		}
		
	}
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
		int lb=0,ub=arr.length-1,mid=(lb+ub)/2;
		
		mergesort(arr, lb, ub);
			
		
		
		
		
	
		
		
	}		
		
}

