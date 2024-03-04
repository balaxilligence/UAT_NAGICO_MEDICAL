package org.testFunctions;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;


import org.common.BaseClass;
import org.common.ReadExcelData;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.pages.Additional_Info_Page;
import org.pages.Application_Login_Page;
import org.pages.Customer_Info_Page;
import org.pages.Member_Info_page;
import org.pages.Plan_and_Benefit_Info_Page;
import org.pages.Summary_Page;
import org.pages.Underwriting_Page;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Issue_Policy_Reg extends BaseClass{

	@Test(dataProvider="Issue_Policy_Reg")
	public void tc_001(String S_No,String Policy_Type,String Insured_Code,String Insured_Name,
			String Business_Source,String Nature_Of_Business,String Product,String Limit_Currency,
			String Customer_Currency,String Premium_Payment_Mode,String Addition_of_Member_Calc_Type,
			String Deletion_of_Member_Calc_Type, String Benefit_Year,String Agent_Code,
			String Commission_Percentage,String Broker_Code,String Plan,String Sub_Plan,
			String Limit_Amount_FC,String Limit_Basis,String Premium_Rate_Basis,String Appl_Network,
			String Scope_of_Cover,String Emergency_Cover,String Emergency_Cover_Days,String Indv_Ded_Per_Year,
			String Loadings,String Applicable_Premium,String Loading_Type,String Loading_Rate,String Employee_Name,
			String Employee_Number,String Gender,String Civil_Id,String DOB,String Passport_Number,
			String Martial_Status,String Family_Unit,String Occupation_Class,String Charges,String Charges_Type,
			String Charges_Value,String Mode_of_Pay, String Insured_Billing_Account) throws IOException, InterruptedException, AWTException {

		Application_Login_Page login = new Application_Login_Page();
		System.out.println(" ");
		driver.get(ReadExcelData.readExcel("Url", 1, 1));
		update_Status("Issue_Policy_Reg", "Status", "Not Execute", S_No);
		//		Select Employee Option
		webDriverWait(ExpectedConditions.elementToBeClickable(login.Employee_Option()));
		login.Employee_Option().click();
		//		Enter UserID
		webDriverWait(ExpectedConditions.visibilityOf(login.Employee_Id_Field()));
		login.Employee_Id_Field().sendKeys(ReadExcelData.readExcel("Login", 1, 1));

		//		Enter Password
		webDriverWait(ExpectedConditions.visibilityOf(login.password_Field()));
		login.password_Field().sendKeys(ReadExcelData.readExcel("Login", 1, 2));

		//		Click Login Button
		webDriverWait(ExpectedConditions.elementToBeClickable(login.login_Button()));
		login.login_Button().click();

		Thread.sleep(30000);

		//		User Profile Name Verification 
		webDriverWait(ExpectedConditions.visibilityOf(login.get_User_Profile_Name()));
		String user_Profile_Name = login.get_User_Profile_Name().getText();
		System.out.println("User Profile Name is: "+user_Profile_Name);

		if (user_Profile_Name.contains(ReadExcelData.readExcel("Login", 1, 3))) {

			Assert.assertEquals(user_Profile_Name, ReadExcelData.readExcel("Login", 1, 3));
			System.out.println("Employee named " +user_Profile_Name+" signed in into the application successfully" );
		}
		else {
			Assert.fail();
			System.out.println("Test Case Failed");

		}

		Underwriting_Page objref = new Underwriting_Page();

		//		Click Underwriting option
		webDriverWait(ExpectedConditions.elementToBeClickable(objref.underwriting_Menu()));
		objref.underwriting_Menu().click();
		if (Policy_Type.equals("Group Medical")) {
			//			click Group Medical Option
			webDriverWait(ExpectedConditions.elementToBeClickable(objref.group_Medical_Menu()));
			objref.group_Medical_Menu().click();
		} else if(Policy_Type.equals("Individual Medical")){

			webDriverWait(ExpectedConditions.elementToBeClickable(objref.Individual_Medical_Menu()));
			objref.Individual_Medical_Menu().click();

		} else if(Policy_Type.equals("Individual Personal Accident")){
			webDriverWait(ExpectedConditions.elementToBeClickable(objref.Personal_Accident_Individual_Medical_Menu()));
			objref.Personal_Accident_Individual_Medical_Menu().click();
		}else if(Policy_Type.equals("Group Personal Accident")){
			webDriverWait(ExpectedConditions.elementToBeClickable(objref.Personal_Accident_Group_Medical_Menu()));
			objref.Personal_Accident_Group_Medical_Menu().click();
		}else if(Policy_Type.equals("Group Critical")) {
			webDriverWait(ExpectedConditions.elementToBeClickable(objref.critical_Illness_Group_Menu()));
			objref.critical_Illness_Group_Menu().click();
		}else if(Policy_Type.equals("Individual Critical Illness")) {
			webDriverWait(ExpectedConditions.elementToBeClickable(objref.critical_illness_Individual_Menu()));
			objref.critical_illness_Individual_Menu().click();
		}


		Customer_Info_Page obj = new Customer_Info_Page();

		if(Policy_Type.equals("Group Personal Accident")||Policy_Type.equals("Individual Personal Accident")
				||Policy_Type.equals("Group Critical")||Policy_Type.equals("Individual Critical Illness")){
			//				Enter Assured name
			webDriverWait(ExpectedConditions.visibilityOf(obj.customer_Code_Field()));
			obj.customer_Code_Field().sendKeys(Insured_Code);
			Thread.sleep(2000);
			keyPress(KeyEvent.VK_DOWN);
			keyRelease(KeyEvent.VK_DOWN);
			keyPress(KeyEvent.VK_ENTER);
			keyRelease(KeyEvent.VK_ENTER);
		}else {

			//		Enter Assured name
			webDriverWait(ExpectedConditions.visibilityOf(obj.Assured_Field()));
			obj.Assured_Field().sendKeys(Insured_Code);
			Thread.sleep(2000);
			keyPress(KeyEvent.VK_DOWN);
			keyRelease(KeyEvent.VK_DOWN);
			keyPress(KeyEvent.VK_ENTER);
			keyRelease(KeyEvent.VK_ENTER);
		}
		//		Select Business Source
		webDriverWait(ExpectedConditions.visibilityOf(obj.Business_Source_Dropdown()));
		selectByVisibleText(obj.Business_Source_Dropdown(), Business_Source);

		if (Policy_Type.equals("Group Medical")||Policy_Type.equals("Group Personal Accident")
				||Policy_Type.equals("Individual Personal Accident")||Policy_Type.equals("Group Critical")
				||Policy_Type.equals("Individual Critical Illness")) {
			//			Select Nature of Business
			webDriverWait(ExpectedConditions.visibilityOf(obj.nature_of_Business_Dropdown()));
			obj.nature_of_Business_Dropdown().sendKeys(Nature_Of_Business);
		} else if(Policy_Type.equals("Individual Medical")){

		}

		//		Select Limit Currency
		webDriverWait(ExpectedConditions.visibilityOf(obj.Limit_Currency_Dropdown()));
		selectByVisibleText(obj.Limit_Currency_Dropdown(), Limit_Currency);

		//		Select Customer Currency
		webDriverWait(ExpectedConditions.visibilityOf(obj.Customer_Currency_Dropdown()));
		selectByVisibleText(obj.Customer_Currency_Dropdown(), Customer_Currency);

		//		Select Premium Payment Mode
		webDriverWait(ExpectedConditions.elementToBeClickable(obj.premium_Payment_Mode()));
		selectByVisibleText(obj.premium_Payment_Mode(), Premium_Payment_Mode);

		//		Select Addition of Member calculation Type
		webDriverWait(ExpectedConditions.visibilityOf(obj.Addition_of_Member_Cal_Type_Dropdown()));
		selectByVisibleText(obj.Addition_of_Member_Cal_Type_Dropdown(), Addition_of_Member_Calc_Type);
		//		select Deletion of member Calculation Type
		webDriverWait(ExpectedConditions.visibilityOf(obj.deletion_of_Member_Cal_Type_Dropdown()));
		selectByVisibleText(obj.deletion_of_Member_Cal_Type_Dropdown(), Deletion_of_Member_Calc_Type);

		//		Select Benefit Year
		webDriverWait(ExpectedConditions.elementToBeClickable(obj.benefit_Year_Dropdown()));
		selectByVisibleText(obj.benefit_Year_Dropdown(), Benefit_Year);

		if (Business_Source.equals("Agent")) {
			//			Enter Agent name 
			webDriverWait(ExpectedConditions.elementToBeClickable(obj.Agent_name_Field()));
			obj.Agent_name_Field().sendKeys(Agent_Code);
			Thread.sleep(2000);
			keyPress(KeyEvent.VK_DOWN);
			keyRelease(KeyEvent.VK_DOWN);
			keyPress(KeyEvent.VK_ENTER);
			keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			//			Enter Commission Percentage
			webDriverWait(ExpectedConditions.elementToBeClickable(obj.Broker_Commission_Field()));
			obj.Broker_Commission_Field().sendKeys(Commission_Percentage);
		} else if(Business_Source.equals("Broker")){

			//			Enter Agent name 
			webDriverWait(ExpectedConditions.elementToBeClickable(obj.Broker_name_Field()));
			obj.Broker_name_Field().sendKeys(Broker_Code);
			Thread.sleep(2000);
			keyPress(KeyEvent.VK_DOWN);
			keyRelease(KeyEvent.VK_DOWN);
			keyPress(KeyEvent.VK_ENTER);
			keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			//			Enter Commission Percentage
			webDriverWait(ExpectedConditions.elementToBeClickable(obj.Broker_Commission_Field()));
			obj.Broker_Commission_Field().sendKeys(Commission_Percentage);

		}


		webDriverWait(ExpectedConditions.elementToBeClickable(obj.proceed_Button()));
		obj.proceed_Button().click();

		Plan_and_Benefit_Info_Page object = new Plan_and_Benefit_Info_Page();

		//		Get Quote Number 
		webDriverWait(ExpectedConditions.visibilityOf(object.get_Quote_Number()));
		String quote_Number = object.get_Quote_Number().getText();
		System.out.println("Quote Number is: "+quote_Number);
		
		update_Status("Issue_Policy_Reg", "Quote_Number", quote_Number, S_No);

		//		Type Of Policy Verification
		String Type_of_Policy = object.get_Policy_Type().getText();
		System.out.println("Policy Type is: "+Type_of_Policy);

		if (Type_of_Policy.contains(Policy_Type)) {

			Assert.assertEquals(Type_of_Policy, Policy_Type);
			System.out.println("Type of Policy Verification Passed");

		} else {
			Assert.fail();
			System.out.println("Type of Policy Verification Failed");

		}

		//		Customer Name Verification 
		String customer_Name = object.get_Customer_Name().getText();
		System.out.println("Customer Name is: "+customer_Name);
		if (customer_Name.contains(Insured_Name)) {
			Assert.assertEquals(customer_Name, Insured_Name);
			System.out.println("Customer Name Verification Passed");

		} else {
			Assert.fail();
			System.out.println("Customer Name Verification Failed");

		}

		//		Click Add Plan Button
		webDriverWait(ExpectedConditions.elementToBeClickable(object.add_Plan_Button()));
		scrollUpJavaSc(object.add_Plan_Button());
		object.add_Plan_Button().click();

		//		Select Plan
		webDriverWait(ExpectedConditions.visibilityOf(object.plan_Dropdown()));
		selectByVisibleText(object.plan_Dropdown(), Plan);

		//		Select sub Plan
		webDriverWait(ExpectedConditions.visibilityOf(object.sub_Plan_Dropdown()));
		selectByVisibleText(object.sub_Plan_Dropdown(), Sub_Plan);
		Thread.sleep(3000);
		//		Select Limit Basis
		webDriverWait(ExpectedConditions.elementToBeClickable(object.limit_Basis_Dropdown()));
		selectByVisibleText(object.limit_Basis_Dropdown(), Limit_Basis);

		//		WebElement select Premium Rate Basis
		webDriverWait(ExpectedConditions.visibilityOf(object.premium_Rate_Basis_Dropdown()));
		selectByVisibleText(object.premium_Rate_Basis_Dropdown(), Premium_Rate_Basis);

		//		Select scope of Cover
		webDriverWait(ExpectedConditions.visibilityOf(object.scope_of_Cover_Dropdown()));
		selectByVisibleText(object.scope_of_Cover_Dropdown(), Scope_of_Cover);


		Thread.sleep(1000);
		//		Enter Limit Amount Fc
		webDriverWait(ExpectedConditions.visibilityOf(object.limit_Amount_FC_Field()));
		object.limit_Amount_FC_Field().click();
		doubleClick(object.limit_Amount_FC_Field());
		keyPress(KeyEvent.VK_BACK_SPACE);
		keyRelease(KeyEvent.VK_BACK_SPACE);
		object.limit_Amount_FC_Field().sendKeys(Limit_Amount_FC,Keys.TAB);


		if (Policy_Type.equals("Individual Medical")) {
			//			Select Appl Network
			webDriverWait(ExpectedConditions.visibilityOf(object.Appl_Network_Dropdown()));
			selectByVisibleText(object.Appl_Network_Dropdown(), Appl_Network);
			//			Select Emergency Cover
			webDriverWait(ExpectedConditions.visibilityOf(object.emergency_Cover_Dropdown()));
			selectByVisibleText(object.emergency_Cover_Dropdown(), Emergency_Cover);
			Thread.sleep(2000);	
			//			Emergency Cover Days
			webDriverWait(ExpectedConditions.visibilityOf(object.emergency_Cover_Days_Field()));
			object.emergency_Cover_Days_Field().clear();
			object.emergency_Cover_Days_Field().sendKeys(Emergency_Cover_Days,Keys.TAB);
			//			Enter indv ded Per year
			webDriverWait(ExpectedConditions.elementToBeClickable(object.indv_Ded_Per_Year_Field()));
			object.indv_Ded_Per_Year_Field().clear();
			object.indv_Ded_Per_Year_Field().sendKeys(Indv_Ded_Per_Year);


		} else if (Policy_Type.equals("Group Medical")) {
			//			Select Appl Network
			webDriverWait(ExpectedConditions.visibilityOf(object.Appl_Network_Dropdown()));
			selectByVisibleText(object.Appl_Network_Dropdown(), Appl_Network);

			//			Select Emergency Cover
			webDriverWait(ExpectedConditions.visibilityOf(object.emergency_Cover_Dropdown()));
			selectByVisibleText(object.emergency_Cover_Dropdown(), Emergency_Cover);
			Thread.sleep(2000);	
			//			Emergency Cover Days
			webDriverWait(ExpectedConditions.visibilityOf(object.emergency_Cover_Days_Field()));
			object.emergency_Cover_Days_Field().clear();
			object.emergency_Cover_Days_Field().sendKeys(Emergency_Cover_Days,Keys.TAB);
		} 


		//		Save The plan
		webDriverWait(ExpectedConditions.visibilityOf(object.save_Plan_Button()));
		object.save_Plan_Button().click();
		Thread.sleep(1000);

		if (Policy_Type.equals("Group Critical")) {
			if (Sub_Plan.equals("Critical Illness 14")) {
				webDriverWait(ExpectedConditions.elementToBeClickable(object.sub_Plan_Checkbox_1()));
				object.sub_Plan_Checkbox_1().click();

				webDriverWait(ExpectedConditions.elementToBeClickable(object.sub_Plan_Checkbox_2()));
				object.sub_Plan_Checkbox_2().click();

				webDriverWait(ExpectedConditions.elementToBeClickable(object.sub_Plan_Checkbox_3()));
				object.sub_Plan_Checkbox_3().click();

				webDriverWait(ExpectedConditions.elementToBeClickable(object.sub_Plan_Checkbox_4()));
				object.sub_Plan_Checkbox_4().click();
				webDriverWait(ExpectedConditions.elementToBeClickable(object.sub_Plan_Checkbox_5()));
				object.sub_Plan_Checkbox_5().click();
				//		        Click Next Button
				webDriverWait(ExpectedConditions.elementToBeClickable(object.next_Button()));
				object.next_Button().click();

				webDriverWait(ExpectedConditions.elementToBeClickable(object.sub_Plan_Checkbox_1()));
				object.sub_Plan_Checkbox_1().click();

				webDriverWait(ExpectedConditions.elementToBeClickable(object.sub_Plan_Checkbox_2()));
				object.sub_Plan_Checkbox_2().click();
				//		        Click Delete Button
				webDriverWait(ExpectedConditions.elementToBeClickable(object.sub_Benefit_Delete_Button()));
				object.sub_Benefit_Delete_Button().click();
				Thread.sleep(2000);
			} else if(Sub_Plan.equals("Critical Illness 7")){
				webDriverWait(ExpectedConditions.elementToBeClickable(object.sub_Plan_Checkbox_1()));
				object.sub_Plan_Checkbox_1().click();

				webDriverWait(ExpectedConditions.elementToBeClickable(object.sub_Plan_Checkbox_2()));
				object.sub_Plan_Checkbox_2().click();

				webDriverWait(ExpectedConditions.elementToBeClickable(object.sub_Plan_Checkbox_3()));
				object.sub_Plan_Checkbox_3().click();

				webDriverWait(ExpectedConditions.elementToBeClickable(object.sub_Plan_Checkbox_4()));
				object.sub_Plan_Checkbox_4().click();
				webDriverWait(ExpectedConditions.elementToBeClickable(object.sub_Plan_Checkbox_5()));
				object.sub_Plan_Checkbox_5().click();
				//		        Click Next Button
				webDriverWait(ExpectedConditions.elementToBeClickable(object.next_Button()));
				object.next_Button().click();

				webDriverWait(ExpectedConditions.elementToBeClickable(object.sub_Plan_Checkbox_1()));
				object.sub_Plan_Checkbox_1().click();

				webDriverWait(ExpectedConditions.elementToBeClickable(object.sub_Plan_Checkbox_2()));
				object.sub_Plan_Checkbox_2().click();

				webDriverWait(ExpectedConditions.elementToBeClickable(object.sub_Plan_Checkbox_3()));
				object.sub_Plan_Checkbox_3().click();

				webDriverWait(ExpectedConditions.elementToBeClickable(object.sub_Plan_Checkbox_4()));
				object.sub_Plan_Checkbox_4().click();
				webDriverWait(ExpectedConditions.elementToBeClickable(object.sub_Plan_Checkbox_5()));
				object.sub_Plan_Checkbox_5().click();
				//		        Click Next Button
				webDriverWait(ExpectedConditions.elementToBeClickable(object.next_Button()));
				object.next_Button().click();
				webDriverWait(ExpectedConditions.elementToBeClickable(object.sub_Plan_Checkbox_1()));
				object.sub_Plan_Checkbox_1().click();

				webDriverWait(ExpectedConditions.elementToBeClickable(object.sub_Plan_Checkbox_2()));
				object.sub_Plan_Checkbox_2().click();

				webDriverWait(ExpectedConditions.elementToBeClickable(object.sub_Plan_Checkbox_3()));
				object.sub_Plan_Checkbox_3().click();

				webDriverWait(ExpectedConditions.elementToBeClickable(object.sub_Plan_Checkbox_4()));
				object.sub_Plan_Checkbox_4().click();

				//		        Click Delete Button
				webDriverWait(ExpectedConditions.elementToBeClickable(object.sub_Benefit_Delete_Button()));
				object.sub_Benefit_Delete_Button().click();
				Thread.sleep(2000);			
			}

		}
		Thread.sleep(2000);	
		webDriverWait(ExpectedConditions.elementToBeClickable(object.proceed_Button()));
		scrollDownJavaSc(object.proceed_Button());
		object.proceed_Button().click();
		Member_Info_page objects = new Member_Info_page();

		//		Add Memeber
		webDriverWait(ExpectedConditions.elementToBeClickable(objects.add_Member_Button()));
		scrollUpJavaSc(objects.add_Member_Button());
		objects.add_Member_Button().click();
		Thread.sleep(3000);
		//		Enter Employee Name
		webDriverWait(ExpectedConditions.elementToBeClickable(objects.employee_First_Name_Field()));
		objects.employee_First_Name_Field().sendKeys(Employee_Name,Keys.TAB);

		//		Enter Employee Number
		webDriverWait(ExpectedConditions.elementToBeClickable(objects.employee_Number_Field()));
		objects.employee_Number_Field().sendKeys(Employee_Number,Keys.TAB);
		

		//		Select Plan
		webDriverWait(ExpectedConditions.elementToBeClickable(objects.plan_Dropdown()));
		selectByIndex(objects.plan_Dropdown(), 0);
		Thread.sleep(1000);
//		Select Gender
		webDriverWait(ExpectedConditions.elementToBeClickable(objects.gender_Dropdown()));
		selectByVisibleText(objects.gender_Dropdown(), Gender);
		
		//		Select Plan
		webDriverWait(ExpectedConditions.elementToBeClickable(objects.plan_Dropdown()));
		selectByVisibleText(objects.plan_Dropdown(), Plan);
		Thread.sleep(1000);
		
		//		Select Sub Plan
		webDriverWait(ExpectedConditions.elementToBeClickable(objects.sub_Plan_Dropdown()));
		selectByVisibleText(objects.sub_Plan_Dropdown(), Sub_Plan);

		//		Select Gender
		webDriverWait(ExpectedConditions.elementToBeClickable(objects.gender_Dropdown()));
		selectByVisibleText(objects.gender_Dropdown(), Gender);

		//		Enter Civil Id
		webDriverWait(ExpectedConditions.elementToBeClickable(objects.civil_Id_Field()));
		objects.civil_Id_Field().sendKeys(Civil_Id,Keys.TAB);

		//		Enter DOB Field
		Thread.sleep(1000);
		webDriverWait(ExpectedConditions.elementToBeClickable(objects.DOB_Field()));
		objects.DOB_Field().click();
		//		doubleClick(obj.DOB_Field());
		//		keyPress(KeyEvent.VK_BACK_SPACE);
		//		keyRelease(KeyEvent.VK_BACK_SPACE);	
		objects.DOB_Field().sendKeys(DOB);

		//		Enter Passport Number
		webDriverWait(ExpectedConditions.elementToBeClickable(objects.passport_Number()));
		objects.passport_Number().sendKeys(Passport_Number,Keys.TAB);

		//		Select Martial Status
		webDriverWait(ExpectedConditions.elementToBeClickable(objects.martial_Status()));
		selectByVisibleText(objects.martial_Status(), Martial_Status);

		//		Select Family Unit
		webDriverWait(ExpectedConditions.elementToBeClickable(objects.family_Unit_Dropdown()));
		selectByVisibleText(objects.family_Unit_Dropdown(), Family_Unit);

		if(Policy_Type.equals("Group Personal Accident")||Policy_Type.equals("Individual Personal Accident")){
			//			Select occupation Class
			webDriverWait(ExpectedConditions.elementToBeClickable(objects.occupation_Class_Dropdown()));
			selectByVisibleText(objects.occupation_Class_Dropdown(), Occupation_Class);
		}

		webDriverWait(ExpectedConditions.elementToBeClickable(objects.save_and_Close_Button()));
		objects.save_and_Close_Button().click();

		
		//		Calculate Premium
		webDriverWait(ExpectedConditions.elementToBeClickable(objects.calculate_Premium_Button()));
		scrollDownJavaSc(objects.calculate_Premium_Button());
		objects.calculate_Premium_Button().click();

		webDriverWait(ExpectedConditions.elementToBeClickable(objects.yes_Button()));
		objects.yes_Button().click();

		if (Policy_Type.equals("ndividual Medical")) {
			Thread.sleep(2000);
			//			Click Back Button
			webDriverWait(ExpectedConditions.elementToBeClickable(object.back_Button()));
			scrollDownJavaSc(object.back_Button());
			object.back_Button().click();

			//			Delete plan
			webDriverWait(ExpectedConditions.elementToBeClickable(object.delete_Plan()));
			scrollDownJavaSc(object.delete_Plan());
			javaScribtClick(object.delete_Plan());
			//			Click yes Button
			webDriverWait(ExpectedConditions.elementToBeClickable(object.delete_Yes_Button()));
			object.delete_Yes_Button().click();
			Thread.sleep(1000);
			//			Click proceed
			webDriverWait(ExpectedConditions.elementToBeClickable(object.proceed_Button()));
			scrollDownJavaSc(object.proceed_Button());
			object.proceed_Button().click();

			//			Calculate Premium
			webDriverWait(ExpectedConditions.elementToBeClickable(objects.calculate_Premium_Button()));
			objects.calculate_Premium_Button().click();

			webDriverWait(ExpectedConditions.elementToBeClickable(objects.yes_Button()));
			objects.yes_Button().click();
		}


		if (Loadings.equals("Yes")) {
			Thread.sleep(2000);
			//			Click Loading Arrow Button
			webDriverWait(ExpectedConditions.elementToBeClickable(object.loading_Arrow_Button()));
			object.loading_Arrow_Button().click();

			//			Click Add Button
			webDriverWait(ExpectedConditions.elementToBeClickable(object.add_Loading_Button()));
			object.add_Loading_Button().click();

			//			Select Applicable Premium
			webDriverWait(ExpectedConditions.elementToBeClickable(object.applicable_Premium_Dropdown()));
			selectByVisibleText(object.applicable_Premium_Dropdown(), Applicable_Premium);

			//			Select Loading Type
			webDriverWait(ExpectedConditions.elementToBeClickable(object.loading_Type_Dropdown()));
			selectByVisibleText(object.loading_Type_Dropdown(), Loading_Type);
			//			Click Loading Check box
			webDriverWait(ExpectedConditions.elementToBeClickable(object.loading_Checkbox()));
			object.loading_Checkbox().click();

			//			Enter Loading Rate
			webDriverWait(ExpectedConditions.elementToBeClickable(object.loading_Rate_Field()));
			object.loading_Rate_Field().click();
			doubleClick(object.loading_Rate_Field());
			keyPress(KeyEvent.VK_BACK_SPACE);
			keyRelease(KeyEvent.VK_BACK_SPACE);
			object.loading_Rate_Field().sendKeys(Loading_Rate,Keys.TAB);

			//			Save Loading
			webDriverWait(ExpectedConditions.elementToBeClickable(object.save_Loadings_Button()));
			object.save_Loadings_Button().click();

			webDriverWait(ExpectedConditions.visibilityOf(object.get_loading_Amount()));
			String loading_Amount = object.get_loading_Amount().getText();
			System.out.println("Loading Amount is: "+loading_Amount);

			//			Calculate Premium
			webDriverWait(ExpectedConditions.elementToBeClickable(objects.calculate_Premium_Button()));
			objects.calculate_Premium_Button().click();

			webDriverWait(ExpectedConditions.elementToBeClickable(objects.yes_Button()));
			objects.yes_Button().click();
		} else {
			System.out.println("Loading is Not Applicable");
		}





		Thread.sleep(2000);
		webDriverWait(ExpectedConditions.elementToBeClickable(objects.proceed_Button()));
		Thread.sleep(1000);
		webDriverWait(ExpectedConditions.visibilityOf(objects.get_Premium_Amount()));
		String premium_amount = objects.get_Premium_Amount().getText();
		System.out.println("Premium Amount is: "+premium_amount);

		scrollDownJavaSc(objects.proceed_Button());
		webDriverWait(ExpectedConditions.elementToBeClickable(objects.proceed_Button()));
		objects.proceed_Button().click();

		Additional_Info_Page obje = new Additional_Info_Page();
		Thread.sleep(2000);

		if (Charges.equals("Yes")) {
			webDriverWait(ExpectedConditions.elementToBeClickable(obje.discount_Dropdown()));
			javaScribtClick(obje.discount_Dropdown());
			//obje.discount_Dropdown().click();
			Thread.sleep(1000);
			//			Add Discount
			webDriverWait(ExpectedConditions.elementToBeClickable(obje.add_Discount_Button()));
			//obje.add_Discount_Button().click();
			javaScribtClick(obje.add_Discount_Button());
			//			Select Discount and Loading Type
			webDriverWait(ExpectedConditions.visibilityOf(obje.discount_Loading_Dropdown()));
			selectByVisibleText(obje.discount_Loading_Dropdown(), Charges_Type);

			//			Click check box
			webDriverWait(ExpectedConditions.visibilityOf(obje.discount_Loading_Checkbox()));
			obje.discount_Loading_Checkbox().click();


			//			enter Premium
			webDriverWait(ExpectedConditions.visibilityOf(obje.premium_Field()));
			obje.premium_Field().click();
			doubleClick(obje.premium_Field());
			keyPress(KeyEvent.VK_BACK_SPACE);
			keyRelease(KeyEvent.VK_BACK_SPACE);
			obje.premium_Field().sendKeys(Charges_Value);
			webDriverWait(ExpectedConditions.elementToBeClickable(obje.save_Button()));
			obje.save_Button().click();

			//			Get Charge Amount
			webDriverWait(ExpectedConditions.visibilityOf(obje.get_Charge_Amount_Value()));
			String charge_Amount = obje.get_Charge_Amount_Value().getText();
			System.out.println("Charge Amount is: "+charge_Amount);

			if (charge_Amount.contains(Charges_Value)) {
				Assert.assertEquals(charge_Amount, Charges_Value);
			} else {
				Assert.fail();
			}
		} else {

		}
		Thread.sleep(2000);
		webDriverWait(ExpectedConditions.elementToBeClickable(obje.proceed_Button()));
		Thread.sleep(1000);
		scrollDownJavaSc(obje.proceed_Button());
		obje.proceed_Button().click();

		Summary_Page objectRef = new Summary_Page();

		//		Plan Verification
		Thread.sleep(4000);
		scrollUpJavaSc(objectRef.get_Plan());
		webDriverWait(ExpectedConditions.visibilityOf(objectRef.get_Plan()));
		String plan_Type = objectRef.get_Plan().getText();
		System.out.println("Plan Type is: "+plan_Type);
		if (plan_Type.contains(Plan)) {

			Assert.assertEquals(plan_Type, Plan);
			System.out.println("Plan Type Verification Passed");
		} else {
			Assert.fail();
			System.out.println("Plan Type Verification Failed");
		}

		//		get Sub Plan
		webDriverWait(ExpectedConditions.visibilityOf(objectRef.get_Sub_Plan()));
		String sub_Plan_Type = objectRef.get_Sub_Plan().getText();

		//		Sub Plan Verification
		if (sub_Plan_Type.contains(Sub_Plan)) {
			Assert.assertEquals(sub_Plan_Type, Sub_Plan);
			System.out.println("Sub Plan Verification Passed");
		} else {
			Assert.fail();
			System.out.println("Sub Plan Verification Failed");
		}

		if (Policy_Type.equals("Group Medical")||Policy_Type.equals("Individual Medical")) {
			//			Get Limit Amount
			webDriverWait(ExpectedConditions.visibilityOf(objectRef.get_Limit_Amount_FC()));
			String Limit_Amount = objectRef.get_Limit_Amount_FC().getText();

			//		Limit Amount Verification
			if (Limit_Amount.contains(Limit_Amount_FC)) {
				Assert.assertEquals(Limit_Amount, Limit_Amount_FC);
				System.out.println("Limit Amount Verification Passed");

			} else {

				Assert.fail();
				System.out.println("Limit Amount Verification Failed");
			}


			//		Get Limit Basis
			webDriverWait(ExpectedConditions.visibilityOf(objectRef.get_Limit_Basis()));
			String limit_Basis = objectRef.get_Limit_Basis().getText();

			//		Limit Basis Verification
			if (limit_Basis.contains(Limit_Basis)) {

				Assert.assertEquals(limit_Basis, Limit_Basis);
				System.out.println("Limit Basis Verification Passed");
			} else {
				Assert.fail();
				System.out.println("Limit Basis Verification Failed");
			}

			//		Get Premium Rate Basis
			webDriverWait(ExpectedConditions.visibilityOf(objectRef.get_Premium_Rate_Basis()));
			String premium_Rate_Basic = objectRef.get_Premium_Rate_Basis().getText();
			//		Premium Rate Basis Veification
			if (premium_Rate_Basic.contains(Premium_Rate_Basis)) {

				Assert.assertEquals(premium_Rate_Basic, Premium_Rate_Basis);
				System.out.println("Premium Rate Basis Verification Passed");
			} else {

				Assert.fail();
				System.out.println("Premium Rate Basis Verification Failed");

			}

			//		Get APPL Network
			webDriverWait(ExpectedConditions.visibilityOf(objectRef.get_Appl_Network()));
			String ApplNetwork = objectRef.get_Appl_Network().getText();

			//		APPL Network Verification 
			if (ApplNetwork.contains(Appl_Network)) {
				Assert.assertEquals(ApplNetwork, Appl_Network);
				System.out.println("Appl Network Verification Passed");
			} else {
				Assert.fail();
				System.out.println("Appl Network Verification Failed");
			}

			//		Get Scope of Cover
			webDriverWait(ExpectedConditions.visibilityOf(objectRef.get_Scope_of_Cover()));
			String scope_of_Cover = objectRef.get_Scope_of_Cover().getText();
			System.out.println("Scope of Cover is: "+scope_of_Cover);
			//		Scope of Cover Verification

			String Scope_of_Cover_type =objectRef.get_Scope_of_Cover().getText();
			System.out.println(Scope_of_Cover_type);

			if (Scope_of_Cover_type.contains(Scope_of_Cover)) {

				Assert.assertEquals(Scope_of_Cover_type, Scope_of_Cover);
				System.out.println("Scope of Cover Verification Passed");

			} else {
				Assert.fail();
				System.out.println("Scope of Cover Verification Failed");
			}

			//		Get Emergency Cover
			webDriverWait(ExpectedConditions.visibilityOf(objectRef.get_Emergency()));
			String emergency_Cover = objectRef.get_Emergency().getText();

			if (emergency_Cover.contains(Emergency_Cover)) {
				Assert.assertEquals(emergency_Cover, Emergency_Cover);
				System.out.println("Emergency Cover Verification Passed");
			} else {
				Assert.fail();
				System.out.println("Emergency Cover Verification Failed");
			}

			//		get Emergency Cover Days
			webDriverWait(ExpectedConditions.visibilityOf(objectRef.get_Emergency_Cover_Days()));
			String emergency_Cover_Days = objectRef.get_Emergency_Cover_Days().getText();
			//		Emergency Cover Days Verification
			if (emergency_Cover_Days.contains(Emergency_Cover_Days)) {
				Assert.assertEquals(emergency_Cover_Days, Emergency_Cover_Days);
				System.out.println("Emergency Cover Days Verification Passed");
			} else {
				Assert.fail();
				System.out.println("Emergency Cover Days Verification Failed");
			}
		}



		//		Get Gross Premium
		webDriverWait(ExpectedConditions.visibilityOf(objectRef.get_Gross_Premium()));
		String gross_Premium = objectRef.get_Gross_Premium().getText();
		System.out.println("Gross Premium Amount is: "+gross_Premium);

		//		Get Net Premium
		webDriverWait(ExpectedConditions.visibilityOf(objectRef.get_Net_Premium()));
		String net_Premium = objectRef.get_Net_Premium().getText();
		System.out.println("Net Premium Amount is: "+net_Premium);

		//		Finalize quote
		webDriverWait(ExpectedConditions.elementToBeClickable(objectRef.finalize_Quote_Button()));
		objectRef.finalize_Quote_Button().click();

		//		Get Quote Number
		webDriverWait(ExpectedConditions.visibilityOf(objectRef.get_Quote_Number()));
		String quoteNumber = objectRef.get_Quote_Number().getText();
		System.out.println("Quote Number is: "+quoteNumber);

		//		Customer Name Verification
		webDriverWait(ExpectedConditions.visibilityOf(objectRef.get_Customer()));
		String customer = objectRef.get_Customer().getText();

		if (customer.contains(Insured_Name)) {

			Assert.assertEquals(customer, Insured_Name);
			System.out.println("Customer Name Verification Passed");
		} else {
			Assert.fail();
			System.out.println("Customer Verification Failed");
		}

		//		Select Mode of Pay
		webDriverWait(ExpectedConditions.elementToBeClickable(objectRef.mode_of_pay_Dropdown()));
		selectByVisibleText(objectRef.mode_of_pay_Dropdown(), Mode_of_Pay);

		//		Select Insured Billing Account
		webDriverWait(ExpectedConditions.elementToBeClickable(objectRef.insured_Billing_Account_Dropdown()));
		selectByValue(objectRef.insured_Billing_Account_Dropdown(), Insured_Billing_Account);

		//		Approve Policy
		webDriverWait(ExpectedConditions.elementToBeClickable(objectRef.Approve_Policy_Button()));
		objectRef.Approve_Policy_Button().click();

		//		Get Policy Number
		webDriverWait(ExpectedConditions.visibilityOf(objectRef.get_policy_Number()));
		String Policy_Number = objectRef.get_policy_Number().getText();
		System.out.println("Policy Number is: "+Policy_Number);
		
		
		update_Status("Issue_Policy_Reg", "Policy_Number", Policy_Number, S_No);
		update_Status("Issue_Policy_Reg", "Status", "Pass", S_No);




	}

}
