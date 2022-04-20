package com.nse.selenium;

public interface WebDriverDemo {
	
	public abstract void close();
	void quit();
	String getTitle();
	void get(String url);

}

