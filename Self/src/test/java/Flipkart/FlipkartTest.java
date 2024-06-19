package Flipkart;

import java.util.List;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Automation.Base;

public class FlipkartTest extends Base{
	public WebDriver driver;
	@BeforeMethod
	public void initialization() {
		driver=browserinitialization("chrome");
		driver.get("https://www.flipkart.com/");
		
	}
	@Test
	public void tc01() {
		System.out.println("test case1");
		//driver.navigate().to("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		//driver.close();
		//driver.quit();
		
		//driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		//driver.findElement(By.id("single-input-field")).sendKeys("Hello");
		//driver.findElement(By.id("button-one")).click();
		
		/*driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		//driver.findElement(By.name("field-keywords")).clear();
		driver.findElement(By.linkText("Shop on Amazon Business")).click();*/
		        //dropdown
		//driver.navigate().to("https://selenium.qabible.in/select-input.php");
		//WebElement dropdown=driver.findElement(By.id("single-input-field"));
		//Select obj=new Select(dropdown);
		//obj.selectByValue("Red");
		//obj.selectByVisibleText("Green");
		//obj.selectByIndex(2);
		
		      //checkbox
		//driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		//driver.findElement(By.id("gridCheck")).click();
		
		     //radiobutton
		//driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		//driver.findElement(By.id("inlineRadio1")).click();
	   // driver.findElement(By.xpath("//button[text()='Show Selected Value']")).click();
		
	          //rightclick
	   // driver.navigate().to("https://www.amazon.in/");
	   // Actions action=new Actions(driver);
	   // action.contextClick().build().perform();
	         
	         //doubleclick
	    //driver.navigate().to("https://www.amazon.in/");
	   // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	    //driver.findElement(By.id("nav-search-submit-button")).click();
	  //  Actions action=new Actions(driver);
	   //action.doubleClick(driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[6]"))).build().perform();
	   
	        //mousehover
	  // driver.navigate().to("https://www.amazon.in/");
	//   Actions action=new Actions(driver);
	 //  WebElement a=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
	 //  action.moveToElement(a);
	   
	      //drag and drop
	 //  driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	  // WebElement source=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	  // WebElement target=driver.findElement(By.id("mydropzone"));
	 //  Actions action=new Actions(driver);
	  // action.dragAndDrop(source, target);
		
		     // findelements 
			/*driver.navigate().to("https://www.amazon.in/");
	   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	   driver.findElement(By.id("nav-search-submit-button")).click();
	   List<WebElement> product= driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	   int productsize=product.size();
	   System.out.println(productsize);*/
		
		//driver.navigate().to("https://www.91mobiles.com/phonefinder.php");
		//boolean priceRangeVerification= driver.findElement(By.id("latestandexpectprice1000002000001")).isSelected();
		//System.out.println(priceRangeVerification);
		
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String value =driver.findElement(By.xpath("//span[text()='Deals & Discounts']")).getText();
	    System.out.println(value);
	    String value1=driver.findElement(By.xpath("//span[text()='Deals & Discounts']")).getTagName();
	    System.out.println(value1);
	    String  name=driver.findElement(By.id("twotabsearchtextbox")).getAttribute("name");
	    System.out.println(name);
	    
	    boolean signinbutton=driver.findElement(By.xpath("//span[@class='nav-action-inner']")).isEnabled();
	    System.out.println(signinbutton);
	    
	    
	}
}
