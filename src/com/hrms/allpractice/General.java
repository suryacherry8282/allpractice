package com.hrms.allpractice;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class General extends Global {
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to(url);}
	public void login() throws Exception {
		driver.findElement(By.xpath(un)).sendKeys(usn);
		driver.findElement(By.xpath(pw)).sendKeys(pwn);
		Thread.sleep(3000);
		driver.findElement(By.xpath(logbut)).click();
		Thread.sleep(3000);
		
	}
public void logout()throws Exception {
	driver.findElement(By.xpath(bar)).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(logout)).click();
	Thread.sleep(3000);
}
public void closeApplication() {
	driver.close();
}
}
