package org.test.filpkart.cucmberflipkart;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition {
	static WebDriver driver;
	@Given("^The user is in filpkart homepage$")
	public void the_user_is_in_filpkart_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "G:\\Santhosh\\New_Wrkspace\\cucmberflipkart\\ drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	}

	@Given("^The user search for a \"([^\"]*)\"$")
	public void the_user_search_for_a(String product) throws Throwable {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(product,Keys.ENTER);
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^The user adds the\"([^\"]*)\" for a  product$")
	public void the_user_adds_the_for_a_product(Integer items) throws Throwable {
		++items;
		driver	.findElement(By.xpath("//*[@id='container']/div/div[1]/div/div[2]/div[1]/div[2]/div[" + items + "]")).click();
		String pwid = driver.getWindowHandle();
	   	System.out.println(pwid);
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		for (String x : allwindows) {

			if (!x.equals(pwid)) {
				driver.switchTo().window(x);

			}
		}
		WebElement img1 = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
		img1.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement btn=driver.findElement(By.xpath("//span[text()='Continue shopping']"));
		btn.click();
		driver.findElement(By.xpath("//a[@class='_3NFO0d JvUE0p']")).click();
	}
	@Then("^The user verifies the item in a cart\"([^\"]*)\"$")
	public void the_user_verifies_the_item_in_a_cart(String product) throws Throwable {
		boolean contains = driver.findElement(By.xpath("//div/a[contains(text(),'"+product+"')]")).getText().contains(product);
		Assert.assertTrue(contains);
	}
	
}
