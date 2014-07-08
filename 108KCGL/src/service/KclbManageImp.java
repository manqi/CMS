package service;

import javax.annotation.Resource;

import org.hibernate.Session;

import dao.KclbDao;
import entity.Kclb;

public class KclbManageImp implements KclbManage {
	@Resource  
	private KclbDao kclbDao;
	
	public KclbDao getKclbDao() {
		return kclbDao;
	}
	
	public Session getSession() {
		return kclbDao.getSession();
	}
	
	public void setKclbDao(KclbDao kclbDao) {
		this.kclbDao = kclbDao;
	}
	
	@Override
	public void addKclb(Kclb kclb) {
		// TODO Auto-generated method stub
		System.out.println("-------KclbManageImp.addKclb-----------"+ kclb.getKclb());
		kclbDao.addKclb(kclb);
	}

	@Override
	public void deleteKclb(Kclb kclb) {
		// TODO Auto-generated method stub
		System.out.println("-------KclbManageImp.deleteKclb-----------"+ kclb.getKclb());
		kclbDao.deleteKclb(kclb);
	}

	@Override
	public void modifyKclb(Kclb kclb) {
		// TODO Auto-generated method stub
		System.out.println("-------KclbManageImp.modifyKclb-----------"+ kclb.getKclb());
		kclbDao.modifyKclb(kclb);
	}

	@Override
	public void queryKclb(Kclb kclb) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exportKclb(Kclb kclb) {
		// TODO Auto-generated method stub
		
	}
	
}
