import java.util.Scanner;

public class ArrayRotationRight
{
	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4,5,6,7};
		System.out.println("Enter rotation number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("original array is ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		for(int i=0;i<n;i++)
		{
			int j,last;
			last = arr[(arr.length)-1];
			for(j=arr.length-1;j>0;j--)
			{
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		System.out.println("---array Rotated--"+n+" Times");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
