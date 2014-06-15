package cn.com.crowdtest.clear.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import cn.com.crowdtest.ws.generated.Publisher;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "publisher", propOrder = { "administrator", "businessLicense",
		"isPassed", "publisherAuthority", "publisherCompany",
		"publisherConnectEmail", "publisherCredit", "publisherId",
		"publisherLogEmail", "publisherName", "publisherPhoto", "publisherType" })
public class PublisherClear {

	protected AdministratorClear administrator;
	protected String businessLicense;
	protected Boolean isPassed;
	protected Boolean publisherAuthority;
	protected String publisherCompany;
	protected String publisherConnectEmail;
	protected Double publisherCredit;
	protected Integer publisherId;
	protected String publisherLogEmail;
	protected String publisherName;
	protected String publisherPhoto;
	protected Boolean publisherType;

	public PublisherClear() {

	}

	public PublisherClear(Publisher publisher) {
		administrator = new AdministratorClear(publisher.getAdministrator());
		businessLicense = publisher.getBusinessLicense();
		isPassed = publisher.isIsPassed();
		publisherAuthority = publisher.isPublisherAuthority();
		publisherCompany = publisher.getPublisherCompany();
		publisherConnectEmail = publisher.getPublisherConnectEmail();
		publisherCredit = publisher.getPublisherCredit();
		publisherId = publisher.getPublisherId();
		publisherLogEmail = publisher.getPublisherLogEmail();
		publisherName = publisher.getPublisherName();
		publisherPhoto = publisher.getPublisherPhoto();
		publisherType = publisher.isPublisherType();
	}

	public AdministratorClear getAdministrator() {
		return administrator;
	}

	public void setAdministrator(AdministratorClear administrator) {
		this.administrator = administrator;
	}

	public String getBusinessLicense() {
		return businessLicense;
	}

	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
	}

	public Boolean getIsPassed() {
		return isPassed;
	}

	public void setIsPassed(Boolean isPassed) {
		this.isPassed = isPassed;
	}

	public Boolean getPublisherAuthority() {
		return publisherAuthority;
	}

	public void setPublisherAuthority(Boolean publisherAuthority) {
		this.publisherAuthority = publisherAuthority;
	}

	public String getPublisherCompany() {
		return publisherCompany;
	}

	public void setPublisherCompany(String publisherCompany) {
		this.publisherCompany = publisherCompany;
	}

	public String getPublisherConnectEmail() {
		return publisherConnectEmail;
	}

	public void setPublisherConnectEmail(String publisherConnectEmail) {
		this.publisherConnectEmail = publisherConnectEmail;
	}

	public Double getPublisherCredit() {
		return publisherCredit;
	}

	public void setPublisherCredit(Double publisherCredit) {
		this.publisherCredit = publisherCredit;
	}

	public Integer getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}

	public String getPublisherLogEmail() {
		return publisherLogEmail;
	}

	public void setPublisherLogEmail(String publisherLogEmail) {
		this.publisherLogEmail = publisherLogEmail;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getPublisherPhoto() {
		return publisherPhoto;
	}

	public void setPublisherPhoto(String publisherPhoto) {
		this.publisherPhoto = publisherPhoto;
	}

	public Boolean getPublisherType() {
		return publisherType;
	}

	public void setPublisherType(Boolean publisherType) {
		this.publisherType = publisherType;
	}

}
