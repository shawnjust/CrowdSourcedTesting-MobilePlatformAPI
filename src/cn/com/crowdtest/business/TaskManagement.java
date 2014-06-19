package cn.com.crowdtest.business;

import java.util.Date;
import java.util.List;

import cn.com.crowdtest.ws.generated.JoinTask;
import cn.com.crowdtest.ws.generated.Page;
import cn.com.crowdtest.ws.generated.Product;
import cn.com.crowdtest.ws.generated.Publisher;
import cn.com.crowdtest.ws.generated.TaskManagementDelegate;
import cn.com.crowdtest.ws.generated.TaskManagementService;
import cn.com.crowdtest.ws.generated.TestTask;

public class TaskManagement {

	TaskManagementService service = new TaskManagementService();
	TaskManagementDelegate delegate = service.getTaskManagementPort();

	public Product addWebProduct(String productName, String icon,
			String webLink, String description) {
		if (productName == null || icon == null || webLink == null
				|| description == null) {
			return null;
		}
		return delegate.addWebProduct(productName, icon, webLink, description);
	}

	public JoinTask addJoinTask(int testerId, int testTaskId) {
		if (!isTesterJoinTask(testerId, testTaskId)) {
			return delegate.addJoinTask(testerId, testTaskId);
		} else {
			return null;
		}
	}

	public Product addAndroidProduct(String productName, String icon,
			String appLocation, String description) {
		if (productName == null || icon == null || appLocation == null
				|| description == null) {
			return null;
		}
		return delegate.addAndroidProduct(productName, icon, appLocation,
				description);
	}

	public Product addDesktopProduct(String productName, String icon,
			String desktopAddress, String description) {
		if (productName == null || icon == null || desktopAddress == null
				|| description == null) {
			return null;
		}
		return delegate.addDesktopProduct(productName, icon, desktopAddress,
				description);
	}

	public TestTask addTestTask(Product product, int productType,
			Publisher publisher, Date beginTime, Date endTime,
			double perReward, double wholeCredit) {
		if (product == null || publisher == null || beginTime == null) {
			return null;
		}
		return delegate.addTestTask(product, productType, publisher, beginTime,
				endTime, perReward, wholeCredit);

	}

	public List<TestTask> findUncheckedWebByPage(Page page) {
		if (page == null) {
			return null;
		}
		return delegate.findUncheckedWebByPage(page).getItem();
	}

	public int getUncheckedWebTotalRows() {
		return delegate.getUncheckedWebTotalRows();
	}

	public List<TestTask> findUncheckedAndroidByPage(Page page) {
		if (page == null) {
			return null;
		}
		return delegate.findUncheckedAndroidByPage(page).getItem();
	}

	public int getUncheckedAndroidTotalRows() {
		return delegate.getUncheckedAndroidTotalRows();
	}

	public List<TestTask> findUncheckedDesktopByPage(Page page) {
		if (page == null) {
			return null;
		}
		return delegate.findUncheckedDesktopByPage(page).getItem();
	}

	public int getUncheckedDesktopTotalRows() {
		return delegate.getUncheckedDesktopTotalRows();
	}

	public List<TestTask> findPublisherWebTestTaskByPage(Page page,
			Publisher publisher) {
		if (page == null || publisher == null) {
			return null;
		}
		return delegate.findPublisherWebTestTaskByPage(page, publisher)
				.getItem();
	}

	public int getPublisherWebTotalRows(Publisher publisher) {
		if (publisher == null) {
			return -1;
		}
		return delegate.getPublisherWebTotalRows(publisher);
	}

	public List<TestTask> findcheckedWebByPage(Page page) {
		if (page == null) {
			return null;
		}
		return delegate.findcheckedWebByPage(page).getItem();
	}

	public int getcheckedWebTotalRows() {
		return delegate.getcheckedWebTotalRows();
	}

	public boolean isTesterJoinTask(int testerId, int testTaskId) {
		return delegate.isTesterJoinTask(testerId, testTaskId);
	}

}
