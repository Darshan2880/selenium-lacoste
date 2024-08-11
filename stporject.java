package project;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class stporject {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.lacoste.in/");
	driver.manage().window().maximize();
	//profile
	driver.findElement(By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[3]/div[6]/div[1]")).click();
	//login
	driver.findElement(By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[3]/div[6]/div[2]/div/div/div/div/div/div[1]/a")).click();
	
	driver.findElement(By.xpath("//*[@id=\"email_address\"]")).click();
	//email//phone
	driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys("7483972669");
	driver.findElement(By.xpath("//*[@id=\"auth_btn\"]")).click();
	//password
	driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div/div[3]/form/fieldset[1]/div[2]/div/input")).sendKeys("Supra@2880");
	//signup
	driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div/div[3]/form/fieldset[1]/div[4]/div[1]/button/span")).click();
	//refresh
	driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div[1]/a/img")).click();
	//sreach

	WebElement searchBox=driver.findElement(By.id("search"));
	searchBox.sendKeys("sweartshirt");
	searchBox.submit();
	// select product
		driver.findElement(By.xpath("//*[@id=\"product-item-info_107411\"]/div[1]/a[1]/img")).click();	
	driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div/button[1]")).click();
	// size select
	driver.findElement(By.name("attribute-138")).click();
	// shoping button
	//driver.findElement(By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[3]/div[2]/a")).click();
	//cancel
	//driver.findElement(By.xpath("//*[@id=\"html-body\"]/div[3]/aside[5]/div[2]/header/button")).click();
	// add  to cart
	driver.findElement(By.xpath("//*[@id=\"modal-content-14\"]/div/div[2]/div[2]/button")).click();
		// view to cart
	driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div[2]/div[4]/div/a/span")).click();
	//profile
	driver.findElement(By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[3]/div[6]/div[1]")).click();
	//log out
	driver.findElement(By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[3]/div[6]/div[2]/div/div/div/div/a")).click();
	}
	}