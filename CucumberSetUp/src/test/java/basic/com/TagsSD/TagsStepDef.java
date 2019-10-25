package basic.com.TagsSD;		

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;
	

public class TagsStepDef {				
	
	WebDriver driver;
     
    @Given("^User need to be on facebook login page$")
    public void User_need_to_be_on_facebook_login_page()  {
    	
    	System.setProperty("webdriver.chrome.driver", "D://Automation//Softwares//chrome_win32//chromedriver.exe");
		driver = new ChromeDriver();
		
		//ChromeOptions chromeOptions= new ChromeOptions();
		//chromeOptions.setBinary("C://Program Files (x86)//Google//Chrome//Application");
		//driver = new ChromeDriver(chromeOptions);
		 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");         
    }

    @When("^User enteres user \"([^\"]*)\" first name$")
    public void User_enteres_user_first_name(String firstname) throws InterruptedException {
    	Thread.sleep(2000);  
      System.out.println("This step enter the first name on the login page.");
      driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
       Thread.sleep(1000);   
    }

    
    @Then("^User checks user \"([^\"]*)\" first name is present$")
    public void User_checks_user_first_name_is_present(String firstname)  {
        
      String actualName = driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value");
      System.out.println("actualName :" + actualName);
      Assert.assertEquals(actualName, firstname);
     
    }
    
    @And("^User enteres user \"([^\"]*)\" surname$")
    public void User_enteres_user_surname(String surname) throws InterruptedException  {
        Thread.sleep(2000);    
        driver.findElement(By.name("lastname")).sendKeys(surname);;   
    }
    
    @But("^User mobile field should be blank$")
    public void User_mobile_field_should_be_blank()  {
        System.out.println("User_mobile_field_should_be_blank");
        String mobileNo = driver.findElement(By.xpath("//input[@name='reg_email__']")).getAttribute("value");
        System.out.println("mobileNo " + mobileNo);
        Assert.assertEquals(mobileNo, "");       
    }
    
    @Then("^Close the browser$")
    public void Close_the_browser()  {
        System.out.println("Close the browser");
       driver.quit();
       driver =  null;
    }

   }