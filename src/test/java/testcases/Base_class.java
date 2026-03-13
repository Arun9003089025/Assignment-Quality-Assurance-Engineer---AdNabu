package testcases;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class Base_class {
	

	
		public WebDriver driver;
		public WebDriverWait wait;
		 public static ExtentReports extent;
		    public static ExtentTest test;
		    
		    
		@BeforeMethod
	   public void loginToStore() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			wait=new WebDriverWait(driver, Duration.ofSeconds(10));

			driver.get("https://adnabu-store-assignment1.myshopify.com");
			wait.until(ExpectedConditions.elementToBeClickable(By.id("password"))).sendKeys("AdNabuQA");
			driver.findElement(By.xpath("//button[text()='Enter']")).click();
			
			
		}
		
		@AfterMethod
			public void tearDown() {
				driver.quit();
			}
		
		@BeforeSuite
	    public void setupReport() {
	        // This creates a folder named 'Reports' in your project
	        ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/Reports/Index.html");
	        spark.config().setReportName("AdNabu Regression Suite");
	        spark.config().setDocumentTitle("Test Results");
	        extent = new ExtentReports();
	        extent.attachReporter(spark);
		}
	        
	        @AfterSuite
	        public void saveReport() {
	            extent.flush(); // CRITICAL: This line actually creates the file!
	    

	    }
		
	    
	}
		
		
		
		
		
		
		

		



