package cn.com.crowdtest.clear.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import cn.com.crowdtest.ws.generated.Product;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product", propOrder = { "apkAddress", "description",
		"desktopAddress", "icon", "loginXmlFile", "productId", "productName",
		"releaseTime", "status", "subcategoryName", "categoryName", "version", "webLink" })
public class ProductClear {
	private String apkAddress;
	private String description;
	private String desktopAddress;
	private String icon;
	private String loginXmlFile;
	private Integer productId;
	private String productName;
	@XmlSchemaType(name = "dateTime")
	private XMLGregorianCalendar releaseTime;
	private Boolean status;
	private String subcategoryName;
	private String categoryName;
	private String version;
	private String webLink;

	public ProductClear() {

	}

	public ProductClear(Product product) {
		apkAddress = product.getApkAddress();
		description = product.getDescription();
		desktopAddress = product.getDesktopAddress();
		icon = product.getIcon();
		loginXmlFile = product.getLoginXmlFile();
		productId = product.getProductId();
		productName = product.getProductName();
		releaseTime = product.getReleaseTime();
		status = product.isStatus();
		version = product.getVersion();
		webLink = product.getWebLink();
		subcategoryName = product.getSubcategory().getSubcategoryName();
		categoryName = product.getSubcategory().getCategory().getCategoryName();
	}

	public String getApkAddress() {
		return apkAddress;
	}

	public void setApkAddress(String apkAddress) {
		this.apkAddress = apkAddress;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDesktopAddress() {
		return desktopAddress;
	}

	public void setDesktopAddress(String desktopAddress) {
		this.desktopAddress = desktopAddress;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getLoginXmlFile() {
		return loginXmlFile;
	}

	public void setLoginXmlFile(String loginXmlFile) {
		this.loginXmlFile = loginXmlFile;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public XMLGregorianCalendar getReleaseTime() {
		return releaseTime;
	}

	public void setReleaseTime(XMLGregorianCalendar releaseTime) {
		this.releaseTime = releaseTime;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getSubcategoryName() {
		return subcategoryName;
	}

	public void setSubcategoryName(String subcategoryName) {
		this.subcategoryName = subcategoryName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getWebLink() {
		return webLink;
	}

	public void setWebLink(String webLink) {
		this.webLink = webLink;
	}
	
	

}
