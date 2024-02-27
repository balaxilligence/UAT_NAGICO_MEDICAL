package org.pages;

import org.common.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Member_Info_page extends BaseClass{
	
	public Member_Info_page() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(xpath="//button[@id='member_add']")})
	WebElement add_Member_Button;
	
	public WebElement add_Member_Button() {
		return add_Member_Button;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='firstName']"),@FindBy(xpath="//input[@name='riskMedical.id.qrmFirstName']")})
	WebElement employee_First_Name_Field;
	public WebElement employee_First_Name_Field() {
		return employee_First_Name_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='empNo']"),@FindBy(xpath="//input[@name='riskMedical.id.qrmEmpNo']")})
	WebElement employee_Number_Field;
	
	public WebElement employee_Number_Field() {
		return employee_Number_Field;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='prodSchApplCatgList']"),@FindBy(xpath="//select[@name='riskMedical.id.qrmCatg']")})
	WebElement plan_Dropdown;
	
	public WebElement plan_Dropdown() {
		return plan_Dropdown;
	}
	@FindAll({@FindBy(xpath="//select[@name='riskMedical.id.qrmSubCatg']"),@FindBy(xpath="//select[@id='occupation']")})
	WebElement sub_Plan_Dropdown;
	
	public WebElement sub_Plan_Dropdown() {
		return sub_Plan_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='qrmGender']"),@FindBy(xpath="//select[@name='riskMedical.id.qrmGender']")})
	WebElement gender_Dropdown;
	
	public WebElement gender_Dropdown() {
		return gender_Dropdown;
	}
	@FindAll({@FindBy(xpath="//input[@id='civilId']"),@FindBy(xpath="//input[@name='riskMedical.id.qrmCivilId']")})
	WebElement civil_Id_Field;
	
	public WebElement civil_Id_Field() {
		return civil_Id_Field;
	}

	@FindAll({@FindBy(xpath="//input[@name='riskMedical.id.qrmDob']"),@FindBy(xpath="//input[@id='dob']")})
	WebElement DOB_Field;
	public WebElement DOB_Field() {
		return DOB_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='txt_qrmPassportNo']"),@FindBy(xpath="//input[@name='riskMedical.id.qrmPassportNo']")})
	WebElement passport_Number;
	
	public WebElement passport_Number() {
		return passport_Number;
	}
	
	@FindAll({@FindBy(xpath="//select[@name='riskMedical.id.qrmMaritalSts']"),@FindBy(xpath="//select[@id='qrmMaritalSts']")})
	WebElement martial_Status;
	
	public WebElement martial_Status() {
		return martial_Status;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='qrmNationality']"),@FindBy(xpath="//select[@name='riskMedical.id.qrmNationality']")})
	WebElement Nationality_DropDown;
	
	public WebElement Nationality_DropDown() {
		return Nationality_DropDown;
	}
	
	@FindAll({@FindBy(xpath="//select[@name='riskMedical.id.qrmCountry']"),@FindBy(xpath="//select[@id='qrmCountry']")})
	WebElement country_of_Residence;
	
	public WebElement country_of_Residence() {
		return country_of_Residence;
	}
	
	@FindAll({@FindBy(xpath="//button[contains(text(),'Save & Add More')]"),@FindBy(xpath="//button[@id='btn_saveRiskLife1']")})
	WebElement save_And_More_button;
	
	public WebElement save_And_More_button() {
		return save_And_More_button;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='qrmDepYn1']"),@FindBy(xpath="(//input[@name='riskMedical.id.qrmDepYn'])[2]")})
	WebElement dependent_Radio_Button;
	
	public WebElement dependent_Radio_Button() {
		return dependent_Radio_Button;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='qrmParentMemberName']"),@FindBy(xpath="//input[@name='riskMedical.id.qrmParentMemberName']")})
	WebElement principal_Member_Field;
	public WebElement principal_Member_Field() {
		return principal_Member_Field;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='occCodeList']"),@FindBy(xpath="//select[@name='riskMedical.id.qrmDesignation']")})
	WebElement occupation_Class_Dropdown;
	
	public WebElement occupation_Class_Dropdown() {
		return occupation_Class_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='qrmMemRelation']"),@FindBy(xpath="//select[@name='riskMedical.id.qrmMemRelation']")})
	WebElement relation_Dropdown;
	
	public WebElement relation_Dropdown() {
		return relation_Dropdown;
	}
	@FindAll({@FindBy(xpath="//button[@id='btn_saveRiskLife']"),@FindBy(xpath="//button[contains(text(),'Save & Close')]")})
	WebElement save_and_Close_Button;
	public WebElement save_and_Close_Button() {
		return save_and_Close_Button;
	}
	
	@FindAll({@FindBy(xpath="(//button[@class='btn btn-warning btn-sm center'])[2]"),@FindBy(xpath="//button[@onclick='showCalculatePremium();']")})
	WebElement calculate_Premium_Button;
	
	public WebElement calculate_Premium_Button() {
		return calculate_Premium_Button;
	}
	
	@FindAll({@FindBy(xpath="(//button[@id='btn_confirm_Yes'])[1]")})
	WebElement yes_Button;
	
	public WebElement yes_Button() {
		return yes_Button;
	}
	
	@FindAll({@FindBy(xpath="//div[@id='e_form_member']"),@FindBy(xpath="(//div[@class='modal-content'])[3]//following-sibling::div[@class='alert alert-danger']")})
	WebElement Member_Info_Error_Msg;
	public WebElement Member_Info_Error_Msg() {
		return Member_Info_Error_Msg;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='tbl_member']//tbody//tr[1]//td[13]")})
	WebElement get_Premium_Amount;
	
	public WebElement get_Premium_Amount() {
		return get_Premium_Amount;
	}
	@FindAll({@FindBy(xpath="//select[@name='riskMedical.id.qrmFamilyUnit']"),@FindBy(xpath="//select[@id='qrmFamilyUnit']")})
	WebElement family_Unit_Dropdown;
	
	public WebElement family_Unit_Dropdown() {
		return family_Unit_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//button[contains(text(),'Proceed')]"),@FindBy(xpath="//button[contains(text(),'Proceed')]")})
	WebElement proceed_Button;
	
	public WebElement proceed_Button() {
		return proceed_Button;
	}
	
	
}
