package com.swt.selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSeleniumDDT {
	private static WebDriver myBrower;
	
	
    @DataProvider(name = "accountLogin")
    public Object[][] initData() {
        return new Object[][]{
            {"employee2", "12345678"},
            {"employee3", "12345678"},
            {"employee4", "12345678"}
        };
    }
	 
    @Test(dataProvider = "accountLogin")
    public void testLogin(String username, String password) throws InterruptedException {
        myBrower.get("https://apalary.duybinhngo.live/homepage");

        Thread.sleep(5000);

        WebElement btnLogin;
        btnLogin = myBrower.findElement(By.xpath("//button[@type='button']"));
        btnLogin.click();

        Thread.sleep(5000);

        WebElement txtUsername;
        txtUsername = myBrower.findElement(By.xpath("//input[@id='normal_login_username']"));
        txtUsername.sendKeys(username);

        WebElement txtPassword;
        txtPassword = myBrower.findElement(By.xpath("//input[@id='normal_login_password']"));
        txtPassword.sendKeys(password);

        WebElement submitLogin;
        submitLogin = myBrower.findElement(By.xpath("//button[@type='submit']"));
        submitLogin.click();

        Thread.sleep(5000);

        
        WebElement Username;
        Username = myBrower.findElement(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > section:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(2) > footer:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)"));
        System.out.println(Username.getText());

        assertEquals(Username.getText(), username);
        Thread.sleep(5000);
    }
    
    
    
    
    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdrive.chrome,driver", "chromedriver.exe");
        myBrower = new ChromeDriver();
        myBrower.manage().window().maximize();
    }
    
    @AfterMethod
    public void tearDownMethod() throws Exception {
        Thread.sleep(3000);
        myBrower.close();
    }
}
