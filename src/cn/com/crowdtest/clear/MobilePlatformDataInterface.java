package cn.com.crowdtest.clear;

import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import cn.com.crowdtest.clear.entity.Results;
import cn.com.crowdtest.clear.entity.TestTaskClearArray;
import cn.com.crowdtest.process.TaskManagement;
import cn.com.crowdtest.process.UserManagement;
import cn.com.crowdtest.ws.generated.JoinTask;
import cn.com.crowdtest.ws.generated.Page;
import cn.com.crowdtest.ws.generated.TestTask;

@Path("mobile")
public class MobilePlatformDataInterface {
	TaskManagement taskManagement = new TaskManagement();
	UserManagement userManagement = new UserManagement();

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

}
