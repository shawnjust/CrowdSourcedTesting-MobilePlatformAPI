package cn.com.crowdtest.ws.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for testTask complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="testTask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="administrator" type="{http://datawebservices.crowdsourcedtesting.com.cn/}administrator" minOccurs="0"/>
 *         &lt;element name="isPassed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="perReward" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="product" type="{http://datawebservices.crowdsourcedtesting.com.cn/}product" minOccurs="0"/>
 *         &lt;element name="publisher" type="{http://datawebservices.crowdsourcedtesting.com.cn/}publisher" minOccurs="0"/>
 *         &lt;element name="taskEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="taskEnvironment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="taskStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="taskType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="wholeCredit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testTask", propOrder = { "administrator", "isPassed",
		"perReward", "product", "publisher", "taskEndTime", "taskEnvironment",
		"taskId", "taskStartTime", "taskType", "wholeCredit" })
public class TestTask {

	protected Administrator administrator;
	protected Boolean isPassed;
	protected Double perReward;
	protected Product product;
	protected Publisher publisher;
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar taskEndTime;
	protected String taskEnvironment;
	protected Integer taskId;
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar taskStartTime;
	protected Integer taskType;
	protected Double wholeCredit;

	/**
	 * Gets the value of the administrator property.
	 * 
	 * @return possible object is {@link Administrator }
	 * 
	 */
	public Administrator getAdministrator() {
		return administrator;
	}

	/**
	 * Sets the value of the administrator property.
	 * 
	 * @param value
	 *            allowed object is {@link Administrator }
	 * 
	 */
	public void setAdministrator(Administrator value) {
		this.administrator = value;
	}

	/**
	 * Gets the value of the isPassed property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isIsPassed() {
		return isPassed;
	}

	/**
	 * Sets the value of the isPassed property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setIsPassed(Boolean value) {
		this.isPassed = value;
	}

	/**
	 * Gets the value of the perReward property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getPerReward() {
		return perReward;
	}

	/**
	 * Sets the value of the perReward property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setPerReward(Double value) {
		this.perReward = value;
	}

	/**
	 * Gets the value of the product property.
	 * 
	 * @return possible object is {@link Product }
	 * 
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * Sets the value of the product property.
	 * 
	 * @param value
	 *            allowed object is {@link Product }
	 * 
	 */
	public void setProduct(Product value) {
		this.product = value;
	}

	/**
	 * Gets the value of the publisher property.
	 * 
	 * @return possible object is {@link Publisher }
	 * 
	 */
	public Publisher getPublisher() {
		return publisher;
	}

	/**
	 * Sets the value of the publisher property.
	 * 
	 * @param value
	 *            allowed object is {@link Publisher }
	 * 
	 */
	public void setPublisher(Publisher value) {
		this.publisher = value;
	}

	/**
	 * Gets the value of the taskEndTime property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getTaskEndTime() {
		return taskEndTime;
	}

	/**
	 * Sets the value of the taskEndTime property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setTaskEndTime(XMLGregorianCalendar value) {
		this.taskEndTime = value;
	}

	/**
	 * Gets the value of the taskEnvironment property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTaskEnvironment() {
		return taskEnvironment;
	}

	/**
	 * Sets the value of the taskEnvironment property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTaskEnvironment(String value) {
		this.taskEnvironment = value;
	}

	/**
	 * Gets the value of the taskId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getTaskId() {
		return taskId;
	}

	/**
	 * Sets the value of the taskId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setTaskId(Integer value) {
		this.taskId = value;
	}

	/**
	 * Gets the value of the taskStartTime property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getTaskStartTime() {
		return taskStartTime;
	}

	/**
	 * Sets the value of the taskStartTime property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setTaskStartTime(XMLGregorianCalendar value) {
		this.taskStartTime = value;
	}

	/**
	 * Gets the value of the taskType property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getTaskType() {
		return taskType;
	}

	/**
	 * Sets the value of the taskType property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setTaskType(Integer value) {
		this.taskType = value;
	}

	/**
	 * Gets the value of the wholeCredit property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getWholeCredit() {
		return wholeCredit;
	}

	/**
	 * Sets the value of the wholeCredit property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setWholeCredit(Double value) {
		this.wholeCredit = value;
	}

}
