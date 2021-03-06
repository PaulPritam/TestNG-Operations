package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

@Listeners(ListenerSample.class)
public class TryTestNG {

    public String url = "https://www.guru99.com/";
    public WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pritam Paul\\Downloads\\demo1\\TestNGOps\\src" +
                "\\driver1\\chromedriver.exe");
        System.out.println("Before Test executed");
    }

    @BeforeMethod
    public void tryBefore() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(url);
        System.out.println("Before Method executed");
    }

    @AfterMethod
    public void tryAfter() {
        System.out.println("After method Executed");
        driver.close();
    }


    @Test(priority = 1)
    public void verifyHompageTittle() {
//        String expectedRes = "Meet Guru99 – Free Training Tutorials & Video for IT Courses";
        String actualRes = driver.getTitle();
        System.out.println("First test executed");
    }

    @Test(dependsOnMethods = "verifyHompageTittle")
    public void should_ReturnUrlofTheAbovesite() {
        System.out.println("Depends on method executed: ");
        String url = driver.getCurrentUrl();
        System.out.println(url);
    }

    @Test(priority = 2)
    public void verifyCurrentTittle() {
        driver.get(url);
        String expectedRes = "https://www.guru99.com/";
        String actualRes = driver.getCurrentUrl();
//        System.out.println(actualRes);
//        Assert.assertEquals(actualRes, expectedRes);
        System.out.println("Second test executed");

    }

    @Test(priority = 3)
    public void useNavigate() {

        driver.get(url);
        driver.navigate().to("https://www.google.co.in/");
        String expectedRes = "Not-Google";
        String actualRes = driver.getTitle();
        Assert.assertEquals(expectedRes,actualRes);
        System.out.println("Third test executed");
    }

    @Test(dependsOnMethods = "useNavigate")
    public void should_ReturnUrlofTheAbovesiteAgain() {
        System.out.println("Second Depends on method executed: ");
        String url = driver.getCurrentUrl();
        System.out.println(url);
    }

    @AfterTest
    public void closeBrowser() {
        System.out.println("After Test executed");
    }


}
