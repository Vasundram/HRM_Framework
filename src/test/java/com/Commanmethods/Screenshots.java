package com.Commanmethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Screenshots extends Basecls {
	
	public static String getscreenshot(String name) throws IOException {
		
		String path="E:\\vss\\HRM_UIApplication\\Screenshots\\HRM_"+name+".png";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, new File(path));
		return path;
		
	}
	

}
