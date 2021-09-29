package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TheDataProvider1 {

//    @DataProvider(name = "login")
//    public Object[][] data() {
//
//        return new Object[][]
//                {
//                        {"standard_user", "secret_sauce"},
//                        {"locked_out_user", "secret_sauce"},
//                        {"problem_user", "secret_sauce"},
//                        {"performance_glitch_user", "secret_sauce"}
//
//                };
//    }

//    @DataProvider(name = "login")
//    public Object[][] data() {
//
//        Object[][] data= new Object[2][2];
//
//        data[0][0] = "standard_user";
//        data[0][1] = "secret_sauce";
//        data[1][0] = "problem_user";
//        data[1][1] = "secret_sauce";
//
//        return data;
//    }


//    @Test(dataProvider = "login")

    @Test
    @Parameters({"user","password"})
    public void testData(String userName, String password) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pritam Paul\\Downloads\\demo1\\TestNGOps\\src" +
                "\\driver1\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        Thread.sleep(3000);

        driver.close();

    }


}
