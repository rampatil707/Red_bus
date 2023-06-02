package com.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class login_01 {
	@FindBy(how=How.XPATH,using="//input[@id='src']")
	private WebElement txt_From;
	
	@FindBy(how=How.XPATH,using="//input[@id='dest']")
	private WebElement txt_dest;
	
	@FindBy(how=How.XPATH,using="//input[@id='onward_cal']")
	private WebElement date;

	public WebElement getTxt_From() {
		return txt_From;
	}

	public WebElement getTxt_dest() {
		return txt_dest;
	}

	public WebElement getDate() {
		return date;
	}

	
	
	

	

}
