package org.pages;

import org.common.BasicFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Member_Portal_Claim_Intimation_Page extends BasicFunctions{
	
	public Member_Portal_Claim_Intimation_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(xpath="//span[text()='Policy No']//following::b[1]")})
	WebElement get_Policy_Number;

	public WebElement get_Policy_Number() {
		return get_Policy_Number;
	}
	
	@FindBy(xpath="//span[text()='Member ID']//following::b[1]")
	WebElement get_Member_ID;
	
	public WebElement get_Member_ID() {
		return get_Member_ID;
	}
	
	@FindBy(xpath="//span[text()='Employer Name']//following::b[1]")
	WebElement get_Employee_ID;
	
	public WebElement get_Employee_ID() {
		return get_Employee_ID;
	}
	
	@FindAll({@FindBy(xpath="(//a[@id='clmMenu'])[1]")})
	WebElement claim_Menu;
	
	public WebElement claim_Menu() {
		return claim_Menu;
	}
	@FindAll({@FindBy(xpath="//a[@class='clickhere']"),@FindBy(xpath="//a[text()='Click Here']")})
	WebElement click_Here_Button;
	
	public WebElement click_Here_Button() {
		return click_Here_Button;
	}
	@FindAll({@FindBy(xpath="//select[@id='rchPolNo']"),@FindBy(xpath="//select[@name='reimburseClaim.rchPolTransId']")})
	WebElement policy_Number_Dropdown;
	
	public WebElement policy_Number_Dropdown() {
		return policy_Number_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='rchMemberId']"),@FindBy(xpath="//select[@name='reimburseClaim.rchMemId']")})
	WebElement Employee_Name_Dropdown;
	
	public WebElement Employee_Name_Dropdown() {
		return Employee_Name_Dropdown;
	}
	@FindAll({@FindBy(xpath="//button[text()='Go']"),@FindBy(xpath="//button[@class='mem_dms_btn text-uppercase pull-left']")})
	WebElement go_Button;
	
	public WebElement go_Button() {
		return go_Button;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='id_rchMobileNo']"),@FindBy(xpath="//input[@name='reimburseClaim.rchMobileNo']")})
	WebElement mobile_Number_Field;
	
	public WebElement mobile_Number_Field() {
		return mobile_Number_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@name='reimburseClaim.rchEmailId']"),@FindBy(xpath="//input[@id='reimbursementClaimsForm_reimburseClaim_rchEmailId']")})
	WebElement email_Id_Field;
	
	public WebElement email_Id_Field() {
		return email_Id_Field;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='rcServiceType']"),@FindBy(xpath="//select[@name='reimburseClaim.rchServiceType']")})
	WebElement service_Type_Dropdown;
	
	public WebElement service_Type_Dropdown() {
		return service_Type_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@name='reimburseClaim.rchTreatType']"),@FindBy(xpath="//select[@id='rcTreatType']")})
	WebElement Treatment_Type_Dropdown;
	
	public WebElement Treatment_Type_Dropdown() {
		return Treatment_Type_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='rchTreatCountry']"),@FindBy(xpath="//select[@name='reimburseClaim.rchTreatCountry']")})
	WebElement treatment_Country;
	
	public WebElement treatment_Country() {
		return treatment_Country;
	}
	
	@FindAll({@FindBy(xpath="//select[@name='reimburseClaim.rchCurrency']"),@FindBy(xpath="//select[@id='rcCurrency']")})
	WebElement claim_Currency_Dropdown;
	
	public WebElement claim_Currency_Dropdown() {
		return claim_Currency_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='rcPaymentMethod']"),@FindBy(xpath="//select[@name='reimburseClaim.rchPaymentMethod']")})
	WebElement pay_method_Dropdown;
	
	public WebElement pay_method_Dropdown() {
		return pay_method_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//input[@name='reimburseClaim.rchBankName']"),@FindBy(xpath="//input[@id='rchBankName']")})
	WebElement bank_Name_Field;
	
	public WebElement bank_Name_Field() {
		return bank_Name_Field; 	
	}
	
	@FindAll({@FindBy(xpath="//input[@id='rchBankLoc']"),@FindBy(xpath="//input[@name='reimburseClaim.rchBankLocation']")})
	WebElement bank_Location_Field;
	
	public WebElement bank_Location_Field() {
		return bank_Location_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='rchAccountNo']"),@FindBy(xpath="//input[@name='reimburseClaim.rchAccountNo']")})
	WebElement account_Number_Field;
	
	public WebElement account_Number_Field() {
		return account_Number_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='rchIbanCode']"),@FindBy(xpath="//input[@name='reimburseClaim.rchIbanCode']")})
	WebElement IBAN_Field;
	public WebElement IBAN_Field() {
		return IBAN_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='frm_mem_clm_int_bean_billCount']"),@FindBy(xpath="//input[@name='bean.billCount']")})
	WebElement bill_Count_Field;
	
	public WebElement bill_Count_Field() {
		return bill_Count_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='amount']"),@FindBy(xpath="//input[@name='reimburseClaim.rchIntGrossAmtFc']")})
	WebElement estimate_Amount_Field;
	public WebElement estimate_Amount_Field() {
		return estimate_Amount_Field;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='rcPaymentTo']"),@FindBy(xpath="//select[@name='reimburseClaim.rchPaymentTo']")})
	WebElement payment_To_Dropdown;
	public WebElement payment_To_Dropdown() {
		return payment_To_Dropdown;
	}
	
	@FindBy(xpath="//a[@class='add_btn']")
	WebElement add_invoice_Button;
	
	public WebElement add_invoice_Button() {
		return add_invoice_Button;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='id_miInvDt']"),@FindBy(xpath="//input[@name='reimbClmDetails.rcdInvDt']")})
	WebElement service_Date_Field;
	
	public WebElement service_Date_Field() {
		return service_Date_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='id_miInvNo']"),@FindBy(xpath="//input[@name='reimbClmDetails.rcdInvNo']")})
	WebElement invoice_Number_Field;
	
	public WebElement invoice_Number_Field() {
		return invoice_Number_Field;
	}
	@FindAll({@FindBy(xpath="//input[@name='reimbClmDetails.rcdInvAmtFc']"),@FindBy(xpath="//input[@id='id_miInvAmtFc']")})
	WebElement invoice_Amount_Field;
	
	public WebElement invoice_Amount_Field() {
		return invoice_Amount_Field;
	}
	@FindAll({@FindBy(xpath="//select[@id='id_miInvType']"),@FindBy(xpath="//select[@name='reimbClmDetails.rcdInvType']")})
	WebElement invoice_Type_Dropdown;
	
	public WebElement invoice_Type_Dropdown() {
		return invoice_Type_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//button[contains(text(),'Save & Close')]")})
	WebElement save_and_Close_Button;
	
	public WebElement save_and_Close_Button() {
		return save_and_Close_Button;
	}
	
	@FindBy(xpath="//table[@id='tbl_InvoiceDetails_list']//tbody[1]//tr[1]//td[5]")
	WebElement get_Invoice_Amount;
	
	public WebElement get_Invoice_Amount() {
		return get_Invoice_Amount;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='btn_dub_inv']"),@FindBy(xpath="//input[@name='btn_sub_inv']")})
	WebElement submit_Claim_Button;
	
	public WebElement submit_Claim_Button() {
		return submit_Claim_Button;
	}
	
	@FindBy(xpath="//span[@id='refiD']")
	WebElement get_Ref_Id;
	
	public WebElement get_Ref_Id() {
		return get_Ref_Id;
	}
	
	@FindAll({@FindBy(xpath="//input[@class='save_add_btn invoice_btn']"),@FindBy(xpath="//input[@value='Close']")})
	WebElement close_Button;
	
	public WebElement close_Button() {
		return close_Button;
	}

	@FindAll({@FindBy(xpath="//button[@class='btn btn-primary dropdown-toggle']//p")})
	WebElement get_Member_Profile_Name;
	
	public WebElement get_Member_Profile_Name() {
		return get_Member_Profile_Name;
	}
	@FindAll({@FindBy(xpath="//a[text()='Logout']")})
	WebElement logout_Button;
	
	public WebElement logout_Button() {
		return logout_Button;
	}
}
