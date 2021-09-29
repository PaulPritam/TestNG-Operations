package org.example;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.converters.ExtentHtmlBddNodesConverter;
import org.testng.annotations.Test;

import java.io.IOException;

public class ReportsExtent {

    @Test
    public void reporter() throws Exception {
        ExtentHtmlReporter extentHtmlReporter = new ExtentHtmlReporter("C:\\Users\\Pritam Paul\\" +
                "Downloads\\demo1\\TestNGOps\\src\\reports.html");

        ExtentReports extentReports = new ExtentReports();

        extentReports.attachReporter(extentHtmlReporter);

        ExtentTest logger = extentReports.createTest("Login to Flipkart Test");

        logger.log(Status.INFO,"login to Flipkart");

        logger.log(Status.PASS,"Tittle verified");

        extentReports.flush();

        ExtentTest logger2 = extentReports.createTest("Log out from flipkart Test");

        logger2.log(Status.FAIL, "Tittle verified");

        logger2.fail("Failed for some reasons " , MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\" +
                "Pritam Paul\\Downloads\\demo1\\TestNGOps\\src\\reportImage.png").build());

        logger2.pass("Passed: Issue resolved " , MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\" +
                "Pritam Paul\\Downloads\\demo1\\TestNGOps\\src\\reportImage.png").build());

        extentReports.flush();

    }

}
