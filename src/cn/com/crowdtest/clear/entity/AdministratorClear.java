package cn.com.crowdtest.clear.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import cn.com.crowdtest.ws.generated.Administrator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "administrator", propOrder = { "administratorEmail",
		"administratorId", "administratorName", "administratorOccupation" })
public class AdministratorClear {

	protected String administratorEmail;
	protected Integer administratorId;
	protected String administratorName;
	protected String administratorOccupation;

	public AdministratorClear() {

	}

	public AdministratorClear(Administrator admin) {
		administratorEmail = admin.getAdministratorEmail();
		administratorId = admin.getAdministratorId();
		administratorName = admin.getAdministratorName();
		administratorOccupation = admin.getAdministratorOccupation();
	}

	public String getAdministratorEmail() {
		return administratorEmail;
	}

	public void setAdministratorEmail(String administratorEmail) {
		this.administratorEmail = administratorEmail;
	}

	public Integer getAdministratorId() {
		return administratorId;
	}

	public void setAdministratorId(Integer administratorId) {
		this.administratorId = administratorId;
	}

	public String getAdministratorName() {
		return administratorName;
	}

	public void setAdministratorName(String administratorName) {
		this.administratorName = administratorName;
	}

	public String getAdministratorOccupation() {
		return administratorOccupation;
	}

	public void setAdministratorOccupation(String administratorOccupation) {
		this.administratorOccupation = administratorOccupation;
	}

}
