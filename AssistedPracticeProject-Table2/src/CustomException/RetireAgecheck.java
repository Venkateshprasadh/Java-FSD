package CustomException;

public class RetireAgecheck 
{
	void agecheck(int age) throws WhyException
	{
		try {
		if(age>=60) {
			System.out.println("thank you for your service");
		}
		else {
			throw new WhyException("Your age is too short to retiere");
		}
		
	}
		finally 
		{
			System.out.println("code executed succesfully");
		}
	}
}
