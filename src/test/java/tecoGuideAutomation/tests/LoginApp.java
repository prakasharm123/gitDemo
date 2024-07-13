package tecoGuideAutomation.tests;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginApp {
	
	static String collegeName = "San Diego Mesa College";
	static String goalName =  "Certificate";
	static String majorName = "Master Teacher";
	static String[] courses = {"'CHIL 101'","'CHIL 111'","'CHIL 121'","'CHIL 131'","'CHIL 141'"};
	static List<String> courseName = Arrays.asList(courses);
			
	
	
	


	public static void main(String...a) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
//		driver.manage().window().setSize(new Dimension(1440, 900));
		
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String zoomChrome = "document.body.style.zoom = '67%'";
		driver.get("https://stage.tecoguide.com");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[name='emailId']")).sendKeys("bocoj17150@fom8.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Prakash123@");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(20000);
		////ul[@class='shortcutlist']//li[2]//span[1]
		driver.findElement(By.cssSelector("main[class='main-content myacdem'] li:nth-child(2)>span:nth-child(1)>svg")).click();
		Thread.sleep(10000);
		completeClass(driver, js);
		

//		
//		String college = driver.findElement(By.xpath("//span[text()='Primary CCC: San Diego Mesa College']")).getText();
//		String goal = driver.findElement(By.xpath("//span[text()='Career Certificate']")).getText();
//		String major = driver.findElement(By.xpath("//span[text()='Major: Master Teacher']")).getText();
//		
//		
//		
//		
//		
//		
//		for(int i= 0; i<courses.length;i++) {
//			
//			
//			
//		js.executeScript("window.scroll(0,300)");
//		Thread.sleep(7000);
//	
//		
//		if(college.contains(collegeName) && goal.contains(goalName) && major.contains(majorName)) {
//
//			driver.findElement(By.xpath("//div[@class='major-sec'][1]//div[@class='majorListRow oned']//div[text()="+courseName.get(i)+"]//parent::div//div[4]//button//span[@class='MuiIconButton-label']")).click();
//			Thread.sleep(7000);
//			
//			
//			
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//div[@class='desktopBtns-cD']//button")).click();
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//input[@value='Complete']")).click();
//			Thread.sleep(3000);
//			
//			By results = By.xpath("//select[@name='semester']//options");
//			WebElement selectSemesterField = driver.findElement(By.xpath("//select[@name='semester']"));
//			WebElement selectYearField = driver.findElement(By.xpath("//select[@name='year']"));
//			WebElement selectGradeField = driver.findElement(By.xpath("//select[@name='grade']"));
//			
//			Select selectSem = new Select(selectSemesterField);	
//			selectSem.selectByValue("Spring");
//			
//			Select selectYear = new Select(selectYearField);	
//			selectYear.selectByValue("2024");
//			
//			Select selectGrade = new Select(selectGradeField);	
//			selectGrade.selectByVisibleText("A - Excellent");
//			
//			driver.findElement(By.xpath("//span[text()='Save']")).click();
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//span[contains(text(),'OK')]")).click();
//			Thread.sleep(5000);
//		}
//		
//		}
	
		
	}
	
	public static void completeClass(WebDriver driver, JavascriptExecutor js ) throws InterruptedException {
		
		for(int i= 0; i<courses.length;i++) {
		
		String college = driver.findElement(By.xpath("//span[contains(text(),'Primary CCC')]")).getText();
		String goal = driver.findElement(By.xpath("//span[contains(text(),'Goal:')]")).getText();
		String major = driver.findElement(By.xpath("//span[contains(text(),'Major:')]")).getText();
	

		

		js.executeScript("window.scroll(0,200)");
//		js.executeScript(zoomChrome);
		Thread.sleep(7000);
	
		if(college.contains(collegeName) && goal.contains(goalName) && major.contains(majorName)) {

			driver.findElement(By.xpath("//div[@class='major-sec'][1]//div[@class='majorListRow oned']//div[text()="+courseName.get(i)+"]//parent::div//div[4]//button//span[@class='MuiIconButton-label']")).click();
			//"+courseName.get(i)+"
			Thread.sleep(7000);
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@class='desktopBtns-cD']//button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@value='Complete']")).click();
			Thread.sleep(3000);
			
			By results = By.xpath("//select[@name='semester']//options");
			WebElement selectSemesterField = driver.findElement(By.xpath("//select[@name='semester']"));
			WebElement selectYearField = driver.findElement(By.xpath("//select[@name='year']"));
			WebElement selectGradeField = driver.findElement(By.xpath("//select[@name='grade']"));
			
			
			
			
			
			
			
			Select selectSem = new Select(selectSemesterField);	
			selectSem.selectByValue("Spring");
			
			Select selectYear = new Select(selectYearField);	
			selectYear.selectByValue("2024");
			
			Select selectGrade = new Select(selectGradeField);	
			selectGrade.selectByVisibleText("A - Excellent");
			
			driver.findElement(By.xpath("//span[text()='Save']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[contains(text(),'OK')]")).click();
			Thread.sleep(5000);
		   }else {
			   Thread.sleep(5000);
			   driver.findElement(By.xpath("//span[text()='Edit Goal']")).click();
			   Thread.sleep(5000);
			   WebElement selectCollege = driver.findElement(By.id("mui-component-select-primaryCampusQuestion"));
			   selectCollege.click();
			   Thread.sleep(5000);
			   String collegeNameforXpath = "'"+collegeName+"'";
			   WebElement selectCollegeName = driver.findElement(By.xpath("//li[text()="+collegeNameforXpath+"]"));
			   selectCollegeName.click();
			   driver.findElement(By.xpath("//span[text()='Next']")).click();
			   Thread.sleep(5000);
			  // Certificate of Achievement
			   String goalNameforXpath = "'"+goalName+" of Achievement"+"'";
			   driver.findElement(By.xpath("//span[text()="+goalNameforXpath+"]")).click();
			   driver.findElement(By.xpath("//span[text()='Next']")).click();
			   Thread.sleep(5000);
			   
			   WebElement selectMajor = driver.findElement(By.id("mui-component-select-certificateMajorQuestion"));
			   selectMajor.click();
			   Thread.sleep(5000);
			   String majorNameforXpath = "'"+majorName+"'";
			   WebElement selectMajorName = driver.findElement(By.xpath("//li[text()="+majorNameforXpath+"]"));
			   selectMajorName.click();
			   
			   driver.findElement(By.xpath("//span[text()='Done']")).click();
			   Thread.sleep(10000);
			     
			   
		   }
		
		}
		
	}

}
