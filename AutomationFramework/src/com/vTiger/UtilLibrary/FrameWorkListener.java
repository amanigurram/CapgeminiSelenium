package com.vTiger.UtilLibrary;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

 public class FrameWorkListener implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult rv)
	{
		String s = rv.getName();
		CommonLibrary.takeScreenshot(s);
		
	}

	@Override
	public void onTestStart(ITestResult result)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	}
