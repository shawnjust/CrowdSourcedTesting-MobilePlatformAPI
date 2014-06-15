package cn.com.crowdtest.ws.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for joinTask complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="joinTask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="joinDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="joinTaskId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="testTask" type="{http://datawebservices.crowdsourcedtesting.com.cn/}testTask" minOccurs="0"/>
 *         &lt;element name="tester" type="{http://datawebservices.crowdsourcedtesting.com.cn/}tester" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "joinTask", propOrder = { "joinDate", "joinTaskId", "testTask",
		"tester" })
public class JoinTask {

	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar joinDate;
	protected Integer joinTaskId;
	protected TestTask testTask;
	protected Tester tester;

	/**
	 * Gets the value of the joinDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getJoinDate() {
		return joinDate;
	}

	/**
	 * Sets the value of the joinDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setJoinDate(XMLGregorianCalendar value) {
		this.joinDate = value;
	}

	/**
	 * Gets the value of the joinTaskId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getJoinTaskId() {
		return joinTaskId;
	}

	/**
	 * Sets the value of the joinTaskId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setJoinTaskId(Integer value) {
		this.joinTaskId = value;
	}

	/**
	 * Gets the value of the testTask property.
	 * 
	 * @return possible object is {@link TestTask }
	 * 
	 */
	public TestTask getTestTask() {
		return testTask;
	}

	/**
	 * Sets the value of the testTask property.
	 * 
	 * @param value
	 *            allowed object is {@link TestTask }
	 * 
	 */
	public void setTestTask(TestTask value) {
		this.testTask = value;
	}

	/**
	 * Gets the value of the tester property.
	 * 
	 * @return possible object is {@link Tester }
	 * 
	 */
	public Tester getTester() {
		return tester;
	}

	/**
	 * Sets the value of the tester property.
	 * 
	 * @param value
	 *            allowed object is {@link Tester }
	 * 
	 */
	public void setTester(Tester value) {
		this.tester = value;
	}

}
