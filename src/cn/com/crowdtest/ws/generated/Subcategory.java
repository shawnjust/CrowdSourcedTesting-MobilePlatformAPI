package cn.com.crowdtest.ws.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for subcategory complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="subcategory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="category" type="{http://datawebservices.crowdsourcedtesting.com.cn/}category" minOccurs="0"/>
 *         &lt;element name="subcategoryId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="subcategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subcategory", propOrder = { "category", "subcategoryId",
		"subcategoryName" })
public class Subcategory {

	protected Category category;
	protected Integer subcategoryId;
	protected String subcategoryName;

	/**
	 * Gets the value of the category property.
	 * 
	 * @return possible object is {@link Category }
	 * 
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * Sets the value of the category property.
	 * 
	 * @param value
	 *            allowed object is {@link Category }
	 * 
	 */
	public void setCategory(Category value) {
		this.category = value;
	}

	/**
	 * Gets the value of the subcategoryId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getSubcategoryId() {
		return subcategoryId;
	}

	/**
	 * Sets the value of the subcategoryId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setSubcategoryId(Integer value) {
		this.subcategoryId = value;
	}

	/**
	 * Gets the value of the subcategoryName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSubcategoryName() {
		return subcategoryName;
	}

	/**
	 * Sets the value of the subcategoryName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSubcategoryName(String value) {
		this.subcategoryName = value;
	}

}
