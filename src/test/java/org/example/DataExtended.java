package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataExtended {

    @Test(dataProvider = "names")
    public void testMethod(String user, String pass) {
        String u = user;
    }

    @Test(dataProvider = "names")
    public void testMethodA(String user) {
        String us = user;
    }

    @DataProvider(name = "names")
    public Object[][] getDataFromDP(Method method) {
        if (method.getName().equalsIgnoreCase("testMethodA")) {
            return new Object[][]
                    {
                            {"standard_user", "secret_sauce"},
                            {"locked_out_user", "secret_sauce"},
                            {"problem_user", "secret_sauce"},
                            {"performance_glitch_user", "secret_sauce"}
                    };
        }
        else
            return new Object[][]
                    {
                            {"secret_sauce"},
                            {"secret_sauce"}
                    };
    }

}
