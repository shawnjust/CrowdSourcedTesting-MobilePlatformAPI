package cn.com.crowdtest.ws.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for page complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="page">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DEFAULT_PERROWS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DEFAULT_MAX_PAGE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="currentPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="perRows" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalRows" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "page", propOrder = { "defaultperrows", "defaultmaxpage",
		"currentPage", "perRows", "totalRows" })
public class Page {

	@XmlElement(name = "DEFAULT_PERROWS")
	protected int defaultperrows;
	@XmlElement(name = "DEFAULT_MAX_PAGE")
	protected int defaultmaxpage;
	protected int currentPage;
	protected int perRows;
	protected int totalRows;

	/**
	 * Gets the value of the defaultperrows property.
	 * 
	 */
	public int getDEFAULTPERROWS() {
		return defaultperrows;
	}

	/**
	 * Sets the value of the defaultperrows property.
	 * 
	 */
	public void setDEFAULTPERROWS(int value) {
		this.defaultperrows = value;
	}

	/**
	 * Gets the value of the defaultmaxpage property.
	 * 
	 */
	public int getDEFAULTMAXPAGE() {
		return defaultmaxpage;
	}

	/**
	 * Sets the value of the defaultmaxpage property.
	 * 
	 */
	public void setDEFAULTMAXPAGE(int value) {
		this.defaultmaxpage = value;
	}

	/**
	 * Gets the value of the currentPage property.
	 * 
	 */
	public int getCurrentPage() {
		return currentPage;
	}

	/**
	 * Sets the value of the currentPage property.
	 * 
	 */
	public void setCurrentPage(int value) {
		this.currentPage = value;
	}

	/**
	 * Gets the value of the perRows property.
	 * 
	 */
	public int getPerRows() {
		return perRows;
	}

	/**
	 * Sets the value of the perRows property.
	 * 
	 */
	public void setPerRows(int value) {
		this.perRows = value;
	}

	/**
	 * Gets the value of the totalRows property.
	 * 
	 */
	public int getTotalRows() {
		return totalRows;
	}

	/**
	 * Sets the value of the totalRows property.
	 * 
	 */
	public void setTotalRows(int value) {
		this.totalRows = value;
	}

}
