package ExceptionHandling;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) throws Insufficiant_Balance {
		// TODO Auto-generated method stub
		double balance=10000,amount;
				System.out.println("----welcome----");
		System.out.println("enter your choice 1.Credit\t2.Debit");
		Scanner sc = new Scanner(System.in);
		int choice=sc.nextInt();
		Credit c = new Credit();
		Debit d = new Debit();
		switch (choice) {
		case 1:
			System.out.println("enter amount to be credited");
			amount=sc.nextDouble();
			double ncbalance=c.creditcalc(balance, amount);
			System.out.println("new balance after credited: "+ncbalance);
			System.out.println("--------Thank you--------------");
			break;
		case 2:
			System.out.println("enter amount to be debited");
			amount=sc.nextDouble();
			double ndbalance=d.debitcalc(balance,amount);
			System.out.println("new balance after debited: "+ndbalance);

		default:
			System.out.println("please enter either 1 or 2");
			break;
		}

	}

}
