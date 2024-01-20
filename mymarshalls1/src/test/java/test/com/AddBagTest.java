/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author bysho
 */
public class AddBagTest {
    private WebDriver driver;
    private String baseUrl;
    
    public AddBagTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
  public void testAddBag() throws Exception {
    driver.get("https://www.marshalls.com/us/store/shop/womens-handbags-purses/_/N-3758044351?ln=4:1");
    driver.findElement(By.xpath("//img[@alt=' ']")).click();
    driver.get("https://www.marshalls.com/us/store/jump/product/women-women-handbags/Love-Is-Juicy-Backpack/4000221752?colorId=NS4154762&pos=1:1&N=3758044351");
    driver.findElement(By.id("addItemToOrder")).click();
    driver.findElement(By.linkText("View Bag")).click();
    driver.get("https://www.marshalls.com/us/store/checkout/cart.jsp");
  }

     //@Test
  public void testRemove() throws Exception {
    driver.get("https://www.marshalls.com/us/store/checkout/cart.jsp?_requestid=4791871");
    driver.findElement(By.xpath("//img[@alt='Cozy Plush Skinny Jeans']")).click();
    driver.get("https://www.marshalls.com/us/store/jump/product/Cozy-Plush-Skinny-Jeans/4000237406?cs=cart&rrec=true");
    driver.findElement(By.linkText("6")).click();
    driver.findElement(By.id("addItemToOrder")).click();
    driver.findElement(By.linkText("Keep Shopping")).click();
    driver.findElement(By.id("usmm-tl-cat3620040p")).click();
    driver.get("https://www.marshalls.com/us/store/shop/women/_/N-2906019403?tn=2");
    driver.findElement(By.xpath("//div[@id='endeca-main']/div[2]/div/div[2]/ul/li[4]/a")).click();
    driver.get("https://www.marshalls.com/us/store/shop/womens-handbags-purses/_/N-3758044351?ln=4:1");
    driver.findElement(By.xpath("//img[@alt=' ']")).click();
    driver.get("https://www.marshalls.com/us/store/jump/product/women-women-handbags/Love-Is-Juicy-Backpack/4000221752?colorId=NS4154762&pos=1:1&N=3758044351");
    driver.findElement(By.id("addItemToOrder")).click();
    driver.findElement(By.linkText("View Bag")).click();
    driver.get("https://www.marshalls.com/us/store/checkout/cart.jsp");
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.id("quantity")).click();
    new Select(driver.findElement(By.id("quantity"))).selectByVisibleText("0");
    driver.findElement(By.name("removeAndAddItemToOrder")).click();
    driver.findElement(By.xpath("//form[@id='cartUpdateForm']/ul/li/div[3]/a")).click();
  }

  
}
