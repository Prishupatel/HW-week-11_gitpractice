package homework4;

import browser.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrangeHRM extends BaseTest
{
    String baseUrl="https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test

    public void userShouldLoginSuccessfully(){
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

        String expectedmsg="welcome";
        WebElement message= driver.findElement(By.xpath("//a[@id='welcome']"));
        String actualMessage= message.getText();
        System.out.println(actualMessage);
        Assert.assertEquals(expectedmsg,actualMessage);

    }



}


