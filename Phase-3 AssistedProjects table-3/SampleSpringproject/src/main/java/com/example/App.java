package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Airtel airtel=new Airtel();
//        Idea idea=new Idea();
//        airtel.dataTypeOfSim();
    	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
    //	Airtel airtel=(Airtel)ac.getBean("airtel");
    	Airtel airtel=ac.getBean(Airtel.class);
    	airtel.dataTypeOfSim();
    	airtel.typeOfSim();
    	//dont hard code the values -tight coupling
    	//airtel.setDataStrength("airtel has good strength");
    	
    	
    System.out.println(airtel.getDataStrength());
    
    //Idea idea =new Idea();
    Idea idea =ac.getBean(Idea.class);
    idea.display();
    
    }
}
