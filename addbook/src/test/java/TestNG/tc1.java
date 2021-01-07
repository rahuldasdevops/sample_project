package TestNG;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tc1 {
	 WebDriver driver;

   		@BeforeMethod
		public void launch() {
		  ChromeOptions co = new ChromeOptions();
   		  co.setHeadless(true);
		  System.setProperty("webdriver.chrome.driver","/home/jenkins/jenkins_home/selenium_driver/chromedriver");
		  driver = new ChromeDriver(co);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  driver.get("http://18.223.23.13:8080/addressbook/");
		
		}
		
	  @Test
	  public void verfiy() {
		 
		  driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
		  driver.findElement(By.id("gwt-uid-5")).sendKeys("Edureka");
		  driver.findElement(By.id("gwt-uid-7")).sendKeys("Selenium");
		  driver.findElement(By.id("gwt-uid-9")).sendKeys("9876543210");
		  driver.findElement(By.id("gwt-uid-11")).sendKeys("devops@gmail.com");
		  driver.findElement(By.id("gwt-uid-13")).sendKeys("6/30/20,");
		  driver.findElement(By.xpath("//div[@class='v-button v-widget primary v-button-primary']")).click();
		  
	  }
	  
	  @AfterMethod
	  public void close() {
		 driver.close();
 }
  }
