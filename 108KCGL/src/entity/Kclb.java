package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="kclb")
public class Kclb {
	private int id;
	private String kclbId;
	private String kclb;
	private String classType;
	private int cId;
	private boolean reset;
	private boolean retake;
	
	@Column(name="kclbId", length=30, nullable=false, unique=true)
	public String getKclbId() {
		return kclbId;
	}

	public void setKclbId(String kclbId) {
		this.kclbId = kclbId;
	}
	
	@Column(name="kclb", length=30, nullable=false, unique=true)
	public String getKclb() {
		return kclb;
	}

	public void setKclb(String kclb) {
		this.kclb = kclb;
	}
	
	@Column(name="classType", length=30, nullable=false)
	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}
	
	@Column(name="cId", length=30, nullable=false, unique=true)
	public int getCId() {
		return cId;
	}

	public void setCId(String cId) {
		this.cId=Integer.parseInt(cId);
	}
	
	@Column(name="reset", length=5, nullable=false)
	public boolean getReset() {
		return reset;
	}

	public void setReset(String reset) {
		if(reset.charAt(0)=='0')
			this.reset = false;
		else
			this.reset = true;
	}
	
	@Column(name="retake", length=5, nullable=false)
	public boolean getRetake() {
		return retake;
	}

	public void setRetake(String retake) {
		if(retake.charAt(0)=='0')
			this.retake = false;
		else
			this.retake = true;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

