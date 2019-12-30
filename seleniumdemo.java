package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumdemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Project\\dependencies\\ChromeDriver.exe");
		ChromeDriver chrome= new ChromeDriver();
		chrome.get("http://www.gmail.com");
		/*chrome.findElementById("txtUsername").sendKeys("Admin");
		chrome.findElementById("txtPassword").sendKeys("admin123");
		chrome.findElementById("btnlogin").click();
		chrome.findElementById("welcome").click();
		Thread.sleep(1000);*/
		//chrome.close();
	}
}
