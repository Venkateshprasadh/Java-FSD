
package abstractiondemo;

class CalImp extends Calculator{

	@Override
	public void sum(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);
	}
	
}

public class CalMain {
public static void main(String[] args) {
	CalImp imp=new CalImp();
	imp.sum(2, 3);
}}
