package com.vmetry.Reportgenerator;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;
import com.vmetry.NTL.Intializer.Initializer;

public class Reportgenerator extends Initializer {

	public static void generatereport(ITestResult it) throws IOException {
		Object[] data = it.getParameters();
		if (it.isSuccess()) {
			String path = takeScreenshot(data[0].toString());
			log.log(LogStatus.PASS, "testcase pass", log.addScreenCapture(path));
		} else {
			String path = takeScreenshot(data[0].toString());
			log.log(LogStatus.FAIL, "testcase pass", log.addScreenCapture(path));
		}
		reports.endTest(log);
		reports.flush();
	}

	public static String takeScreenshot(String name) throws IOException{
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		File dst=new File("C:\\SeleniumWorkspace\\DDDTest\\Screenshot\\"+name+".jpg");
		FileUtils.copyFile(src, dst);
		return dst.toString();
}
	public static void archivefile() throws IOException {
		SimpleDateFormat df= new SimpleDateFormat("YYYY-MM-DD-HH-MM-SS-mm");
		String date=df.format(new Date());
		
		
		File src=new File("C:\\SeleniumWorkspace\\DDDTest\\Screenshot");
		File dst= new File("C:\\SeleniumWorkspace\\DDDTest\\archiveFiles\\old_"+date);
		
		FileUtils.copyDirectory(src, dst);
		FileUtils.cleanDirectory(src);

	}
}
