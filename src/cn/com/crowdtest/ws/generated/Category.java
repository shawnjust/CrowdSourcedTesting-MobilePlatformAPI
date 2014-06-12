package cn.com.crowdtest.ws.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for category complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="category">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoryId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="categoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plateformType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "category", propOrder = { "categoryId", "categoryName",
		"plateformType" })
public class Category {

	protected Integer categoryId;
	protected String categoryName;
	protected Boolean plateformType;

	/**
	 * Gets the value of the categoryId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getCategoryId() {
		return categoryId;
	}

	/**
	 * Sets the value of the categoryId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setCategoryId(Integer value) {
		this.categoryId = value;
	}

	/**
	 * Gets the value of the categoryName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * Sets the value of the categoryName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCategoryName(String value) {
		this.categoryName = value;
	}

	/**
	 * Gets the value of the plateformType property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isPlateformType() {
		return plateformType;
	}

	/**
	 * Sets the value of the plateformType property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setPlateformType(Boolean value) {
		this.plateformType = value;
	}

}
