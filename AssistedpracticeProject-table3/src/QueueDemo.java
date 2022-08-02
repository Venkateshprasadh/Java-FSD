

import java.util.Scanner;

public class QueueDemo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter queue size");
		int size=sc.nextInt();
		int queue[] = new int[size];
		int front=-1,rear=-1;
		System.out.println("-----Queue operations----");
		while(true)
		{
			System.out.println("enter ur choice 1.Enque\t2.Deque\t3.Display\t4.Exit");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				//check for overflow
				if(rear==size-1)
				{
					System.out.println("queue size full");
				}
				else
				{
					System.out.println("insert an element");
					int key=sc.nextInt();
					rear++;
					queue[rear]=key;
					front=0;
				}
				
				break;
			case 2:
				//check for underflow
				if((front==-1&&rear==-1)||(front>rear))
				{
					System.out.println("already empty no deletion possible");
				}
				else
				{
					front=front+1;
				}
				break;
				
			
			case 3:if((front==-1&&rear==-1)||(front>rear)) {
				System.out.println("Q is empty ");
			}
			else {
				for(int i=front;i<=rear;i++) {
					System.out.println(queue[i]);
				}
			}
			 break;
			case 4:System.exit(0);
			 break;

			default:
				System.out.println("invalid choice");
				break;
			}
		}
		

	}

}
