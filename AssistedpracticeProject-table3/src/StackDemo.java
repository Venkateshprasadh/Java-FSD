

import java.util.Scanner;

public class StackDemo
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sstack size");
		int size=sc.nextInt();
		int stack[] = new int[size];
		int top=-1;
		System.out.println("----stack operation------");
		
		while(true)
		{
			System.out.println("enter your choice 1.push\t2.pop\t3.display\t4.exit");
			int choice=sc.nextInt();
			switch (choice) 
			{
			case 1:
				//check for overflow
				if(top==size-1)
				{
					System.out.println("stack is full");
				}
				else
				{
					System.out.println("enter element");
					int key=sc.nextInt();
					top++;
					stack[top]=key;
				}
				
				break;
			case 2:
				//check for underflow
				if(top==-1)
				{
					System.out.println("stack is empty");
				}
				else
				{
					top=top-1;
				}
				break;
			case 3:
				if(top==-1)
				{
					System.out.println("stack empty");
				}
				else
				{
					for(int i=top;i>=0;i--)
					{
						System.out.println(stack[i]);
					}
				}
				break;
			case 4:
				System.exit(0);
				break;

			default:
				System.out.println("entered choice invalid");
				break;
			}
		}
	}

	
	
}
