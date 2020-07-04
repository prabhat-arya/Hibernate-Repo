package com.doto.test;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.doto.entities.DelevaryNote;
import com.doto.entities.Parcel;
import com.doto.helper.SessionFactoryRegistry;

public class DirectOneToOneTest {
	public static void main(String[] args) {

		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

		Parcel parcel = null;
		DelevaryNote delevaryNote = null;

		try {
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			
			/*
			 * parcel=new Parcel();
			 * parcel.setDelevaryDate(new Date());
			 * parcel.setType("Speed post");
			 * session.save(parcel);
			 * 
			 * delevaryNote=new DelevaryNote();
			 * delevaryNote.setReceivedDate(new Date());
			 * delevaryNote.setReceiver("Arya");
			 * delevaryNote.setParcel(parcel);
			 * session.save(delevaryNote);
			 */
			
			DelevaryNote dn=session.get(DelevaryNote.class, 1);
			System.out.println(dn);
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
