package action;

import javax.annotation.Resource;

import service.KclbManage;
import entity.Kclb;

public class KclbAction {
	private Kclb kclb;
	
	@Resource  
	private KclbManage kclbManage;

	public Kclb getKclb() {
		return kclb;
	}

	public void setKclb(Kclb kclb) {
		this.kclb = kclb;
	}

	public KclbManage getKclbManage() {
		return kclbManage;
	}

	public void setKclbManage(KclbManage kclbManage) {
		this.kclbManage = kclbManage;
	}
	
	public String addKclb()
	{
		System.out.println("-------userAction.addKclb--------"+kclb.getKclb());
		
		kclbManage.addKclb(kclb);
		return "success";
	}
	
	public String modifyKclb()
	{
		System.out.println("-------userAction.modifyKclb--------"+kclb.getKclb());
		kclbManage.modifyKclb(kclb);
		return "success";
	}
	
	public String deleteKclb()
	{
		System.out.println("-------userAction.deleteKclb--------"+kclb.getKclb());
		kclbManage.deleteKclb(kclb);
		return "success";
	}
	
}
