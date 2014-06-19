package cn.com.crowdtest.ws.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for bugReport complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="bugReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bugLevel" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
 *         &lt;element name="isSelected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="operation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="picture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reportId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reportTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reportType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="submitTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="testTask" type="{http://datawebservices.crowdsourcedtesting.com.cn/}testTask" minOccurs="0"/>
 *         &lt;element name="tester" type="{http://datawebservices.crowdsourcedtesting.com.cn/}tester" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bugReport", propOrder = { "bugLevel", "isSelected",
		"operation", "operationResult", "picture", "reportId", "reportTitle",
		"reportType", "submitTime", "testTask", "tester" })
public class BugReport {

	protected Byte bugLevel;
	protected Boolean isSelected;
	protected String operation;
	protected String operationResult;
	protected String picture;
	protected Integer reportId;
	protected String reportTitle;
	protected Boolean reportType;
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar submitTime;
	protected TestTask testTask;
	protected Tester tester;

	/**
	 * Gets the value of the bugLevel property.
	 * 
	 * @return possible object is {@link Byte }
	 * 
	 */
	public Byte getBugLevel() {
		return bugLevel;
	}

	/**
	 * Sets the value of the bugLevel property.
	 * 
	 * @param value
	 *            allowed object is {@link Byte }
	 * 
	 */
	public void setBugLevel(Byte value) {
		this.bugLevel = value;
	}

	/**
	 * Gets the value of the isSelected property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isIsSelected() {
		return isSelected;
	}

	/**
	 * Sets the value of the isSelected property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setIsSelected(Boolean value) {
		this.isSelected = value;
	}

	/**
	 * Gets the value of the operation property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOperation() {
		return operation;
	}

	/**
	 * Sets the value of the operation property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOperation(String value) {
		this.operation = value;
	}

	/**
	 * Gets the value of the operationResult property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOperationResult() {
		return operationResult;
	}

	/**
	 * Sets the value of the operationResult property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOperationResult(String value) {
		this.operationResult = value;
	}

	/**
	 * Gets the value of the picture property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPicture() {
		return picture;
	}

	/**
	 * Sets the value of the picture property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPicture(String value) {
		this.picture = value;
	}

	/**
	 * Gets the value of the reportId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getReportId() {
		return reportId;
	}

	/**
	 * Sets the value of the reportId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setReportId(Integer value) {
		this.reportId = value;
	}

	/**
	 * Gets the value of the reportTitle property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReportTitle() {
		return reportTitle;
	}

	/**
	 * Sets the value of the reportTitle property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReportTitle(String value) {
		this.reportTitle = value;
	}

	/**
	 * Gets the value of the reportType property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isReportType() {
		return reportType;
	}

	/**
	 * Sets the value of the reportType property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setReportType(Boolean value) {
		this.reportType = value;
	}

	/**
	 * Gets the value of the submitTime property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getSubmitTime() {
		return submitTime;
	}

	/**
	 * Sets the value of the submitTime property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setSubmitTime(XMLGregorianCalendar value) {
		this.submitTime = value;
	}

	/**
	 * Gets the value of the testTask property.
	 * 
	 * @return possible object is {@link TestTask }
	 * 
	 */
	public TestTask getTestTask() {
		return testTask;
	}

	/**
	 * Sets the value of the testTask property.
	 * 
	 * @param value
	 *            allowed object is {@link TestTask }
	 * 
	 */
	public void setTestTask(TestTask value) {
		this.testTask = value;
	}

	/**
	 * Gets the value of the tester property.
	 * 
	 * @return possible object is {@link Tester }
	 * 
	 */
	public Tester getTester() {
		return tester;
	}

	/**
	 * Sets the value of the tester property.
	 * 
	 * @param value
	 *            allowed object is {@link Tester }
	 * 
	 */
	public void setTester(Tester value) {
		this.tester = value;
	}

}
