package cn.com.test;

import cn.com.crowdtest.process.UserManagement;

public class StaticTest {
	public static void main(String[] argc) {
		UserManagement u = new UserManagement();
		System.out.println(u.isTester("SHAWN@126.COM", "123456"));
	}
}
