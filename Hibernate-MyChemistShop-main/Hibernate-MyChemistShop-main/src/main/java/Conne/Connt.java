package Conne;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Chemist;
import model.Myorder;

public class Connt {

	private static SessionFactory fac;
	public Connt()
	{
		fac=new Configuration().configure("hibernate_cfg.xml").addAnnotatedClass(Chemist.class).addAnnotatedClass(Myorder.class).buildSessionFactory();
		
	}
	
	public static SessionFactory getSessionFact()
	{
		Connt c=new Connt();
		return fac;
	}
	
}
