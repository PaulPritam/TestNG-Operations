package org.example;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTry2 {

    @Test(dataProvider = "data1", groups = "A")
    public void testMethodA(String u, String pass) {
        String user = u;
        System.out.println("Username " + user + "\n");
        System.out.println("Password " + pass + "\n");

    }

    @Test(dataProvider = "data1", groups = "B")
    public void testMethodB(String pass) {
        String password = pass;
        System.out.println("Only password: " + password + "\n");

    }

    @DataProvider(name = "data1")
    public Object[][] getDataFromDP(ITestContext iTestContext) {
        Object[][] groupArray = null;

        for (String group : iTestContext.getIncludedGroups())
        {
            if (group.equalsIgnoreCase("A")) {
                groupArray = new Object[][]
                        {
                                {"standard_user", "secret_sauce"},
                                {"locked_out_user", "secret_sauce"},
                                {"problem_user", "secret_sauce"},
                                {"performance_glitch_user", "secret_sauce"}
                        };
                break;

            }
            else if (group.equalsIgnoreCase("b")) {
                groupArray = new Object[][]
                        {
                                {"secret_sauce"},
                                {"secret_sauce"},
                                {"secret_sauce"},
                                {"secret_sauce"},
                        };

            }
            break;

        }
        return groupArray;
    }
}
