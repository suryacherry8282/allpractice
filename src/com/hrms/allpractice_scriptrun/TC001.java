package com.hrms.allpractice_scriptrun;

import org.testng.annotations.Test;

import com.hrms.allpractice.General;

public class TC001 {
	@Test
public void tc001()throws Exception	{
	//public static void main (String args[]) throws Exception {
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();
	}

}
