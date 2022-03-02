package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class MainProduct {

	public static void main(String[] args) {
		 Configuration configuration=new Configuration().configure();
	        configuration.addAnnotatedClass(DataBaseProducts.class);
	        StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties ());
	        SessionFactory factory= configuration.buildSessionFactory(builder.build());
	        Session session=factory.openSession();
	         Transaction transaction=session.beginTransaction();
	        DataBaseProducts p1=new DataBaseProducts("laptop",10111,150000);
	        session.save(p1);
	        System.out.println("deatils"+p1);
	        transaction.commit();
	        session.close();
	        
		}

	}


