package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTests {

    public WebDriver driver;

    @Test
    public void test1()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pritam Paul\\Downloads\\demo1\\MethodsofSelect\\" +
                "src\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        System.out.println("Test 1: " + Thread.currentThread().getId());
    }

    @Test
    public void test2()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pritam Paul\\Downloads\\demo1\\MethodsofSelect\\" +
                "src\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        System.out.println("Test 2: " + Thread.currentThread().getId());
    }

    @Test
    public void test3()
    {
        System.out.println("Test 3: " + Thread.currentThread().getId());
    }
}
