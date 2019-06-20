//package Djoko.web.Djoko.crm.web;
//
//import static org.junit.Assert.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import junit.framework.TestCase;
//
//import org.junit.Before;
//import org.junit.After;
//import org.junit.Test;
//
//public class CustomerTest extends TestCase {
//
//	private WebDriver driver;
//	
//	@Before
//	public void setUp() throws Exception {
//		super.setUp();
//		System.setProperty("webdriver.chrome.driver", "C:\\dev\\chromedriver.exe");
//		
//		ChromeOptions options = new ChromeOptions();
//		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
//		driver = new ChromeDriver(options);
//	}
//	
//	@After
//	public void tearDown() throws Exception {
//		driver.close();
//	}
//
//	@Test
//	public void test() throws InterruptedException {
//		driver.get("http://localhost:7070/");
//		String title = driver.getTitle();
//		assertTrue(title.contains("CRM App"));
//		
//		WebElement forename = driver.findElement(By.xpath("/html/body/form[1]/input[1]"));
//		forename.sendKeys("somename");
//		
//		WebElement name = driver.findElement(By.xpath("/html/body/form[1]/input[2]"));
//		name.sendKeys("somelastname");
//		
//		WebElement button = driver.findElement(By.xpath("/html/body/form[1]/p/input"));
//		
//		Thread.sleep(5000);
//		
//		button.click();
//		
//		WebElement username = driver.findElement(By.xpath("/html/body/span"));
//		
//		assertTrue(username.getText().trim().contains("somename somelastname"));
//	}
//
//}
