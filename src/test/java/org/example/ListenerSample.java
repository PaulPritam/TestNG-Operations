package org.example;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenerSample implements ITestListener {

    public String url = "https://www.guru99.com/";

    @Override
    public void onTestStart(ITestResult result) {

        System.out.println("-----On test start-----");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("-----On test success-----" + "The method name is: " + result.getMethod());

    }

    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println("!!!!!!! On test failure !!!!!!! " + " The failed method: " + result.getMethod());

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("----- The skipped Test -----" + " Method: " + result.getMethod());
    }
}
