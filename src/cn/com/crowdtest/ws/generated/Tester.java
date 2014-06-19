package cn.com.crowdtest.ws.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="hasAuthority" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "tester", propOrder = { "hasAuthority", "testerBirthday",
		"testerCredit", "testerEmail", "testerGender", "testerId",
		"testerMobile", "testerName", "testerPassword", "testerPhoto" })
public class Tester {

	protected Boolean hasAuthority;
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
