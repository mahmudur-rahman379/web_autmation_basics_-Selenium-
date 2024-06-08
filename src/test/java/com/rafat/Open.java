package com.rafat;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Open {
    // @Test
    //  public void OpenWebpage() {
    //      WebDriver driver = new ChromeDriver();
    //      driver.get("https://chromewebstore.google.com/?hl=en");

    WebDriver driver;

    @BeforeSuite
    public void start_browser() {
        String browser_name = System.getProperty("BROWSER", "Chrome");
        if (browser_name.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        } else if (browser_name.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        } else {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.manage().window().maximize();

        }
        }
        @AfterSuite
        public void stop_browser() {
        driver.quit();
        }

    }

