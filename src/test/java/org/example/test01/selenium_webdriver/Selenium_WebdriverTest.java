package org.example.test01.selenium_webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.support.ui.*;
public class Selenium_WebdriverTest {

//    private WebDriver webDriver ;
//
//    @BeforeEach
//    void setUp(){
//        WebDriverManager.chromedriver().setup();
//        webDriver = new ChromeDriver();
//    }
//
//    @Test
//    void testSteps() throws InterruptedException {
//        //Open
//        webDriver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
//
//        //click menu
//        webDriver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();
//
//        //login
//        Thread.sleep(2000);
//        webDriver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]/li")).click();
//
//        //input value to form
//        webDriver.findElement(By.xpath("//*[@id=\"usr\"]")).sendKeys("sa");
//        webDriver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("sa");
//        //Submit
//        webDriver.findElement(By.xpath("//*[@id=\"second_form\"]/input")).click();
//
//        //test
//        WebElement webElement = webDriver.findElement(By.xpath("//*[@id=\"ShoeType\"]"));
//
//        String actualFirstCategory = webElement.getText();
//        String expectedFirstCategory = "Formal Shoes";
//        assertEquals(expectedFirstCategory, actualFirstCategory);
//        webDriver.quit();
//    }
//    @Test
//    void testSteps2() throws InterruptedException {
//        //Open
//        webDriver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
//
//        //click menu
//        webDriver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();
//
//        //login
//        Thread.sleep(2000);
//        webDriver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]/li")).click();
//
//        //open register
//        webDriver.findElement(By.xpath("//*[@id=\"NewRegistration\"]")).click();
//
//        //input values to form
//        WebElement SalutationDropdown = webDriver.findElement(By.xpath("//*[@id=\"Salutation\"]"));
//        Select selectSalutation = new Select(SalutationDropdown);
//        selectSalutation.selectByVisibleText("Mr.");
//        webDriver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Nguyen Tien");
//        webDriver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("An");
//        webDriver.findElement(By.xpath("//*[@id=\"emailId\"]")).sendKeys("sherlockh050@gmail.com");
//        webDriver.findElement(By.xpath("//*[@id=\"contactNumber\"]")).sendKeys("0919965342");
//        webDriver.findElement(By.xpath("//*[@id=\"usr\"]")).sendKeys("a19");
//        webDriver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("123");
//
//        //Submit
//        webDriver.findElement(By.xpath("//*[@id=\"first_form\"]/div/div[2]/center/input")).click();
//
//        //back to login
//        webDriver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();
//
//        Thread.sleep(2000);
//        webDriver.findElement(By.xpath("//*[@id=\"menu\"]/a/li")).click();
//
//        webDriver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();
//        Thread.sleep(2000);
//        webDriver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]/li")).click();
//        //input value to form
//        webDriver.findElement(By.xpath("//*[@id=\"usr\"]")).sendKeys("a19");
//        webDriver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("123");
//
//        //Submit
//        webDriver.findElement(By.xpath("//*[@id=\"second_form\"]/input")).click();
//        webDriver.quit();
//    }
}
