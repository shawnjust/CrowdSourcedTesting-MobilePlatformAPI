package cn.com.crowdtest.business;

import java.util.List;

import cn.com.crowdtest.ws.generated.BugReport;
import cn.com.crowdtest.ws.generated.BugReportManagementDelegate;
import cn.com.crowdtest.ws.generated.BugReportManagementService;

public class BugReportManagement {
	BugReportManagementService service = new BugReportManagementService();
	BugReportManagementDelegate delegate = service.getBugReportManagementPort();

	public BugReport findById(int id) {
		return delegate.findById(id);
	}

	public void addBugReport(BugReport instance) {
		delegate.addBugReport(instance);
	}

	public List<BugReport> getBugReportByTask(int taskID) {
		return delegate.getBugReportByTask(taskID).getItem();
	}
}
