package POMExamples;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Firstdemotest {
	@Test
	public void Takescreenshot() throws IOException, InterruptedException {
	  

	WebDriver driver= new ChromeDriver(); 

	driver.get("https://www.amazon.in/");

	driver.manage().window().maximize();

	driver.findElement(By.xpath("/html/body/div[1]/header/div/div[5]/div[2]/div/div/a[1]")).click();
	
    Thread.sleep(1000);
    driver.close(); 
}
}
