package cn.com.crowdtest.ws.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for product complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apkAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desktopAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loginXmlFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="releaseTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="subcategory" type="{http://datawebservices.crowdsourcedtesting.com.cn/}subcategory" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="webLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product", propOrder = { "apkAddress", "description",
		"desktopAddress", "icon", "loginXmlFile", "productId", "productName",
		"releaseTime", "status", "subcategory", "version", "webLink" })
public class Product {

	protected String apkAddress;
	protected String description;
	protected String desktopAddress;
	protected String icon;
	protected String loginXmlFile;
	protected Integer productId;
	protected String productName;
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar releaseTime;
	protected Boolean status;
	protected Subcategory subcategory;
	protected String version;
	protected String webLink;

	/**
	 * Gets the value of the apkAddress property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getApkAddress() {
		return apkAddress;
	}

	/**
	 * Sets the value of the apkAddress property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setApkAddress(String value) {
		this.apkAddress = value;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescription(String value) {
		this.description = value;
	}

	/**
	 * Gets the value of the desktopAddress property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDesktopAddress() {
		return desktopAddress;
	}

	/**
	 * Sets the value of the desktopAddress property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDesktopAddress(String value) {
		this.desktopAddress = value;
	}

	/**
	 * Gets the value of the icon property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * Sets the value of the icon property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIcon(String value) {
		this.icon = value;
	}

	/**
	 * Gets the value of the loginXmlFile property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLoginXmlFile() {
		return loginXmlFile;
	}

	/**
	 * Sets the value of the loginXmlFile property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLoginXmlFile(String value) {
		this.loginXmlFile = value;
	}

	/**
	 * Gets the value of the productId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getProductId() {
		return productId;
	}

	/**
	 * Sets the value of the productId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setProductId(Integer value) {
		this.productId = value;
	}

	/**
	 * Gets the value of the productName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * Sets the value of the productName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProductName(String value) {
		this.productName = value;
	}

	/**
	 * Gets the value of the releaseTime property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getReleaseTime() {
		return releaseTime;
	}

	/**
	 * Sets the value of the releaseTime property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setReleaseTime(XMLGregorianCalendar value) {
		this.releaseTime = value;
	}

	/**
	 * Gets the value of the status property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isStatus() {
		return status;
	}

	/**
	 * Sets the value of the status property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setStatus(Boolean value) {
		this.status = value;
	}

	/**
	 * Gets the value of the subcategory property.
	 * 
	 * @return possible object is {@link Subcategory }
	 * 
	 */
	public Subcategory getSubcategory() {
		return subcategory;
	}

	/**
	 * Sets the value of the subcategory property.
	 * 
	 * @param value
	 *            allowed object is {@link Subcategory }
	 * 
	 */
	public void setSubcategory(Subcategory value) {
		this.subcategory = value;
	}

	/**
	 * Gets the value of the version property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Sets the value of the version property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVersion(String value) {
		this.version = value;
	}

	/**
	 * Gets the value of the webLink property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWebLink() {
		return webLink;
	}

	/**
	 * Sets the value of the webLink property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWebLink(String value) {
		this.webLink = value;
	}

}
