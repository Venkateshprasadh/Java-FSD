package com.example;

public class Idea implements Sim {
	private String dataStrength;
	
	
	
	public Idea(String dataStrength) {
		super();
		this.dataStrength = dataStrength;
	}

	public void typeOfSim() {
		// TODO Auto-generated method stub
		System.out.println("this is an idea sim");
	}

	public void dataTypeOfSim() {
		// TODO Auto-generated method stub
		System.out.println("it supports 4G data");
	}
	
	public void display() {
		System.out.println(dataStrength);
	}

}
