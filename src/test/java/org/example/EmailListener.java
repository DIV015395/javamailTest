package org.example;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class EmailListener implements ITestListener {
    @Override
    public void onFinish(ITestContext context) {
        // Call the EmailReportSender class to send the email here

    }

    // Implement other methods of ITestListener as needed
}


//<listeners>
//<listener class-name="org.example.EmailListener" />
//</listeners>
