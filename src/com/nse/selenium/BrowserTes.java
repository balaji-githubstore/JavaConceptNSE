package com.nse.selenium;

public class BrowserTes {
	
	public static void main(String[] args) {
		
		WebDriverDemo d=new FirefoxDriverDemo();
		
		d.close();
		d.get("");
		d.getTitle();
		d.quit();
		
		TakeScreenshotDemo x=(TakeScreenshotDemo) d;
		
		x.getScreenshot();
	}

}
