package dao;

import org.hibernate.Session;

import entity.Kclb;

public interface KclbDao {
	void addKclb(Kclb kclb);
	void deleteKclb(Kclb kclb);
	void modifyKclb(Kclb kclb);
	void queryKclb(Kclb kclb);
	void exportKclb(Kclb kclb);
	Session getSession();
}