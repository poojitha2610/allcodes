package com.test.getconnectionfactory;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactory {
	 static SessionFactory factory=null;
	 static {
	 	Configuration configuration=new Configuration();
	 	configuration.configure("hibernate.cfg.xml");
	 	factory=configuration.buildSessionFactory();
	 	
	 }
	 public static SessionFactory getSessionFactory() {
	 	return factory;
	 }
	 public static Session getSession() {
	 	return factory.openSession();
	 }
	 }
