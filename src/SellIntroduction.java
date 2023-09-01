import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SellIntroduction {

	public static void main(String[] args) {
		
		//Invoking Browser
		//Chrome - ChromeDriver ->Methods
		
		//ChromeDriver driver = new ChromeDriver(); //This code might not work for other browsers
		
		//Selenium manager beta phase
		
		 System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\chromedriver.exe");  // No need to define this step in 
		 //selenium 4.6.0 version as it will directly download from jars called as selenium manager...if its defined then it will turn off selenium manager
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com");
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 driver.close();
		 driver.quit();

	}

}

