package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNGSecond {

    public static WebDriver driver;

    @BeforeClass
    public static void setup()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pritam Paul\\Downloads\\demo1\\MethodsofSelect\\" +
                "src\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Before class executed ");
    }

    @BeforeMethod
    public void startFromThisSite()
    {
        driver.get("https://www.google.co.in/");
        System.out.println("Before method executed ");
    }

    @Test(priority = 1)
    public void navigateToNextSite()
    {
        driver.navigate().to("https://www.cars24.com/");
        System.out.println("First Test case executed ");
    }

    @AfterMethod
    public void shouldReturn_TheUrlOfThePages()
    {
        System.out.println("The current URL is: ");
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        System.out.println("After method executed ");
    }

    @AfterMethod
    public void shouldReturn_TheTittleOfThePages()
    {
        String tittle = driver.getTitle();
        System.out.println(tittle);
        System.out.println("After Method executed ");
    }

    @AfterClass
    public  void closeBrowser()
    {
        driver.close();
        System.out.println("After class executed ");
    }


}
