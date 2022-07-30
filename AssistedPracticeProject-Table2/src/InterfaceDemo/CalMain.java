package InterfaceDemo;



class CalImp implements calculator2,calculator3{

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

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a*b);
		
	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a/b);
		
	}
	
}

public class CalMain {
public static void main(String[] args) {
	CalImp imp=new CalImp();
	imp.sum(2, 3);
	imp.sub(1, 1);
	imp.mul(2, 2);
	imp.div(4, 2);
}}

