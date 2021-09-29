package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ParallelTests {

    public WebDriver driver;

    @Test
    public void test1()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pritam Paul\\Downloads\\demo1\\TestNGOps\\src" +
                "\\driver1\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.google.co.in/");
        System.out.println("Test 1: " + Thread.currentThread().getId());
    }

    @Test
    public void test2()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pritam Paul\\Downloads\\demo1\\TestNGOps\\src" +
                "\\driver1\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.selenium.dev/");
        System.out.println("Test 2: " + Thread.currentThread().getId());
    }

    @Test
    public void test3()
    {
        System.out.println("Test 3: " + Thread.currentThread().getId());
    }
}
