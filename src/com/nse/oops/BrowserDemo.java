package com.nse.oops;

import java.io.File;

interface WebDriverDemo {
	public abstract void get(String url);
	void quit();
	void close();
}

interface  TakeScreenshot
{
	void getScreenshotAs();
}

class ChromeDriverDemo implements WebDriverDemo,TakeScreenshot {

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		System.out.println("chrome " + url);
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		System.out.println("close chrome browser");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}
	
	public void chromeOnly()
	{
		
	}

	@Override
	public void getScreenshotAs() {
		// TODO Auto-generated method stub
		System.out.println("chrome screenshot");
	}
}
class FirefoxDriverDemo implements WebDriverDemo,TakeScreenshot
{

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		System.out.println("firefox"+url);
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		System.out.println("firefox close browser");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getScreenshotAs() {
		// TODO Auto-generated method stub
		System.out.println("firefox screenshot");
	}
	
}

class Edge implements WebDriverDemo
{

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	
}


public class BrowserDemo {

	public static void main(String[] args) {
		
		WebDriverDemo driver= new FirefoxDriverDemo();	
		driver.get("google.com");
	
		TakeScreenshot ts= (TakeScreenshot) driver;
		ts.getScreenshotAs();
		
//		ChromeDriverDemo ch=(ChromeDriverDemo) driver;
//		ch.getScreenshotAs();
		
//		File file1=new File("D:\\TestData - Copy.xlsx");
//		
//		System.out.println(file1.exists());
//		
//		if(file1.exists())
//		{
//			file1.delete();
//		}
	}
}
