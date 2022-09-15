package com.hib.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hib.config.HibernateUtil;
import com.hib.model.Address;
import com.hib.model.EmployeeA;

public class TestEmployee2 {
	  
	 
	  
	  public static void main(String args[]){
	    EmployeeA emp1 = new EmployeeA();
	    emp1.setId(1);
	    emp1.setFirstName("Hari Krishna");
	    emp1.setLastName("Gurram");
	    
	    Address addr1 = new Address();
	    addr1.setCity("Bangalore");
	    addr1.setCountry("India");
	    addr1.setPIN("560037");
	    addr1.setState("Karnataka");
	    addr1.setStreet("Chowdeswari street");
	      
	    Address addr2 = new Address();
	    addr2.setCity("Ongole");
	    addr2.setCountry("India");
	    addr2.setPIN("523169");
	    addr2.setState("Andhra Pradesh");
	    addr2.setStreet("Punuru");

	    List<Address> addrList = new ArrayList<Address> ();
	    addrList.add(addr1);
	    addrList.add(addr2);
	    
	    emp1.setAddresses(addrList);
	    
	    /* To persisit data */
	    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    session.save(emp1);
	    session.getTransaction().commit();
	    session.close();   
	  }
	}