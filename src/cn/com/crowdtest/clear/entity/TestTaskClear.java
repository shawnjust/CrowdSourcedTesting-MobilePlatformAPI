package cn.com.crowdtest.clear.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import cn.com.crowdtest.ws.generated.TestTask;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testTask", propOrder = { "administrator", "isPassed",
		"perReward", "product", "publisher", "taskEndTime", "taskEnvironment",
		"taskId", "taskStartTime", "taskType", "wholeCredit" })
public class TestTaskClear {

	protected AdministratorClear administrator;
	protected Boolean isPassed;
	protected Double perReward;
	protected ProductClear product;
	protected PublisherClear publisher;
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar taskEndTime;
	protected String taskEnvironment;
	protected Integer taskId;
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar taskStartTime;
	protected Integer taskType;
	protected Double wholeCredit;

	public TestTaskClear() {

	}

	public TestTaskClear(TestTask testTask) {
		administrator = new AdministratorClear(testTask.getAdministrator());
		isPassed = testTask.isIsPassed();
		perReward = testTask.getPerReward();
		product = new ProductClear(testTask.getProduct());
		publisher = new PublisherClear(testTask.getPublisher());
		taskEndTime = testTask.getTaskEndTime();
		taskEnvironment = testTask.getTaskEnvironment();
		taskId = testTask.getTaskId();
		taskStartTime = testTask.getTaskStartTime();
		taskType = testTask.getTaskType();
		wholeCredit = testTask.getWholeCredit();
	}

	public AdministratorClear getAdministrator() {
		return administrator;
	}

	public void setAdministrator(AdministratorClear administrator) {
		this.administrator = administrator;
	}

	public Boolean getIsPassed() {
		return isPassed;
	}

	public void setIsPassed(Boolean isPassed) {
		this.isPassed = isPassed;
	}

	public Double getPerReward() {
		return perReward;
	}

	public void setPerReward(Double perReward) {
		this.perReward = perReward;
	}

	public ProductClear getProduct() {
		return product;
	}

	public void setProduct(ProductClear product) {
		this.product = product;
	}

	public XMLGregorianCalendar getTaskEndTime() {
		return taskEndTime;
	}

	public void setTaskEndTime(XMLGregorianCalendar taskEndTime) {
		this.taskEndTime = taskEndTime;
	}

	public String getTaskEnvironment() {
		return taskEnvironment;
	}

	public void setTaskEnvironment(String taskEnvironment) {
		this.taskEnvironment = taskEnvironment;
	}

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public XMLGregorianCalendar getTaskStartTime() {
		return taskStartTime;
	}

	public void setTaskStartTime(XMLGregorianCalendar taskStartTime) {
		this.taskStartTime = taskStartTime;
	}

	public Integer getTaskType() {
		return taskType;
	}

	public void setTaskType(Integer taskType) {
		this.taskType = taskType;
	}

	public Double getWholeCredit() {
		return wholeCredit;
	}

	public void setWholeCredit(Double wholeCredit) {
		this.wholeCredit = wholeCredit;
	}

	public PublisherClear getPublisher() {
		return publisher;
	}

	public void setPublisher(PublisherClear publisher) {
		this.publisher = publisher;
	}

}
