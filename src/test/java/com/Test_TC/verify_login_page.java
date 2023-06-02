package com.Test_TC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.webpages.login_01;

import Utility.Baseclass;
import Utility.library;

public class verify_login_page extends Baseclass {
	// test cases Steps
	@Test
	public void verify_loginpage() {
		
		// elment --> emaiid,password,login
		
		login_01 login=PageFactory.initElements(driver, login_01.class);
		
		library.custom_Sendkeys(login.getTxt_From(), excel.getStringData_Excel("Sheet1", 0, 0));
		library.custom_Sendkeys(login.getTxt_dest(), excel.getStringData_Excel("Sheet1", 0, 1));
		library.custom_click(login.getDate());
		
		List <WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		 for(WebElement link:allLinks){
			 System.out.println(link.getText() + " - " + link.getAttribute("href"));
			 int numberOfLinks = driver.findElements(By.tagName("a")).size();
		        // count no of links on page
		        System.out.println("Number of links on Web Page :" +numberOfLinks );
			 
			 }
		
		
	}
}
