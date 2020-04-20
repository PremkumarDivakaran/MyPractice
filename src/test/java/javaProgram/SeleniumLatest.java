package javaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Collections;

public class SeleniumLatest {

    ChromeDriver driver;

    @BeforeClass
    public void openUrl(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("useAutomationExtension", false);
        chromeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        System.setProperty("webdriver.chrome.driver", "/Users/prdivaka/Selenium Driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @Test
    public void searchInGoogle(){
        driver.findElement(By.name("q")).sendKeys("selenium");
        //driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }



}
