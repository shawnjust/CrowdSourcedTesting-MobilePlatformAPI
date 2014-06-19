package cn.com.crowdtest.clear.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "bugReport")
@XmlAccessorType(XmlAccessType.FIELD)
public class BugReportClear {
	protected String operation;
	protected String operationResult;
	protected String picture;
	protected String reportTitle;
	protected Integer testTaskId;
	protected Integer testerId;

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getOperationResult() {
		return operationResult;
	}

	public void setOperationResult(String operationResult) {
		this.operationResult = operationResult;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getReportTitle() {
		return reportTitle;
	}

	public void setReportTitle(String reportTitle) {
		this.reportTitle = reportTitle;
	}

	public Integer getTestTaskId() {
		return testTaskId;
	}

	public void setTestTaskId(Integer testTaskId) {
		this.testTaskId = testTaskId;
	}

	public Integer getTesterId() {
		return testerId;
	}

	public void setTesterId(Integer testerId) {
		this.testerId = testerId;
	}

	@Override
	public String toString() {
		return new StringBuilder().append("ReportTitle: ").append(reportTitle)
				.append(" Operation: ").append(operation).append(" Result: ")
				.append(operationResult).append(" Picture: ").append(picture)
				.append(" TesterId: ").append(testerId).append(" TestTaskId: ")
				.append(testTaskId).toString();
	}

}
