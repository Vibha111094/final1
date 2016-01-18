package com.cloudsimbaautotest.main3;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class main3 {

	@Test
	public int   test() throws IOException, InterruptedException {
		//int a=0;
		 WebDriver driver;
		  String baseUrl;
		  boolean acceptNextAlert = true;
		  StringBuffer verificationErrors = new StringBuffer();
		  driver = new FirefoxDriver();
		    baseUrl = "https://cloudsimba.com";
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    driver.get(baseUrl + "/");
		    driver.findElement(By.id("loginbtn")).click();
		    driver.findElement(By.id("emaillogin")).sendKeys("abc@gmail.com");
		    driver.findElement(By.id("passwordlogin")).sendKeys("Welcome@12345");
		    driver.findElement(By.id("logbtn")).click();
		    Thread.sleep(10000);
		    try
		    {
		    driver.findElement(By.id("logoutbtn"));
		    return 1; 
		    }catch (Exception e)
		     {
		    	//a=1;
		    	//System.out.println("login not possible");
		    	return 0;
		    }
		    //if(a==0)
		    //{
		    	//System.out.println("login  possible");
		    	//return 1;
		    //}

			
}
}