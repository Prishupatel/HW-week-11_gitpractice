package homework3;

import browser.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutomationPractice extends BaseTest {
    String baseUrl=" http://automationpractice.com/index.php";

    @Before
    public void Setup(){
        openBrowser(baseUrl);
    }

    @Test
    public void UserShouldNotAbleToLogin(){
        driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("prime123@gmail.com");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("123654");
        driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();

        String expectedmsg="There is 1 error";
        WebElement message= driver.findElement(By.xpath("//p[contains(text(),'There is 1 error')]"));
        String actualMessage= message.getText();
        System.out.println(actualMessage);
        Assert.assertEquals(expectedmsg,actualMessage);



    }
    @After
    public void tearDown(){
        closeBrowser();
    }




}
