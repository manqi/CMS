package dao;

import org.hibernate.Session;

import entity.User;

public interface UserDao {
	void addUser(User user);
	void modifyUser(User user);
	void deleteUser(User user);
	Session getSession();
}
