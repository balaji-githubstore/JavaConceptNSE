package com.nse.oops;

interface WebDriverDemo {
	void quit();

	void get(String url);

	String getTitle();
}

class ChromeDriverDemo implements WebDriverDemo {

	public void quit() {
		// TODO Auto-generated method stub
	}

	public void get(String url) {
		// TODO Auto-generated method stub
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	

}

class FireDriverDemo implements WebDriverDemo {

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

}

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverDemo driver =new ChromeDriverDemo();
		driver.quit();
		
		

	}

}
