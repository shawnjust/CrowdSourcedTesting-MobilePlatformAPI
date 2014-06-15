package cn.com.crowdtest.ws.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for tester complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="tester">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bugReports" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="changeGifts" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasAuthority" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="joinQuestionnaires" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="taskComments" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="testerBirthday" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="testerCredit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="testerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="testerGender" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="testerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="testerMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="testerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="testerPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="testerPhoto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tester", propOrder = { "bugReports", "changeGifts",
		"hasAuthority", "joinQuestionnaires", "taskComments", "testerBirthday",
		"testerCredit", "testerEmail", "testerGender", "testerId",
		"testerMobile", "testerName", "testerPassword", "testerPhoto" })
public class Tester {

	@XmlElement(nillable = true)
	protected List<Object> bugReports;
	@XmlElement(nillable = true)
	protected List<Object> changeGifts;
	protected Boolean hasAuthority;
	@XmlElement(nillable = true)
	protected List<Object> joinQuestionnaires;
	@XmlElement(nillable = true)
	protected List<Object> taskComments;
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar testerBirthday;
	protected Double testerCredit;
	protected String testerEmail;
	protected Boolean testerGender;
	protected Integer testerId;
	protected String testerMobile;
	protected String testerName;
	protected String testerPassword;
	protected String testerPhoto;

	/**
	 * Gets the value of the bugReports property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the bugReports property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getBugReports().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Object }
	 * 
	 * 
	 */
	public List<Object> getBugReports() {
		if (bugReports == null) {
			bugReports = new ArrayList<Object>();
		}
		return this.bugReports;
	}

	/**
	 * Gets the value of the changeGifts property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the changeGifts property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getChangeGifts().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Object }
	 * 
	 * 
	 */
	public List<Object> getChangeGifts() {
		if (changeGifts == null) {
			changeGifts = new ArrayList<Object>();
		}
		return this.changeGifts;
	}

	/**
	 * Gets the value of the hasAuthority property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isHasAuthority() {
		return hasAuthority;
	}

	/**
	 * Sets the value of the hasAuthority property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setHasAuthority(Boolean value) {
		this.hasAuthority = value;
	}

	/**
	 * Gets the value of the joinQuestionnaires property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the joinQuestionnaires property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getJoinQuestionnaires().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Object }
	 * 
	 * 
	 */
	public List<Object> getJoinQuestionnaires() {
		if (joinQuestionnaires == null) {
			joinQuestionnaires = new ArrayList<Object>();
		}
		return this.joinQuestionnaires;
	}

	/**
	 * Gets the value of the taskComments property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the taskComments property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getTaskComments().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Object }
	 * 
	 * 
	 */
	public List<Object> getTaskComments() {
		if (taskComments == null) {
			taskComments = new ArrayList<Object>();
		}
		return this.taskComments;
	}

	/**
	 * Gets the value of the testerBirthday property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getTesterBirthday() {
		return testerBirthday;
	}

	/**
	 * Sets the value of the testerBirthday property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setTesterBirthday(XMLGregorianCalendar value) {
		this.testerBirthday = value;
	}

	/**
	 * Gets the value of the testerCredit property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getTesterCredit() {
		return testerCredit;
	}

	/**
	 * Sets the value of the testerCredit property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setTesterCredit(Double value) {
		this.testerCredit = value;
	}

	/**
	 * Gets the value of the testerEmail property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTesterEmail() {
		return testerEmail;
	}

	/**
	 * Sets the value of the testerEmail property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTesterEmail(String value) {
		this.testerEmail = value;
	}

	/**
	 * Gets the value of the testerGender property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isTesterGender() {
		return testerGender;
	}

	/**
	 * Sets the value of the testerGender property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setTesterGender(Boolean value) {
		this.testerGender = value;
	}

	/**
	 * Gets the value of the testerId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getTesterId() {
		return testerId;
	}

	/**
	 * Sets the value of the testerId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setTesterId(Integer value) {
		this.testerId = value;
	}

	/**
	 * Gets the value of the testerMobile property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTesterMobile() {
		return testerMobile;
	}

	/**
	 * Sets the value of the testerMobile property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTesterMobile(String value) {
		this.testerMobile = value;
	}

	/**
	 * Gets the value of the testerName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTesterName() {
		return testerName;
	}

	/**
	 * Sets the value of the testerName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTesterName(String value) {
		this.testerName = value;
	}

	/**
	 * Gets the value of the testerPassword property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTesterPassword() {
		return testerPassword;
	}

	/**
	 * Sets the value of the testerPassword property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTesterPassword(String value) {
		this.testerPassword = value;
	}

	/**
	 * Gets the value of the testerPhoto property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTesterPhoto() {
		return testerPhoto;
	}

	/**
	 * Sets the value of the testerPhoto property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTesterPhoto(String value) {
		this.testerPhoto = value;
	}

}
