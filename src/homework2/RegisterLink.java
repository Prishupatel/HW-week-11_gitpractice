package homework2;

import browser.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class RegisterLink extends BaseTest {
    String baseUrl="https://www.google.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void verifyRegisterPage(){
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
       // driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
        driver.findElement(By.xpath("//a[@href='https://demo.nopcommerce.com/']")).click();
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        driver.findElement(By.xpath("//input[@id='gender-male']")).click();
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Kishan");
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Patel");
        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("9");
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("December");
        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("1995");

        Random randomGenerator=new Random();
        int randomInt=randomGenerator.nextInt(1000);


        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("xyz"+randomInt+"@gmail.com");
        driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("Prime Industries");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("abc@123");
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("abc@123");
        driver.findElement(By.xpath("//button[@id='register-button']")).click();

        String expectedmsg="Register";
        WebElement message= driver.findElement(By.xpath("//div[@class='page-title']"));
        String actualMessage= message.getText();
        System.out.println(actualMessage);
        Assert.assertEquals(expectedmsg,actualMessage);

    }






}

