package ClassAndObject;
class teacher
{
	int id;
	String name;
	double salary;
	//setters and getters 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "teacher [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}

public class ClassandObjectDemo 
{
	public static void main(String[] args)
	{
		teacher t1 = new teacher(); //creating object
		t1.setId(1111); //assign values using setters
		t1.setName("murukesan");
		t1.setSalary(15000.0);
		teacher t2 = new teacher();
		t2.setId(1112);
		t2.setName("Selvakumar");
		t2.setSalary(20000.0);
		System.out.println(t1);
		System.out.println(t2);
		
	}
}
