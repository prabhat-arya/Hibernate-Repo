package com.tpch.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tpch.entities.AccidentialInsurencePlan;
import com.tpch.entities.InsurancePlan;
import com.tpch.entities.MedicaInsurancePlane;
import com.tpch.helper.SessionFactoryRepository;

public class Test {
	public static void main(String[] args) {
		InsurancePlan insurancePlan=null;
		AccidentialInsurencePlan accidentialInsurencePlan=null;
		MedicaInsurancePlane medicalInsurancePlane=null;
		
		boolean flag = false;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			sessionFactory=SessionFactoryRepository.getSessionFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			
			/*
			 * insurancePlan=new InsurancePlan(); insurancePlan.setPlanName("jivan bima");
			 * insurancePlan.setMinTenure(36); insurancePlan.setMaxTenute(120);
			 * insurancePlan.setMinAge(18); insurancePlan.setMaxAge(60);
			 * insurancePlan.setMinInsuredAmount(100000);
			 * insurancePlan.setMaxInsuredAmount(2000000); int isp=(int)
			 * session.save(insurancePlan); System.out.println(isp);
			 */
			
			/*
			 * accidentialInsurencePlan=new AccidentialInsurencePlan();
			 * accidentialInsurencePlan.setPlanName("jivan bima");
			 * accidentialInsurencePlan.setMinTenure(36);
			 * accidentialInsurencePlan.setMaxTenute(120);
			 * accidentialInsurencePlan.setMinAge(18);
			 * accidentialInsurencePlan.setMaxAge(60);
			 * accidentialInsurencePlan.setMinInsuredAmount(100000);
			 * accidentialInsurencePlan.setMaxInsuredAmount(2000000);
			 * accidentialInsurencePlan.setCoverageType("cash");
			 * accidentialInsurencePlan.setInternationalCoverage(true);
			 * accidentialInsurencePlan.setTravelType("rood"); int isp=(int)
			 * session.save(accidentialInsurencePlan); System.out.println(isp);
			 */
			
			/*
			 * medicalInsurancePlane=new MedicaInsurancePlane();
			 * medicalInsurancePlane.setPlanName("jivan bima");
			 * medicalInsurancePlane.setMinTenure(36);
			 * medicalInsurancePlane.setMaxTenute(120); medicalInsurancePlane.setMinAge(18);
			 * medicalInsurancePlane.setMaxAge(60);
			 * medicalInsurancePlane.setMinInsuredAmount(100000);
			 * medicalInsurancePlane.setMaxInsuredAmount(2000000);
			 * medicalInsurancePlane.setCashlessFacilityAvailable(false);
			 * medicalInsurancePlane.setCopay(20);
			 * medicalInsurancePlane.setNetworkType("netwoek"); int isp=(int)
			 * session.save(medicalInsurancePlane); System.out.println(isp);
			 */
	//Retrieve the data
			
			/*
			 * InsurancePlan isp=session.get(InsurancePlan.class, 2);
			 * System.out.println(isp);
			 */
			/*
			 * AccidentialInsurencePlan aip=session.get(AccidentialInsurencePlan.class, 3);
			 * System.out.println(aip);
			 */
			
			/*
			 * MedicaInsurancePlane mip=session.get(MedicaInsurancePlane.class, 4);
			 * System.out.println(mip);
			 */
			
			//we can also fetch the data patient  reference 
			InsurancePlan mip=session.get(MedicaInsurancePlane.class, 4);
			  System.out.println(mip);
			 
			flag=true;
		} finally {
			if (transaction!=null) {
				if (flag) {
					transaction.commit();
				}else {
					transaction.rollback();
					System.out.println("sodn");
				}
			}
			if (session !=null) {
				session.close();
			}
		}
		SessionFactoryRepository.closeSessionFactory();
	}

}
