package org.example.test01.OnTap2.Selenium_Webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumWebdriverTest {
    private WebDriver webDriver;

    @BeforeEach
    void setup(){
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        // ✅ Thêm các cấu hình này để tránh lỗi trên CI
        options.addArguments("--headless=new");         // hoặc "--headless" nếu Chrome cũ
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage"); // fix lỗi crash trong môi trường container

        webDriver = new ChromeDriver(options);
    }
    @Test
    void testSteps() throws InterruptedException {
        webDriver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");

        webDriver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();

        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]/li")).click();

        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//*[@id=\"usr\"]")).sendKeys("sa");
        webDriver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("sa");

        webDriver.findElement(By.xpath("//*[@id=\"second_form\"]/input")).click();

        Thread.sleep(1000);
        webDriver.quit();
    }
}
