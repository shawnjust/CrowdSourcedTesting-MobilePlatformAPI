package cn.com.crowdtest.process;

import java.util.Date;
import java.util.List;

import cn.com.crowdtest.ws.generated.Administrator;
import cn.com.crowdtest.ws.generated.Page;
import cn.com.crowdtest.ws.generated.Publisher;
import cn.com.crowdtest.ws.generated.Tester;
import cn.com.crowdtest.ws.generated.UserManagementDelegate;
import cn.com.crowdtest.ws.generated.UserManagementService;

public class UserManagement {

	UserManagementService service = new UserManagementService();
	UserManagementDelegate delegate = service.getUserManagementPort();

	public boolean isTester(String email, String password) {
		return delegate.isTester(email, password);
	}

	public Publisher isPublisher(String email, String password) {
		return delegate.isPublisher(email, password);
	}

	public Administrator isAdministrator(String email, String password) {
		return delegate.isAdministrator(email, password);
	}

	public Tester addTester(String email, String password, String name,
			boolean gender, String mobile, Date birthday, double credit) {
		return delegate.addTester(email, password, name, gender, mobile,
				birthday, credit);
	}

	public Publisher addPublisher(String name, String email, String password,
			double credit, boolean authority, boolean publisherType,
			String company, String connectEmail) {
		return delegate.addPublisher(name, email, password, credit, authority,
				publisherType, company, connectEmail);
	}

	public Administrator addAdministrator(String name, String email,
			String password, boolean authority, String occupation) {
		return delegate.addAdministrator(name, email, password, authority,
				occupation);
	}

	public Boolean checkPublisher(String email) {
		return delegate.checkPublisher(email);
	}// check

	public List<Publisher> viewAllPublisher() {
		return delegate.viewAllPublisher().getItem();
	}

	public List<Publisher> findUncheckedCompany(Page page) {
		return delegate.findUncheckedCompany(page).getItem();
	}

	public List<Publisher> findUncheckedPerson(Page page) {
		return delegate.findUncheckedPerson(page).getItem();
	}

	public int getUncheckedCompanyTotalRows() {
		return delegate.getUncheckedCompanyTotalRows();
	}

	public int getUncheckedPersonTotalRows() {
		return delegate.getUncheckedPersonTotalRows();
	}
}
