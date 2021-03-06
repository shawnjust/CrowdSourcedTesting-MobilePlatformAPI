package cn.com.crowdtest.ws.generated;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "UserManagementDelegate", targetNamespace = "http://datawebservices.crowdsourcedtesting.com.cn/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface UserManagementDelegate {

	/**
	 * 
	 * @param email
	 * @param password
	 * @return returns cn.com.crowdtest.ws.generated.Publisher
	 */
	@WebMethod
	@WebResult(partName = "return")
	public Publisher isPublisher(
			@WebParam(name = "email", partName = "email") String email,
			@WebParam(name = "password", partName = "password") String password);

	/**
	 * 
	 * @param email
	 * @param password
	 * @return returns cn.com.crowdtest.ws.generated.Administrator
	 */
	@WebMethod
	@WebResult(partName = "return")
	public Administrator isAdministrator(
			@WebParam(name = "email", partName = "email") String email,
			@WebParam(name = "password", partName = "password") String password);

	/**
	 * 
	 * @param birthday
	 * @param email
	 * @param name
	 * @param gender
	 * @param credit
	 * @param password
	 * @param mobile
	 * @return returns cn.com.crowdtest.ws.generated.Tester
	 */
	@WebMethod
	@WebResult(partName = "return")
	public Tester addTester(
			@WebParam(name = "email", partName = "email") String email,
			@WebParam(name = "password", partName = "password") String password,
			@WebParam(name = "name", partName = "name") String name,
			@WebParam(name = "gender", partName = "gender") boolean gender,
			@WebParam(name = "mobile", partName = "mobile") String mobile,
			@WebParam(name = "birthday", partName = "birthday") Date birthday,
			@WebParam(name = "credit", partName = "credit") double credit);

	/**
	 * 
	 * @param authority
	 * @param publisherType
	 * @param email
	 * @param company
	 * @param name
	 * @param connectEmail
	 * @param credit
	 * @param password
	 * @return returns cn.com.crowdtest.ws.generated.Publisher
	 */
	@WebMethod
	@WebResult(partName = "return")
	public Publisher addPublisher(
			@WebParam(name = "name", partName = "name") String name,
			@WebParam(name = "email", partName = "email") String email,
			@WebParam(name = "password", partName = "password") String password,
			@WebParam(name = "credit", partName = "credit") double credit,
			@WebParam(name = "authority", partName = "authority") boolean authority,
			@WebParam(name = "publisherType", partName = "publisherType") boolean publisherType,
			@WebParam(name = "company", partName = "company") String company,
			@WebParam(name = "connectEmail", partName = "connectEmail") String connectEmail);

	/**
	 * 
	 * @param authority
	 * @param occupation
	 * @param email
	 * @param name
	 * @param password
	 * @return returns cn.com.crowdtest.ws.generated.Administrator
	 */
	@WebMethod
	@WebResult(partName = "return")
	public Administrator addAdministrator(
			@WebParam(name = "name", partName = "name") String name,
			@WebParam(name = "email", partName = "email") String email,
			@WebParam(name = "password", partName = "password") String password,
			@WebParam(name = "authority", partName = "authority") boolean authority,
			@WebParam(name = "occupation", partName = "occupation") String occupation);

	/**
	 * 
	 * @param email
	 * @return returns boolean
	 */
	@WebMethod
	@WebResult(partName = "return")
	public boolean checkPublisher(
			@WebParam(name = "email", partName = "email") String email);

	/**
	 * 
	 * @return returns cn.com.crowdtest.ws.generated.PublisherArray
	 */
	@WebMethod
	@WebResult(partName = "return")
	public PublisherArray viewAllPublisher();

	/**
	 * 
	 * @param page
	 * @return returns cn.com.crowdtest.ws.generated.PublisherArray
	 */
	@WebMethod
	@WebResult(partName = "return")
	public PublisherArray findUncheckedCompany(
			@WebParam(name = "page", partName = "page") Page page);

	/**
	 * 
	 * @param page
	 * @return returns cn.com.crowdtest.ws.generated.PublisherArray
	 */
	@WebMethod
	@WebResult(partName = "return")
	public PublisherArray findUncheckedPerson(
			@WebParam(name = "page", partName = "page") Page page);

	/**
	 * 
	 * @return returns int
	 */
	@WebMethod
	@WebResult(partName = "return")
	public int getUncheckedCompanyTotalRows();

	/**
	 * 
	 * @return returns int
	 */
	@WebMethod
	@WebResult(partName = "return")
	public int getUncheckedPersonTotalRows();

	/**
	 * 
	 * @param email
	 * @param password
	 * @return returns boolean
	 */
	@WebMethod
	@WebResult(partName = "return")
	public boolean isTester(
			@WebParam(name = "email", partName = "email") String email,
			@WebParam(name = "password", partName = "password") String password);

}
