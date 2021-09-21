package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TryoutTestNGXml {

    public static WebDriver driver;

    @BeforeGroups("sendKeys")
    public static void setDriver()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pritam Paul\\Downloads\\demo1\\MethodsofSelect\\" +
                "src\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Before Groups executed");
    }

    @Test(groups = {"sendKeys"})
    public void should_NavigateAndSendKeys() {

        System.out.println("The driver is: " + driver);
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Alexa");
        driver.findElement(By.id("nav-search-submit-button")).click();
        System.out.println("Groups-sendKeys executed");
    }

    @Test(groups = {"sendKeys","navigate"})
    public void should_NavigateTOTheGivenWebPage() {

        driver.navigate().to("https://www.myntra.com/");
        System.out.println("Groups-navigate executed");
    }
}