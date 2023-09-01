import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\chromedriver.exe");  // No need to define this step in 
		 //selenium 4.6.0 version as it will directly download from jars called as selenium manager...if its defined then it will turn off selenium manager
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		 
		 WebElement staticDropdown = driver.findElement(By.id("ct100_mainContent_DropDownListCurrency"));
		 
		 Select dropdown = new Select(staticDropdown);
		 dropdown.selectByIndex(3);
		 System.out.println(dropdown.getFirstSelectedOption().getText());
		 dropdown.selectByVisibleText("AED");
		 System.out.println(dropdown.getFirstSelectedOption().getText());
		 dropdown.selectByValue("INR");
		 System.out.println(dropdown.getFirstSelectedOption().getText());
	}

}
