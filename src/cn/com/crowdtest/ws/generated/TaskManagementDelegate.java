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
@WebService(name = "TaskManagementDelegate", targetNamespace = "http://datawebservices.crowdsourcedtesting.com.cn/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface TaskManagementDelegate {

	/**
	 * 
	 * @param page
	 * @return returns cn.com.crowdtest.ws.generated.TestTaskArray
	 */
	@WebMethod
	@WebResult(partName = "return")
	public TestTaskArray findcheckedWebByPage(
			@WebParam(name = "page", partName = "page") Page page);

	/**
	 * 
	 * @param testerId
	 * @param testTaskId
	 * @return returns cn.com.crowdtest.ws.generated.JoinTask
	 */
	@WebMethod
	@WebResult(partName = "return")
	public JoinTask addJoinTask(
			@WebParam(name = "testerId", partName = "testerId") int testerId,
			@WebParam(name = "testTaskId", partName = "testTaskId") int testTaskId);

	/**
	 * 
	 * @param testerId
	 * @param testTaskId
	 * @return returns boolean
	 */
	@WebMethod
	@WebResult(partName = "return")
	public boolean isTesterJoinTask(
			@WebParam(name = "testerId", partName = "testerId") int testerId,
			@WebParam(name = "testTaskId", partName = "testTaskId") int testTaskId);

	/**
	 * 
	 * @param product
	 * @param wholeCredit
	 * @param perReward
	 * @param beginTime
	 * @param endTime
	 * @param publisher
	 * @param productType
	 * @return returns cn.com.crowdtest.ws.generated.TestTask
	 */
	@WebMethod
	@WebResult(partName = "return")
	public TestTask addTestTask(
			@WebParam(name = "product", partName = "product") Product product,
			@WebParam(name = "productType", partName = "productType") int productType,
			@WebParam(name = "publisher", partName = "publisher") Publisher publisher,
			@WebParam(name = "beginTime", partName = "beginTime") Date beginTime,
			@WebParam(name = "endTime", partName = "endTime") Date endTime,
			@WebParam(name = "perReward", partName = "perReward") double perReward,
			@WebParam(name = "wholeCredit", partName = "wholeCredit") double wholeCredit);

	/**
	 * 
	 * @param page
	 * @return returns cn.com.crowdtest.ws.generated.TestTaskArray
	 */
	@WebMethod
	@WebResult(partName = "return")
	public TestTaskArray findUncheckedWebByPage(
			@WebParam(name = "page", partName = "page") Page page);

	/**
	 * 
	 * @return returns int
	 */
	@WebMethod
	@WebResult(partName = "return")
	public int getUncheckedWebTotalRows();

	/**
	 * 
	 * @param page
	 * @return returns cn.com.crowdtest.ws.generated.TestTaskArray
	 */
	@WebMethod
	@WebResult(partName = "return")
	public TestTaskArray findUncheckedAndroidByPage(
			@WebParam(name = "page", partName = "page") Page page);

	/**
	 * 
	 * @return returns int
	 */
	@WebMethod
	@WebResult(partName = "return")
	public int getUncheckedAndroidTotalRows();

	/**
	 * 
	 * @param page
	 * @return returns cn.com.crowdtest.ws.generated.TestTaskArray
	 */
	@WebMethod
	@WebResult(partName = "return")
	public TestTaskArray findUncheckedDesktopByPage(
			@WebParam(name = "page", partName = "page") Page page);

	/**
	 * 
	 * @return returns int
	 */
	@WebMethod
	@WebResult(partName = "return")
	public int getUncheckedDesktopTotalRows();

	/**
	 * 
	 * @param page
	 * @param publisher
	 * @return returns cn.com.crowdtest.ws.generated.TestTaskArray
	 */
	@WebMethod
	@WebResult(partName = "return")
	public TestTaskArray findPublisherWebTestTaskByPage(
			@WebParam(name = "page", partName = "page") Page page,
			@WebParam(name = "publisher", partName = "publisher") Publisher publisher);

	/**
	 * 
	 * @param icon
	 * @param description
	 * @param webLink
	 * @param productName
	 * @return returns cn.com.crowdtest.ws.generated.Product
	 */
	@WebMethod
	@WebResult(partName = "return")
	public Product addWebProduct(
			@WebParam(name = "productName", partName = "productName") String productName,
			@WebParam(name = "icon", partName = "icon") String icon,
			@WebParam(name = "webLink", partName = "webLink") String webLink,
			@WebParam(name = "description", partName = "description") String description);

	/**
	 * 
	 * @param icon
	 * @param appLocation
	 * @param description
	 * @param productName
	 * @return returns cn.com.crowdtest.ws.generated.Product
	 */
	@WebMethod
	@WebResult(partName = "return")
	public Product addAndroidProduct(
			@WebParam(name = "productName", partName = "productName") String productName,
			@WebParam(name = "icon", partName = "icon") String icon,
			@WebParam(name = "appLocation", partName = "appLocation") String appLocation,
			@WebParam(name = "description", partName = "description") String description);

	/**
	 * 
	 * @param icon
	 * @param description
	 * @param desktopAddress
	 * @param productName
	 * @return returns cn.com.crowdtest.ws.generated.Product
	 */
	@WebMethod
	@WebResult(partName = "return")
	public Product addDesktopProduct(
			@WebParam(name = "productName", partName = "productName") String productName,
			@WebParam(name = "icon", partName = "icon") String icon,
			@WebParam(name = "desktopAddress", partName = "desktopAddress") String desktopAddress,
			@WebParam(name = "description", partName = "description") String description);

	/**
	 * 
	 * @param publisher
	 * @return returns int
	 */
	@WebMethod
	@WebResult(partName = "return")
	public int getPublisherWebTotalRows(
			@WebParam(name = "publisher", partName = "publisher") Publisher publisher);

	/**
	 * 
	 * @return returns int
	 */
	@WebMethod
	@WebResult(partName = "return")
	public int getcheckedWebTotalRows();

}
