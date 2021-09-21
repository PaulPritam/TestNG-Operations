package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TryTestNG {

    public String url = "https://www.guru99.com/";
    public WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pritam Paul\\Downloads\\demo1\\MethodsofSelect\\" +
                "src\\driver\\chromedriver.exe");
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
        String expectedRes = "Google";
        String actualRes = driver.getTitle();
//        Assert.assertEquals(actualRes, expectedRes);
        System.out.println("Third test executed");


    }

    @AfterTest
    public void closeBrowser() {
        System.out.println("After Test executed");
    }


}
