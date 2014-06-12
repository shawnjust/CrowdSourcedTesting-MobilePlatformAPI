package cn.com.crowdtest.ws.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for publisher complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="publisher">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="administrator" type="{http://datawebservices.crowdsourcedtesting.com.cn/}administrator" minOccurs="0"/>
 *         &lt;element name="businessLicense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isPassed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="publisherAuthority" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="publisherCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publisherConnectEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publisherCredit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="publisherId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="publisherLogEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publisherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publisherPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publisherPhoto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publisherType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "publisher", propOrder = { "administrator", "businessLicense",
		"isPassed", "publisherAuthority", "publisherCompany",
		"publisherConnectEmail", "publisherCredit", "publisherId",
		"publisherLogEmail", "publisherName", "publisherPassword",
		"publisherPhoto", "publisherType" })
public class Publisher {

	protected Administrator administrator;
	protected String businessLicense;
	protected Boolean isPassed;
	protected Boolean publisherAuthority;
	protected String publisherCompany;
	protected String publisherConnectEmail;
	protected Double publisherCredit;
	protected Integer publisherId;
	protected String publisherLogEmail;
	protected String publisherName;
	protected String publisherPassword;
	protected String publisherPhoto;
	protected Boolean publisherType;

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
	 * Gets the value of the businessLicense property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBusinessLicense() {
		return businessLicense;
	}

	/**
	 * Sets the value of the businessLicense property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBusinessLicense(String value) {
		this.businessLicense = value;
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
	 * Gets the value of the publisherAuthority property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isPublisherAuthority() {
		return publisherAuthority;
	}

	/**
	 * Sets the value of the publisherAuthority property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setPublisherAuthority(Boolean value) {
		this.publisherAuthority = value;
	}

	/**
	 * Gets the value of the publisherCompany property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPublisherCompany() {
		return publisherCompany;
	}

	/**
	 * Sets the value of the publisherCompany property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPublisherCompany(String value) {
		this.publisherCompany = value;
	}

	/**
	 * Gets the value of the publisherConnectEmail property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPublisherConnectEmail() {
		return publisherConnectEmail;
	}

	/**
	 * Sets the value of the publisherConnectEmail property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPublisherConnectEmail(String value) {
		this.publisherConnectEmail = value;
	}

	/**
	 * Gets the value of the publisherCredit property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getPublisherCredit() {
		return publisherCredit;
	}

	/**
	 * Sets the value of the publisherCredit property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setPublisherCredit(Double value) {
		this.publisherCredit = value;
	}

	/**
	 * Gets the value of the publisherId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getPublisherId() {
		return publisherId;
	}

	/**
	 * Sets the value of the publisherId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setPublisherId(Integer value) {
		this.publisherId = value;
	}

	/**
	 * Gets the value of the publisherLogEmail property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPublisherLogEmail() {
		return publisherLogEmail;
	}

	/**
	 * Sets the value of the publisherLogEmail property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPublisherLogEmail(String value) {
		this.publisherLogEmail = value;
	}

	/**
	 * Gets the value of the publisherName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPublisherName() {
		return publisherName;
	}

	/**
	 * Sets the value of the publisherName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPublisherName(String value) {
		this.publisherName = value;
	}

	/**
	 * Gets the value of the publisherPassword property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPublisherPassword() {
		return publisherPassword;
	}

	/**
	 * Sets the value of the publisherPassword property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPublisherPassword(String value) {
		this.publisherPassword = value;
	}

	/**
	 * Gets the value of the publisherPhoto property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPublisherPhoto() {
		return publisherPhoto;
	}

	/**
	 * Sets the value of the publisherPhoto property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPublisherPhoto(String value) {
		this.publisherPhoto = value;
	}

	/**
	 * Gets the value of the publisherType property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isPublisherType() {
		return publisherType;
	}

	/**
	 * Sets the value of the publisherType property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setPublisherType(Boolean value) {
		this.publisherType = value;
	}

}
