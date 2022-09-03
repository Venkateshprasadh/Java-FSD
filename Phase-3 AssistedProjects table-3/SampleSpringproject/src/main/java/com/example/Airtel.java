package com.example;

public class Airtel implements Sim{
	
	private String dataStrength;
	

	public String getDataStrength() {
		return dataStrength;
	}

	public void setDataStrength(String dataStrength) {
		this.dataStrength = dataStrength;
	}

	public void typeOfSim() {
		// TODO Auto-generated method stub
		System.out.println("this is an airtel sim");
	}

	public void dataTypeOfSim() {
		// TODO Auto-generated method stub
		System.out.println("it supports 5G data");
	}

}
