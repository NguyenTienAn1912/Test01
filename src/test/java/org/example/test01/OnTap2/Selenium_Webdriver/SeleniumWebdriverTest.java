package org.example.test01.OnTap2.Selenium_Webdriver;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SeleniumWebdriverTest {
    private WebDriver webDriver;
    private Path tempProfileDir;

    @BeforeEach
    void setup() throws IOException {
        WebDriverManager.chromedriver().setup();

        // ✅ Tạo thư mục profile riêng biệt cho mỗi session
        tempProfileDir = Files.createTempDirectory("chrome-profile-");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new"); // hoặc "--headless" nếu Chrome bạn cũ
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-gpu");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--user-data-dir=" + tempProfileDir.toAbsolutePath());

        webDriver = new ChromeDriver(options);
    }

    @Test
    void testSteps() throws InterruptedException {
        webDriver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        webDriver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]/li")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.id("usr")).sendKeys("sa");
        webDriver.findElement(By.id("pwd")).sendKeys("sa");
        webDriver.findElement(By.xpath("//*[@id=\"second_form\"]/input")).click();
        Thread.sleep(1000);
    }

    @AfterEach
    void tearDown() {
        if (webDriver != null) {
            webDriver.quit();
        }

        // ✅ Xóa thư mục profile tạm
        if (tempProfileDir != null) {
            try {
                Files.walk(tempProfileDir)
                        .sorted((a, b) -> b.compareTo(a)) // delete files first
                        .forEach(path -> {
                            try {
                                Files.deleteIfExists(path);
                            } catch (IOException ignored) {}
                        });
            } catch (IOException ignored) {}
        }
    }
}
