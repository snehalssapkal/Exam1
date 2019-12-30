package example;

public class web {

	public static void main(String[] args throws exception) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\Selenium Project\dependencies\ChromeDriver.exe");
		ChromeDriver chrome= new ChromeDriver();
		chrome.get("http://www.amazon.in/");
		chrome.findElementById("txtUsername").sendKeys("Admin");
		chrome.findElementById("txtPassword").sendKeys("admin123");
		chrome.findElementById("btnlogin").click();
		chrome.findElementById("welcome").click();
		Thread.sleep(1000);
		chrome.close();
	}

}
