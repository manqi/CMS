package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entity.Kclb;

public class KclbDaoImp implements KclbDao{
	private SessionFactory sessionFactory;
	
	@Override
	public void addKclb(Kclb kclb) {
		// TODO Auto-generated method stub
		System.out.println("-------KclbDaoImp.addKclb-----------"+ kclb.getKclb());
		getSession().save(kclb);
	}

	@Override
	public void deleteKclb(Kclb kclb) {
		// TODO Auto-generated method stub
		System.out.println("-------KclbDaoImp.deleteKclb-----------"+ kclb.getKclb());
		getSession().save(kclb);
	}

	@Override
	public void modifyKclb(Kclb kclb) {
		// TODO Auto-generated method stub
		System.out.println("-------KclbDaoImp.modifyKclb-----------"+ kclb.getKclb());
		getSession().save(kclb);
	}

	@Override
	public void queryKclb(Kclb kclb) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exportKclb(Kclb kclb) {
		// TODO Auto-generated method stub
		
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

}
