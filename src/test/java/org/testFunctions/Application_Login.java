package org.testFunctions;

import java.io.IOException;

import org.common.BaseClass;
import org.common.ReadExcelData;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.pages.Application_Login_Page;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Application_Login extends BaseClass{
	@Test
	public void tc_001() throws IOException, InterruptedException {

		Application_Login_Page obj = new Application_Login_Page();
		driver.get(ReadExcelData.readExcel("Url", 1, 1));
		//		Select Employee Option
		webDriverWait(ExpectedConditions.elementToBeClickable(obj.Employee_Option()));
		obj.Employee_Option().click();
		//		Enter UserID
		webDriverWait(ExpectedConditions.visibilityOf(obj.Employee_Id_Field()));
		obj.Employee_Id_Field().sendKeys(ReadExcelData.readExcel("Login", 1, 1));

		//		Enter Password
		webDriverWait(ExpectedConditions.visibilityOf(obj.password_Field()));
		obj.password_Field().sendKeys(ReadExcelData.readExcel("Login", 1, 2));

		//		Click Login Button
		webDriverWait(ExpectedConditions.elementToBeClickable(obj.login_Button()));
		obj.login_Button().click();
		
		Thread.sleep(25000);

		//		User Profile Name Verification 
		webDriverWait(ExpectedConditions.visibilityOf(obj.get_User_Profile_Name()));
		String user_Profile_Name = obj.get_User_Profile_Name().getText();
		System.out.println("User Profile Name is: "+user_Profile_Name);

		if (user_Profile_Name.contains(ReadExcelData.readExcel("Login", 1, 3))) {

			Assert.assertEquals(user_Profile_Name, ReadExcelData.readExcel("Login", 1, 3));
			System.out.println("Employee named " +user_Profile_Name+" signed in into the application successfully" );
		}
		else {
			Assert.fail();
			System.out.println("Test Case Failed");

		}

	}

}
