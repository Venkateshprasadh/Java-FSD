
public class TryCatchDemo 
{
	public static void main(String[] args) {
		int a=1,b=0,c;
		String s=null;
		int arr[] = new int[]{1,2,3,4,5};
		try {
			
			try { // nested try catch
				arr[9]=90;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("array exception:"+e);
			}c=a/b; //creates a ArithmeticException
			
		} catch (Exception e) //if i use ArithmeticException it catches only that exception ,
		//if i know that exception would happen lets rectify directly in the code, 
		// so we dont know which exception will happen so use Exception e
		
		{
			// TODO: handle exception
			System.out.println("trying to divide by zero: "+e);
		}
		try {
			System.out.println(s.charAt(b));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("null pointer exception"+e);
		}
	}
}
