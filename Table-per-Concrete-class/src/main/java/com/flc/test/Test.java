package com.flc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.flc.entity.Contract_Employee;
import com.flc.entity.Employee;
import com.flc.entity.Regular_Employee;
import com.flc.helper.SessionFactoryRegistry;

public class Test {
	public static void main(String[] args) {

		SessionFactory sessionFactory = null;
		Session session = null;
		sessionFactory = SessionFactoryRegistry.getSessionFactory();
		session = sessionFactory.openSession();
		boolean flag = false;
		Transaction transaction = null;
		
	    Employee e1=new Employee();    
        e1.setName("Gaurav Chawla");    
            
        Regular_Employee e2=new Regular_Employee();    
        e2.setName("Vivek Kumar");    
        e2.setSalary(50000);    
        e2.setBonus(5);    
            
        Contract_Employee e3=new Contract_Employee();    
        e3.setName("Arjun Kumar");    
        e3.setPay_per_hour(1000);    
        e3.setContract_duration("15 hours");    
        
		try {
			transaction = session.beginTransaction();
			session.persist(e1);    
            session.persist(e2);    
            session.persist(e3);    
			flag = true;
		} finally {

			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}

		}
		sessionFactory.close();
	}

}
