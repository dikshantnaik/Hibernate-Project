package com.project.hibernate;

import org.hibernate.Session;

public class utils {
public static Student InsertStudent(String sname,String username,String password) {
		
		Student s1 = new Student();
		s1.setSname("Dikshant");
		s1.setUsername("dikshan23");
		s1.setPassword("breadjamd23");
		return s1;
	}

public static AvailableCourse insertCourse(String cname,int cprice,String cdiscription,String offerdBy)
{
	AvailableCourse course = new AvailableCourse();
	course.setCourse_name(cname);
	course.setCourse_price(cprice);
	course.setCourse_discription(cdiscription);
	course.setOfferdBy(offerdBy);
	
	return course;
}

public static Student getStudent(Session session,Integer id) {
	
	Student s1 = (Student) session.load(new Student().getClass(),id);
	
	return s1;
}

public static EnrolledCourse InsertEnrolledCourse(Session session,int sid,int cid) {

	EnrolledCourse eCourse = new EnrolledCourse();
	eCourse.setCourse((AvailableCourse) session.get(AvailableCourse.class, cid));
	eCourse.setStudent((Student) session.get(Student.class, sid));
	
	return eCourse;

}
}
