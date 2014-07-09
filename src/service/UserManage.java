package service;

import org.hibernate.Session;

import entity.User;

public interface UserManage {
	public void addUser(User user);
	public void modifyUser(User user);
	public Session getSession();
	public void deleteUser(User user);
}
