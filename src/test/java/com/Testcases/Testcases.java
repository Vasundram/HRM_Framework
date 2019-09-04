package com.Testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.Commanmethods.Screenshots;
import com.webpageobjects.Webpageobjectscls;

public class Testcases extends Webpageobjectscls {

	
	public static Webpageobjectscls webmethods;
public static 	Screenshots screen=new Screenshots();
	public static void testcaseone() throws IOException {
		 webmethods=PageFactory.initElements(driver, Webpageobjectscls.class);
		 webmethods.hrmpagelogin();
		 screen.getscreenshot("login");
		
	}
	public static void testcasetwo() throws IOException {
		webmethods.applyleave();
		screen.getscreenshot("apply leave page");
	}
	public static void testcasethree() throws InterruptedException, IOException {
		webmethods.hrmpagelogout();
		screen.getscreenshot("Logout");
	}
}
