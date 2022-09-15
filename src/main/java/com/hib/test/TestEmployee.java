package com.hib.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hib.config.HibernateUtil;
import com.hib.model.Employee;
import com.hib.model.Student;

public class TestEmployee {
	  
	  /* Step 1: Create session factory */
		/*
		 * private static SessionFactory getSessionFactory() { Configuration
		 * configuration = new Configuration().configure();
		 * StandardServiceRegistryBuilder builder = new
		 * StandardServiceRegistryBuilder().
		 * applySettings(configuration.getProperties()); SessionFactory factory =
		 * configuration.buildSessionFactory(builder.build()); return factory; }
		 */
	  
	  public static void main(String args[]){
		  Employee emp2 = new Employee();
		  emp2.setAge(27);
		  emp2.setDesignation("Senior Software Developer");
		  emp2.setFirstName("Hari Krishna");
		  //emp1.setId(1);
		  emp2.setLastName("Gurram");
		  emp2.setSalary(8000);
		  emp2.setJoiningDate(new Date());
		  emp2.setDescription("Whaterver the world i saw yesterday is absolutely different from today");
	    Student student = new Student("paresh", "Fadatare", "rameshfadatare@javaguides.com");
	    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    session.save(emp2);
	    //session.save(student);
	    session.getTransaction().commit();
	    session.close();  
	    
	    
	    Session session1 = sessionFactory.openSession();
	    session1.beginTransaction();
	    Employee emp = (Employee)session1.get(Employee.class, 4);
	    session1.getTransaction().commit();
	    session1.close();
	    
	    System.out.println(emp.getId() + " " + emp.getFirstName() + " " + emp.getAge());
	  }
	}