import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\chromedriver.exe");  // No need to define this step in 
		 //selenium 4.6.0 version as it will directly download from jars called as selenium manager...if its defined then it will turn off selenium manager
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		 driver.findElement(By.id("autosuggest")).sendKeys("ind");

		 Thread.sleep(3000);

		 List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		 for(WebElement option :options)

		 {

		 if(option.getText().equalsIgnoreCase("India"))

		 {

		 option.click();

		 break;

		 }

		 }
	}

}
