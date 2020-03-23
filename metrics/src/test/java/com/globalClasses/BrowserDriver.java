package com.globalClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

public class BrowserDriver {
	private static WebDriver mDriver;
	
	public synchronized static WebDriver getCurrentBrowser() {
		if(mDriver == null) {
			System.setProperty("webdriver.chrome.driver", "SeleniumDriver\\chromedriver79.exe");
			System.setProperty("webdriver.chrome.silentOutput", "true");
			mDriver = new ChromeDriver();
		}
		return mDriver;
	}
	
	public void close() {
		try {
			getCurrentBrowser().quit();
			mDriver = null;
		} catch (UnreachableBrowserException e) {
			System.out.println("Unreachable Browser");
		}
	}
	
	public void loadPage(String url) {
		getCurrentBrowser().get(url);
	}
}
