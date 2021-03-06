package cn.com.crowdtest.ws.generated;

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
@WebService(name = "BugReportManagementDelegate", targetNamespace = "http://datawebservices.crowdsourcedtesting.com.cn/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface BugReportManagementDelegate {

	/**
	 * 
	 * @param bugReport
	 */
	@WebMethod
	public void addBugReport(
			@WebParam(name = "BugReport", partName = "BugReport") BugReport bugReport);

	/**
	 * 
	 * @param id
	 * @return returns cn.com.crowdtest.ws.generated.BugReport
	 */
	@WebMethod
	@WebResult(partName = "return")
	public BugReport findById(@WebParam(name = "id", partName = "id") int id);

	/**
	 * 
	 * @param taskID
	 * @return returns cn.com.crowdtest.ws.generated.BugReportArray
	 */
	@WebMethod
	@WebResult(partName = "return")
	public BugReportArray getBugReportByTask(
			@WebParam(name = "taskID", partName = "taskID") int taskID);

}
