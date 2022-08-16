package com.demopack;




import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;




public class HProductMain {

	public static void main(String[] args) 
	{
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata md = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf = md.getSessionFactoryBuilder().build();
		Session s= sf.openSession();
		System.out.println("session opened");
		Transaction t =s.beginTransaction();
		hproduct h = new hproduct();
		Scanner sc = new Scanner(System.in);
		
		/* -----for adding entries into record-------
		 * for(int i =1;i<=10;i++) { System.out.println("Enter id: ");
		 * h.setProd_id(sc.nextInt()); System.out.println("Enter product Name: ");
		 * h.setProd_name(sc.next()); System.out.println("Enter product price: ");
		 * h.setProd_price(sc.nextDouble()); s.save(h); }
		 */
		Query q=s.createQuery("from hproduct"); List<hproduct> el =q.list();
		  for(hproduct dis:el) {
		  System.out.println(dis.getProd_id()+" "+dis.getProd_name()+" "+dis.
		  getProd_price()); }
		  	t.commit();
		 	s.close();
		 	System.out.println("session closed");
		 	sf.close();

	}

}
