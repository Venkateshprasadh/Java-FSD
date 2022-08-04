

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchExample 
{
	public static void main(String[] args) {
		int a[]= {2,3,5,1,7,9,19,32,88,23};//unsorted
		Scanner sc=new Scanner(System.in);
		/* System.out.println(a.length); */
		System.out.println("enter the key element");
		int ele=sc.nextInt();
		//sorted the array
		Arrays.sort(a);
		int low=0;
		int high=a.length-1;
		int mid=0;
		int flag=0;
		while(low<=high) {
			mid=(low+high)/2;
			if(a[mid]==ele) {
				flag=1;
				break;
			}
			else if(a[mid]<ele) {
				low=mid+1;
				high=a.length-1;
			}
			else {
				low=0;
				high=mid-1;
			}
		}
		if(flag==1) {
			System.out.println("element is found at the location "+mid );
		}
		else {
			System.out.println("element not found");
		}

	}
}
