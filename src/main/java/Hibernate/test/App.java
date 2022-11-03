package Hibernate.test;

import Hibernate.utils.HibernateSession;

public class App {

	public static void main(String[] args) {
		HibernateSession.getSessionFactory().openSession();

	}

}
