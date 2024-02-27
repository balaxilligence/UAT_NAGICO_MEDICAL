package org.common;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends BasicFunctions{

	@BeforeSuite
	public void initDriver() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		String downloadPath =System.getProperty("user.dir")+"\\Provider_Claim_Appeal_File";
		chromePrefs.put("download.default_directory", downloadPath);
		options.setExperimentalOption("prefs",chromePrefs);   
		
		 driver = new ChromeDriver(options);
	//	 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(ReadExcelData.readExcel("Url", 1, 1));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	
	@DataProvider(name="Issue_Policy")
	public Object[][] Policy_Renewal() {

		Object[][] testData = ReadData.testData(System.getProperty("user.dir")+"\\ExcelUtils\\Test_Data.xlsx", "Issue_Policy");

		return testData;	
	}
	
	@DataProvider(name="Issue_Policy_Reg")
	public Object[][] Issue_Policy_Reg() {

		Object[][] testData = ReadData.testData(System.getProperty("user.dir")+"\\ExcelUtils\\Test_Data.xlsx", "Issue_Policy_Reg");

		return testData;	
	}
	
	@DataProvider(name="Endorsement")
	public Object[][] Endorsement() {

		Object[][] testData = ReadData.testData(System.getProperty("user.dir")+"\\ExcelUtils\\Test_Data.xlsx", "Endorsement");

		return testData;	
	}
	
	@DataProvider(name="Pre_Approval")
	public Object[][] Pre_Approval() {

		Object[][] testData = ReadData.testData(System.getProperty("user.dir")+"\\ExcelUtils\\Test_Data.xlsx", "Pre_Approval");

		return testData;	
	}

	@DataProvider(name="Reimbursement_Claim")
	public Object[][] Reimbursement_Claim() {

		Object[][] testData = ReadData.testData(System.getProperty("user.dir")+"\\ExcelUtils\\Test_Data.xlsx", "Reimbursement_Claim");

		return testData;	
	}
	
	@DataProvider(name="Provider_Claim")
	public Object[][] Provider_Claim() {

		Object[][] testData = ReadData.testData(System.getProperty("user.dir")+"\\ExcelUtils\\Test_Data.xlsx", "Provider_Claim");

		return testData;	
	}
	
	@DataProvider(name="Provider_Claim_MDS")
	public Object[][] Provider_Claim_MDS() {

		Object[][] testData = ReadData.testData(System.getProperty("user.dir")+"\\ExcelUtils\\Test_Data.xlsx", "Provider_Claim_MDS");

		return testData;	
	}
	@DataProvider(name="Provider_Portal_Claim")
	public Object[][] Provider_Portal_Claim() {

		Object[][] testData = ReadData.testData(System.getProperty("user.dir")+"\\ExcelUtils\\Test_Data.xlsx", "Provider_Portal_Claim");

		return testData;	
	}
	
	@DataProvider(name="Member_Portal_Claim")
	public Object[][] Member_Portal_Claim() {

		Object[][] testData = ReadData.testData(System.getProperty("user.dir")+"\\ExcelUtils\\Test_Data.xlsx", "Member_Portal_Claim");

		return testData;	
	}
	
	@DataProvider(name="Provider_Portal_Pre_Approval")
	public Object[][] Provider_Portal_Pre_Approval() {

		Object[][] testData = ReadData.testData(System.getProperty("user.dir")+"\\ExcelUtils\\Test_Data.xlsx", "Provider_Portal_Pre_Approval");

		return testData;	
	}

	@AfterSuite
	public void tearDown() {

//		driver.close();
//		driver.quit();
	}

}
