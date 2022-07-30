package EncapsulationDemo;
public class EncapCollege {
	
private int id;
private String name;
private String college;

//right click->source->generate getters and setters
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


public String getCollege() {
	return college;
}


public void setCollege(String college) {
	this.college = college;
}


//generate toString()

@Override
public String toString() {
	return "College [id=" + id + ", name=" + name + ", college=" + college + "]";
}







}
