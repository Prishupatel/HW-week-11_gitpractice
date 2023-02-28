package homework1;

import browser.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NopCommerceTest extends BaseTest {
    String baseUrl="https://www.google.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void typeInGoogle(){
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@id='gbqfbb']/preceding-sibling::*")).click();
        driver.findElement(By.xpath("//a[@href='https://demo.nopcommerce.com/']")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/computers']")).click();
        String expectedmsg="Computers";
        WebElement message=driver.findElement(By.xpath("//div[@class='page-title']"));
        String actualMessage= message.getText();
        System.out.println(actualMessage);
        Assert.assertEquals("Text did not match, Fix it !!",expectedmsg,actualMessage);

    }
    @Test
    public void verifyPageNavigateToElectronics(){
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@id='gbqfbb']/preceding-sibling::input")).click();
        driver.findElement(By.xpath("//a[@href='https://demo.nopcommerce.com/']")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']")).click();
        String expectedmsg="Electronics";
        WebElement message= driver.findElement(By.xpath("//div[@class='page-title']"));
        String actualMessage= message.getText();
        System.out.println(actualMessage);
        Assert.assertEquals(expectedmsg,actualMessage);

    }
    @Test
    public void verifyPageNavigateToApparel(){
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@id='gbqfbb']/preceding-sibling::input")).click();
        driver.findElement(By.xpath("//a[@href='https://demo.nopcommerce.com/']")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']")).click();
        String expectedmsg="Apparel";
        WebElement message= driver.findElement(By.xpath("//div[@class='page-title']"));
        String actualMessage= message.getText();
        System.out.println(actualMessage);
        Assert.assertEquals(expectedmsg,actualMessage);

    }

    @Test
    public void verifyPageNavigateToDigitalDownload(){
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@id='gbqfbb']/preceding-sibling::input]")).click();
        driver.findElement(By.xpath("//a[@href='https://demo.nopcommerce.com/']")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")).click();
        String expectedmsg="Digital downloads ";
        WebElement message= driver.findElement(By.xpath("//div[@class='page-title']"));
        String actualMessage= message.getText();
        System.out.println(actualMessage);
        Assert.assertEquals(expectedmsg,actualMessage);

    }

    @Test
    public void verifyPageNaviateToBooks(){
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@id='gbqfbb']/preceding-sibling::input")).click();
        driver.findElement(By.xpath("//a[@href='https://demo.nopcommerce.com/']")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']")).click();
        String expectedmsg="Books ";
        WebElement message= driver.findElement(By.xpath("//div[@class='page-title']"));
        String actualMessage= message.getText();
        System.out.println(actualMessage);
        Assert.assertEquals(expectedmsg,actualMessage);

    }
    @Test
    public void verifyPageNavigateToJewelty(){
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@id='gbqfbb']/preceding-sibling::input")).click();
        driver.findElement(By.xpath("//a[@href='https://demo.nopcommerce.com/']")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']")).click();
        String expectedmsg="Jewelry";
        WebElement message= driver.findElement(By.xpath("//div[@class='page-title']"));
        String actualMessage= message.getText();
        System.out.println(actualMessage);
        Assert.assertEquals(expectedmsg,actualMessage);

    }
    @Test
    public void verifyPageNavigateToGiftCards(){
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@id='gbqfbb']/preceding-sibling::input")).click();
        driver.findElement(By.xpath("//a[@href='https://demo.nopcommerce.com/']")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']")).click();
        String expectedmsg="Gift Cards";
        WebElement message= driver.findElement(By.xpath("//div[@class='page-title']"));
        String actualMessage= message.getText();
        System.out.println(actualMessage);
        Assert.assertEquals("Gift card page not found",expectedmsg,actualMessage);

    }
    @After
    public void tearDown(){
        closeBrowser();
    }







}
