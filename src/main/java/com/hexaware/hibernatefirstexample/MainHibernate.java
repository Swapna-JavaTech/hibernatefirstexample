package com.hexaware.hibernatefirstexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.hexaware.hibernatefirstexample.entity.Seller;

public class MainHibernate {

	public static void main(String[] args) {
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder()
											.configure("hibernate.cfg.xml")
											.build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Seller s1 = new Seller("Rama","ram@gmail.com","23242424");
		
		session.save(s1);
		
		tx.commit();
		
		System.out.println("Data inserted....in Database....");
		
		factory.close();
		
		session.close();

	}

}
