package com.hrms.allpractice;

import org.openqa.selenium.WebDriver;

public class Global {
	public WebDriver driver;
	public String url="https://www.saucedemo.com/";
	public String usn="standard_user";
	public String pwn="secret_sauce";
	
	public String un="//input[@type='text']";
	public String pw="//input[@type='password']";
	public String logbut="//input[@type='submit']";
	public String logout="//*[@id=\"logout_sidebar_link\"]";
	public String bar="//*[@id='react-burger-menu-btn']";

}
