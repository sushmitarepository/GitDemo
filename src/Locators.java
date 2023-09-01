import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		 System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		 driver.findElement(By.name("inputPassword")).sendKeys("fddhg");
		 driver.findElement(By.className("signInBtn")).click();
		 System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		 driver.findElement(By.linkText("Forgot your password?")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		 driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
		 driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		 driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
		 driver.findElement(By.xpath("//form/input[3]")).sendKeys("9867654567"); //parent to child tag name traverse
		 driver.findElement(By.cssSelector(".reset-pwd-btn")).click();  //css selector using classname
		 System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		 driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click(); //parent to child traverse xpath
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		 driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");  //* is used as regular expression 
		 //its finding element which has pass value in it
		 driver.findElement(By.id("chkboxOne")).click();
		 driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();  //regular xpression xpath
		 
	}

}
