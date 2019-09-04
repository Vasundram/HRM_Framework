package com.TestRunner;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Commanmethods.Basecls;
import com.Testcases.Testcases;
import com.webpageobjects.Webpageobjectscls;

public class Executionwindow extends Testcases{

	@Test
	public static void projectexecution() throws InterruptedException, IOException {
		logger=report.createTest("Hrm Login");
		logger.info("HRM Login With Valid Credentials");
		Basecls.getbrowser();
		
		Testcases.testcaseone();
	}
	@Test
	public static void test2() throws IOException {
		logger=report.createTest("Hrm Apply leave");
		logger.info("User applying leave");
		Testcases.testcasetwo();
	}
	@Test
	public static void test3() throws InterruptedException, IOException {
		logger=report.createTest("Hrm logout");
		logger.info("Hrm Logout application");
		Testcases.testcasethree();
		
	}
}
