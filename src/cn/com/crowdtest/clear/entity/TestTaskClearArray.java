package cn.com.crowdtest.clear.entity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cn.com.crowdtest.ws.generated.TestTask;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestTaskArray", propOrder = { "list" })
public class TestTaskClearArray {
	@XmlElement(name = "testTask")
	private List<TestTaskClear> list = new ArrayList<TestTaskClear>();

	public TestTaskClearArray() {

	}

	public TestTaskClearArray(List<TestTask> _list) {
		for (TestTask testTask : _list) {
			list.add(new TestTaskClear(testTask));
		}
	}

	public List<TestTaskClear> getList() {
		return list;
	}

	public void setList(List<TestTaskClear> list) {
		this.list = list;
	}

}
