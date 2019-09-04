package com.webpageobjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Commanmethods.Basecls;
import com.Commanmethods.Testdatareader;

public class Webpageobjectscls extends Basecls {
	
	//Test Data From Excel

	public static Testdatareader exceldata=new Testdatareader();

	
	
	
	
	//Lofin Page Objects
	@FindBy(id="txtUsername")public static WebElement username;
	
	@FindBy(id="txtPassword")public static WebElement password;
	
	@FindBy(id="btnLogin")public static WebElement loginbutton;
	
	
	///Apply Leave page objects
	
	@FindBy(id="menu_leave_viewLeaveModule")public static WebElement leavetab;
	@FindBy(xpath="//a[@id=\"menu_leave_applyLeave\"]")public static WebElement applytab;
	@FindBy(id="applyleave_txtLeaveType")public static WebElement leavetype;
	
	//Page logout objects
	@FindBy(id="welcome")public static WebElement welcomedropdown;
	@FindBy(xpath="//a[contains(text(),'Log')]")public static WebElement logoutbutton;

	
	public static void hrmpagelogin() throws IOException {
		
	String Usernamefromexcel=exceldata.getcelldata("HRMLOGINCREDENTIALS", 1, 1);
	String Passwordfromexcel=exceldata.getcelldata("HRMLOGINCREDENTIALS", 1, 2);
		username.sendKeys(Usernamefromexcel);
		password.sendKeys(Passwordfromexcel);
		loginbutton.click();
		
	}
	
	public static void applyleave() {
		leavetab.click();
		applytab.click();
		leavetype.click();
	}
	
	public static void hrmpagelogout() throws InterruptedException {
		welcomedropdown.click();
		
		logoutbutton.click();
	}
}
