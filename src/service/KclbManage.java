package service;

import org.hibernate.Session;

import entity.Kclb;

public interface KclbManage {
	public void addKclb(Kclb kclb);
	public void deleteKclb(Kclb kclb);
	public void modifyKclb(Kclb kclb);
	public void queryKclb(Kclb kclb);
	public void exportKclb(Kclb kclb);
	public Session getSession();
}
