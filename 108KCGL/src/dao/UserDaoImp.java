package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import entity.User;

public class UserDaoImp implements UserDao{
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("-------UserDaoImp.AddUser-----------"
				+ user.getName());
		getSession().save(user);
	}

	@Override
	public void modifyUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("-------UserDaoImp.AddUser-----------"
				+ user.getName());
		getSession().update(user);
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("-------UserDaoImp.AddUser-----------"
				+ user.getName());
		getSession().delete(user);
	}

}
