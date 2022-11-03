package Hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Hibernate.entity.Category;
import Hibernate.entity.Product;

public class HibernateSession {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {

		if (HibernateSession.sessionFactory == null) {
			HibernateSession.sessionFactory = createSessionFactory();
		}
		return HibernateSession.sessionFactory;

	}

	private static SessionFactory createSessionFactory() {
		Configuration conf = new Configuration();

		
		conf.addAnnotatedClass(Category.class);
		conf.addAnnotatedClass(Product.class);


		SessionFactory sessionFactory = conf.configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println("Connection to PostgreSQL via Hibernate is successful.");
		return sessionFactory;
	}

}
