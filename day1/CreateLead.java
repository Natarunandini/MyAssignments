package assigment.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ITC Infotech");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nataru");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Nandini");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nataru");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("use of computer systems or devices to access information");
		
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dd = new Select(country);
		dd.selectByVisibleText("Philippines");
Thread.sleep(5000);
		dd.selectByValue("DNK");
		Thread.sleep(5000);
		dd.selectByIndex(1);   
		driver.findElement(By.name("submitButton")).click();
		
		
		String title=driver.getTitle();
		System.out.println("the title is:"+driver.getTitle());
		if(title.contains("View Lead")) {
		System.out.println("I confirm the title has testleaf");
		}else {
			System.out.println("the title has does not have the word testleaf");
		}
			driver.close();
}
}