package com.mto.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mto.entities.Challan;
import com.mto.entities.Vehical;
import com.mto.helper.SessionFactoryRegistry;

public class MtoTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = SessionFactoryRegistry.getSessionFactory();
		Session session = null;
		Transaction transaction = null;
		Vehical vehical = null;
		Challan challan = null;
		boolean flag = false;

		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			vehical = new Vehical();
			vehical.setChachishNo(100);
			vehical.setVehicalName("shine");
			session.save(vehical);

			challan = new Challan();
			challan.setChallanDate(new Date());
			challan.setVehical(vehical);
			session.save(challan);

			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else
					transaction.rollback();
			}
		}

		SessionFactoryRegistry.closeSessionFactory();
	}

}
