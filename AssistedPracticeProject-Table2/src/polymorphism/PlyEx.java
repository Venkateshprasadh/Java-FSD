package polymorphism;

class Demo{
	void args() {
		System.out.println("no args");
	}
	void args(int a,int b) {
		System.out.println("2  args of int");
	}
	void args(double a , double b) {
		System.out.println("2 args of double");
	}

}


public class PlyEx {
public static void main(String[] args) {
	Demo demo=new Demo();
	demo.args(5, 6.0);//double contains int ,so it is widening or automatic conversion
	/*check the name of the method -3
	 *check the no of args - 2
	 *check the type of the arg- 1
	 * */
}
}
