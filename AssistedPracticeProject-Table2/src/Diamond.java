interface father
{
	public static void advice() 
	{
		System.out.println("believe in yourself");
	}
}
interface mother
{
	public static void advice()
	{
		System.out.println("you can do it");
	}
}
public class Diamond implements father,mother
{
	public static void main(String[] args) 
	{
		Diamond d = new Diamond();
		d.advice();
		
	}

	public void advice() {
		// TODO Auto-generated method stub
		father.advice();
		mother.advice();
	}
	
}
