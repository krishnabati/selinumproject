package TestNG;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tc1 {
	 WebDriver driver;

   
		@BeforeMethod
		public void launch() {
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  driver.get("http://3.80.94.62:8080/DynamicJavaProject-Chat-Release-2.1/");
		
		}
		
	  @Test
	  public void verfiy() {
		 
		//   driver.findElement(By.xpath("//img[@class='v-button v-widget']")).click();
		  driver.findElement(By.id("fname")).sendKeys("Krishna");
		  driver.findElement(By.id("lname")).sendKeys("Selenium");
		  driver.findElement(By.id("submit")).sendKeys("9876543210");
		  driver.findElement(By.xpath("//input[@class='submitbutton']")).click();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  }
	  
	  @AfterMethod
	  public void close() {
		 driver.close();
 }
  }
