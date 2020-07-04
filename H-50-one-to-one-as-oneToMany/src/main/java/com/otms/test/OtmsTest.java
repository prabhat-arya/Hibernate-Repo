package com.otms.test;

import java.util.Date;
import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otms.entities.Product;
import com.otms.entities.Warranty;
import com.otms.helper.SessionFactoryRegistry;

public class OtmsTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = SessionFactoryRegistry.getSessionFactory();
		Session session = null;
		Transaction transaction = null;
		Product product = null;
		Warranty warranty = null;
		boolean flag = false;

		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
	
			warranty = new Warranty();
			warranty.setWarrantyInMonths(36);
			warranty.setEffectiveDate(new Date());
			warranty.setExpiryDate(new Date());
			warranty.setTermsAndConditions("Liquid damage not covered");
			warranty.setRetailerBusinessName("Ganesh Retails");
			int wno=(int) session.save(warranty);
			System.out.println("warrantyNo :  " + wno);

			product = new Product();
			product.setManufacturedDate(new Date());
			product.setManufacturerName("Mi");
			product.setProductName("Note 7 Pro");
			product.setPrice(7849);
			product.setWarranty(warranty);
			
			int pno =(int) session.save(product);
			System.out.println("productNo : " + pno);

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
