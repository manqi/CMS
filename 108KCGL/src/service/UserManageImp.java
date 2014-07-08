package service;

import javax.annotation.Resource;

import org.hibernate.Session;

import dao.UserDao;
import entity.User;

public class UserManageImp implements UserManage{
	@Resource  
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}
	
	public Session getSession() {
		return userDao.getSession();
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("------UserManageImp.adddUser--------"+user.getName());
		userDao.addUser(user);
	}

	@Override
	public void modifyUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("------UserManageImp.adddUser--------"+user.getName());
		userDao.modifyUser(user);
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("------UserManageImp.adddUser--------"+user.getName());
		userDao.deleteUser(user);
	}

}
