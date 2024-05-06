package ExtentReportDemo.ListnersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListners implements ITestListener {
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("onTestonTestFailure");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped");
    }
    public void onStart(ITestContext context) {
        System.out.println("onStart");
    }

    public void onFinish(ITestContext context) {
        System.out.println("onFinish");
    }
}



