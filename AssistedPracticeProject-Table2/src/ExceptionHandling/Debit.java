package ExceptionHandling;

public class Debit 
{
	public double debitcalc(double balance,double amount) throws Insufficiant_Balance
	{
		try {
			if(amount>balance)
			{
				throw new Insufficiant_Balance("Sorry Insufficient balance");
			}
			else
			{
				return (balance-amount);
			}
		} finally {
			System.out.println("Transaction Terminated");
			System.out.println("--------reason as follows--------------");
		}
		
	}
}
