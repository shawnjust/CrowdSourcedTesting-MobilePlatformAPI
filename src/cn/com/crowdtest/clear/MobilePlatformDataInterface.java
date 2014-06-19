package cn.com.crowdtest.clear;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import cn.com.crowdtest.business.BugReportManagement;
import cn.com.crowdtest.business.TaskManagement;
import cn.com.crowdtest.business.UserManagement;
import cn.com.crowdtest.clear.entity.BugReportClear;
import cn.com.crowdtest.clear.entity.Results;
import cn.com.crowdtest.clear.entity.TestTaskClearArray;
import cn.com.crowdtest.ws.generated.BugReport;
import cn.com.crowdtest.ws.generated.JoinTask;
import cn.com.crowdtest.ws.generated.Page;
import cn.com.crowdtest.ws.generated.TestTask;
import cn.com.crowdtest.ws.generated.Tester;

@Path("mobile")
public class MobilePlatformDataInterface {
	TaskManagement taskManagement = new TaskManagement();
	UserManagement userManagement = new UserManagement();
	BugReportManagement bugReportManagement = new BugReportManagement();

	@Produces("application/xml")
	@Path("webTask")
	@GET
	public Response findCheckedWebByPage(@QueryParam("pageId") int p,
			@QueryParam("perPage") int per) {
		Page page = new Page();
		page.setCurrentPage(p);
		page.setPerRows(per);
		List<TestTask> list = taskManagement.findcheckedWebByPage(page);
		TestTaskClearArray array = new TestTaskClearArray(list);
		return Response.ok(array).build();
	}

	@POST
	@Path("isTester")
	@Produces("application/xml")
	public Response isTester(@FormParam("email") String email,
			@FormParam("password") String password) {
		System.out.println(email + " " + password);
		return Response.ok(
				new Results(userManagement.isTester(email, password))).build();
	}

	@POST
	@Path("addJoinTask")
	@Produces("application/xml")
	public Response addJoinTask(@FormParam("testerId") int testerId,
			@FormParam("testTaskId") int testTaskId) {
		System.out.println(testerId + " " + testTaskId);
		JoinTask joinTask = taskManagement.addJoinTask(testerId, testTaskId);
		if (joinTask == null) {
			return Response.ok(new Results(false, "数据库已经存在该记录")).build();
		}
		return Response.ok(joinTask).build();
	}

	@GET
	@Path("isTesterJoinTask")
	@Produces("application/xml")
	public Response isTesterJoinTask(@QueryParam("testerId") int testerId,
			@QueryParam("testTaskId") int testTaskId) {
		boolean result = taskManagement.isTesterJoinTask(testerId, testTaskId);
		return Response.ok(new Results(result)).build();
	}

	@POST
	@Path("addBugReport")
	@Consumes("application/xml")
	@Produces("application/xml")
	public Response addBugReport(BugReportClear bugReportClear) {
		System.out.println(bugReportClear.getTesterId() + " " + bugReportClear.getTestTaskId());
		BugReport bugReport = new BugReport();
		bugReport.setOperation(bugReportClear.getOperation());
		bugReport.setOperationResult(bugReportClear.getOperationResult());
		bugReport.setPicture(bugReportClear.getPicture());
		bugReport.setReportTitle(bugReportClear.getReportTitle());
		Tester tester = new Tester();
		tester.setTesterId(bugReportClear.getTesterId());
		TestTask testTask = new TestTask();
		testTask.setTaskId(bugReportClear.getTestTaskId());
		bugReport.setTester(tester);
		bugReport.setTestTask(testTask);
		bugReportManagement.addBugReport(bugReport);
		return Response.ok(new Results(true)).build();
	}
}
