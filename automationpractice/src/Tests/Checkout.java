package Tests;
// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Main.Reporter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Checkout {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  Reporter rp;
  
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    rp = new Reporter();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void doAddToCart() throws Exception {

	rp.addSimple("<h2>Checkout</h2>");
	
	try {
	rp.add("preconditions"); 	

	// 1 | open | /index.php | 
	rp.add("// 1 | open | http://automationpractice.com/index.php | ");
    driver.get("http://automationpractice.com/index.php");
    
    // 2 | setWindowSize | 1400x1000 | 
    //rp.add("// 2 | setWindowSize | 1400x1000 | ");
    driver.manage().window().setSize(new Dimension(1400, 1000));
    
    // 3 | click | linkText=Sign in | 
    rp.add("// 2 | click | button \"Sign in\" | ");
    driver.findElement(By.linkText("Sign in")).click();
    
    // 4 | type | id=email | someone@somewhere.com
    rp.add("// 3 | type | field \"Email address\": someone@somewhere.com");
    driver.findElement(By.id("email")).sendKeys("someone@somewhere.com");
    
    // 5 | type | id=passwd | mypassword
    rp.add("// 4 | type | field \"Password\": mypassword");
    driver.findElement(By.id("passwd")).sendKeys("mypassword");
    
    // 6 | click | css=#SubmitLogin > span | 
    rp.add("// 5 | click | button \"Sign in\" | ");
    driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
    
    // 3 | click | css=.sfHover > a | 
    rp.add("// 6 | click | button \"T-shirts\" | ");
    driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(3)")).click();

    // 4 | click | css=.lnk_view > span | 
    rp.add("// 7 | click | product image | ");
    driver.findElement(By.className("product_img_link")).click();
    
    Thread.sleep(3000);
    
    // 10 | click | css=.exclusive > span | 
    rp.add("// 8 | click | button \"Add to cart\" | ");
    driver.findElement(By.cssSelector(".exclusive > span")).click();
    
    Thread.sleep(3000);
    
    // 11 | click | css=h2:nth-child(2) | 
    rp.add("// 9 | click | button \"Proceed to checkout\" (Cart) | ");
    driver.findElement(By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span")).click();

    rp.add("test steps"); 	
    
    // 15 | click | css=.standard-checkout > span | 
    rp.add("// 10 | click | button \"Proceed to checkout\" (Summary page) | ");
    driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
    
    // 15 | click | css=.standard-checkout > span | 
    rp.add("// 11 | click | button \"Proceed to checkout\" (Address page) | ");
    driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
    /*
    // 15 | click | css=.standard-checkout > span | 
    rp.add("// 23 | click | button \"Choose transport\" | ");
    driver.findElement(By.id("uniform-delivery_option_400187_0")).click();    
    */
    // 15 | click | css=.standard-checkout > span | 
    rp.add("// 12 | click | checkbox \"Agree\" | ");
    driver.findElement(By.id("cgv")).click();     
    
    // 7 | click | css=.standard-checkout > span | 
    rp.add("// 13 | click | button \"Proceed to checkout\" (Shipping page) | ");
    driver.findElement(By.cssSelector(".standard-checkout > span")).click();
    
    // 8 | click | linkText=Pay by check (order processing will be longer) | 
    rp.add("// 14 | click | button \"Pay by check\" | ");
    driver.findElement(By.linkText("Pay by check (order processing will be longer)")).click();
    
    // 9 | click | css=#cart_navigation span | 
    rp.add("// 15 | click | button \"I confirm my order\" | ");
    driver.findElement(By.cssSelector("#cart_navigation span")).click();
    //Thread.sleep(5000);
    
    rp.add("expected result"); 
    
    // 10 | click | css=.alert | 
    rp.add("// 16 | find | text \"Your order on My Store is complete.\" | ");
    driver.findElement(By.xpath("//p[text()='Your order on My Store is complete.']"));
    
    // 11 | click | css=.ajax_cart_no_product | 
    rp.add("// 17 | click | button \"Cart (empty)\" | ");
    driver.findElement(By.cssSelector(".ajax_cart_no_product")).click();
    
    // 12 | click | css=.alert | 
    rp.add("// 18 | find | text \"Your shopping cart is empty.\" | ");
    driver.findElement(By.xpath("//p[text()='Your shopping cart is empty.']"));

    rp.add("<b><font style=\"color:green;\">TEST PASSED!</font></b>");
    
	}
	  catch(Exception e){
		  e.printStackTrace();
		  rp.add("<p style=\"color:red;\">" + e.getMessage() + "</p>");
	  }
    
  }
}
