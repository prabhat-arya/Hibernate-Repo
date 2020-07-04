package com.otms.test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otms.entities.Member;
import com.otms.entities.Project;
import com.otms.helper.SessionFactoryRegistry;

public class OtmsTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = SessionFactoryRegistry.getSessionFactory();
		Session session = null;
		Transaction transaction = null;
	    Project project=null;
	    Member member=null;
	    Set<Member> members=null;
		boolean flag = false;
		members=new HashSet<>();

		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			member=new Member();
			member.setName("prabhat");
			member.setExperience("2");
			session.save(member);
			members.add(member);
			
			member =new Member();
			member.setName("Arya");
			member.setExperience("3");
			session.save(member);
			members.add(member);
			
			project=new Project();
			project.setProjectName("SBI");
			project.setDuration(1);
			project.setMembers(members);
			session.save(project);

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
