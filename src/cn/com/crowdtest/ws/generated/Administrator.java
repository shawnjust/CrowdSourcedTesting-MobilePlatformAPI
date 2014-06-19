package cn.com.crowdtest.ws.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for administrator complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="administrator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="administratorAuthority" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="administratorEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="administratorId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="administratorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="administratorOccupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="administratorPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="testTasks" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "administrator", propOrder = { "administratorAuthority",
		"administratorEmail", "administratorId", "administratorName",
		"administratorOccupation", "administratorPassword", "testTasks" })
public class Administrator {

	protected Boolean administratorAuthority;
	protected String administratorEmail;
	protected Integer administratorId;
	protected String administratorName;
	protected String administratorOccupation;
	protected String administratorPassword;
	@XmlElement(nillable = true)
	protected List<Object> testTasks;

	/**
	 * Gets the value of the administratorAuthority property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isAdministratorAuthority() {
		return administratorAuthority;
	}

	/**
	 * Sets the value of the administratorAuthority property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setAdministratorAuthority(Boolean value) {
		this.administratorAuthority = value;
	}

	/**
	 * Gets the value of the administratorEmail property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAdministratorEmail() {
		return administratorEmail;
	}

	/**
	 * Sets the value of the administratorEmail property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAdministratorEmail(String value) {
		this.administratorEmail = value;
	}

	/**
	 * Gets the value of the administratorId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getAdministratorId() {
		return administratorId;
	}

	/**
	 * Sets the value of the administratorId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setAdministratorId(Integer value) {
		this.administratorId = value;
	}

	/**
	 * Gets the value of the administratorName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAdministratorName() {
		return administratorName;
	}

	/**
	 * Sets the value of the administratorName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAdministratorName(String value) {
		this.administratorName = value;
	}

	/**
	 * Gets the value of the administratorOccupation property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAdministratorOccupation() {
		return administratorOccupation;
	}

	/**
	 * Sets the value of the administratorOccupation property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAdministratorOccupation(String value) {
		this.administratorOccupation = value;
	}

	/**
	 * Gets the value of the administratorPassword property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAdministratorPassword() {
		return administratorPassword;
	}

	/**
	 * Sets the value of the administratorPassword property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAdministratorPassword(String value) {
		this.administratorPassword = value;
	}

	/**
	 * Gets the value of the testTasks property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the testTasks property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getTestTasks().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Object }
	 * 
	 * 
	 */
	public List<Object> getTestTasks() {
		if (testTasks == null) {
			testTasks = new ArrayList<Object>();
		}
		return this.testTasks;
	}

}
