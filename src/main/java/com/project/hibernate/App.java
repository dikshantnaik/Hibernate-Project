package com.project.hibernate;

import org.hibernate.*;
import org.hibernate.cfg.*;


public class App {
	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
	
//		Student s = utils.InsertStudent("Dikshant", "dikshant23", "breadjamd23");
//		AvailableCourse c1 = utils.insertCourse("python", 1000, "Easy", "google");
		
//		Student s1 = utils.getStudent(session, 1);
		
//		System.out.println(s1.getSname());
		session.save(utils.InsertEnrolledCourse(session, 1, 2));
		t.commit();
	
		session.close();
	}
}
