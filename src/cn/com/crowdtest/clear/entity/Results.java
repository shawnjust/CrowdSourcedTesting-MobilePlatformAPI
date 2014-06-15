package cn.com.crowdtest.clear.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "results", propOrder = { "result", "message" })
public class Results {
	private Boolean result = null;
	private String message = null;

	public Results() {

	}

	public Results(Boolean b) {
		result = b;
	}

	public Results(String s) {
		message = s;
	}
	
	public Results(Boolean b, String s) {
		result = b;
		message = s;
	}

	public Boolean getResult() {
		return result;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
