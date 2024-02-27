package org.pages;

import org.common.BasicFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Provider_Portal_Claim_Intimation_Page extends BasicFunctions{
	// M23090006555
	
	public Provider_Portal_Claim_Intimation_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(xpath="//a[contains(text(),'Claims')]"),@FindBy(xpath="//a[@class='claLink']")})
	WebElement claims_Menu;
	
	public WebElement claims_Menu() {
		return claims_Menu;
	}
	
	@FindAll({@FindBy(xpath="//a[@class='clickhere']"),@FindBy(xpath="//a[contains(text(),'Click Here')]")})
	WebElement click_Here_Button;
	
	public WebElement click_Here_Button() {
		return click_Here_Button;
	}
	
	@FindAll({@FindBy(xpath="//select[@name='currency']"),@FindBy(xpath="//select[@id='sel_currency']")})
	WebElement currency_Dropdown;
	
	public WebElement currency_Dropdown() {
		return currency_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='providerRefNo']"),@FindBy(xpath="//input[@name='providerRefNo']")})
	WebElement provider_Ref_No_Field;
	
	public WebElement provider_Ref_No_Field() {
		return provider_Ref_No_Field;
	}
	@FindAll({@FindBy(xpath="//input[@name='providerInimatedGrossAmt']"),@FindBy(xpath="//input[@id='providerInimatedGrossAmt']")})
	WebElement intimated_Gross_Amount;
	
	public WebElement intimated_Gross_Amount() {
		return intimated_Gross_Amount;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='txt_year']"),@FindBy(xpath="//input[@name='year']")})
	WebElement year_Field;
	public WebElement year_Field() {
		return year_Field;
	}
	
	@FindAll({@FindBy(xpath="//select[@name='month']"),@FindBy(xpath="//select[@id='sel_month']")})
	WebElement month_Dropdown;
	
	public WebElement month_Dropdown() {
		return month_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="(//span[@id='browse_btn1'])[1]")})
	WebElement upload_Covering_Letter;
	
	public WebElement upload_Covering_Letter() {
		return upload_Covering_Letter;
	}
	
	@FindAll({@FindBy(xpath="//button[contains(text(),'Create Batch')]"),@FindBy(xpath="(//button[@class='btn btn-greensea btn-sm'])[2]")})
	WebElement create_Batch_Dropdown;
	
	public WebElement create_Batch_Dropdown() {
		return create_Batch_Dropdown;
	}
	
	
	@FindAll({@FindBy(xpath="(//button[contains(text(),'Submit')])[1]")})
	WebElement submit_Button;	
	public WebElement submit_Button() {
		return submit_Button;
	}
	
	@FindAll({@FindBy(xpath="//div[text()='QLM Ref No ']//following-sibling::div[1]")})
	WebElement get_QLM_ref_no;
	
	public WebElement get_QLM_ref_no() {
		return get_QLM_ref_no;
	}
	
	@FindAll({@FindBy(xpath="//div[text()='Status ']//following-sibling::div[1]//span//b")})
	WebElement get_Status;
	
	public WebElement get_Status() {
		return get_Status;
	}
	
	@FindAll({@FindBy(xpath="//div[text()='Year ']//following-sibling::div[1]")})
	WebElement get_Year;
	
	public WebElement get_Year() {
		return get_Year;
	}
	
	@FindAll({@FindBy(xpath="//div[text()='Month ']//following-sibling::div[1]//div[1]")})
	WebElement get_Month;
	
	public WebElement get_Month() {
		return get_Month;
	}
	
	@FindAll({@FindBy(xpath="//button[@title='Add New']"),@FindBy(xpath="")})
	WebElement add_Button;
	
	public WebElement add_Button() {
		return add_Button;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='id_mco_policyNo']"),@FindBy(xpath="//input[@name='claimOS.mcoPolNo']")})
	WebElement policy_Number_Field;
	
	public WebElement policy_Number_Field() {
		return policy_Number_Field;
	}
	@FindAll({@FindBy(xpath="//input[@id='id_mco_clmCnt']"),@FindBy(xpath="//input[@name='claimOS.mcoClmCnt']")})
	WebElement no_of_Claims_Field;
	
	public WebElement no_of_Claims_Field() {
		return no_of_Claims_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='id_mco_gross_amt']"),@FindBy(xpath="//input[@name='claimOS.mcoGrossAmt']")})
	WebElement gross_Amount_Field;
	
	public WebElement gross_Amount_Field() {
		return gross_Amount_Field;
	}
	
	@FindAll({@FindBy(xpath="//button[contains(text(),'Save & Close')]")})
	WebElement save_And_Close_Button;
	
	public WebElement save_And_Close_Button() {
		return save_And_Close_Button;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='claims_os_tbl']//tbody[1]//tr[1]//td[4]")})
	WebElement get_Gross_Amount;
	
	public WebElement get_Gross_Amount() {
		return get_Gross_Amount;
	}
	
	@FindAll({@FindBy(xpath="//td[@id='net_amt_tot']")})
	WebElement get_Net_Amount;
	
	public WebElement get_Net_Amount() {
		return get_Net_Amount;
	}
	
	@FindAll({@FindBy(xpath="//button[contains(text(),'Close & Submit Batch')]")})
	WebElement close_and_Submit_Batch;
	
	public WebElement close_and_Submit_Batch() {
		return close_and_Submit_Batch;
	}
	
	@FindAll({@FindBy(xpath="//h3[contains(text(),'Master Batch')]//strong")})
	WebElement get_Master_Batch_Ref_No;
	
	public WebElement get_Master_Batch_Ref_No() {
		return get_Master_Batch_Ref_No;
	}
	
	@FindBy(xpath="//div[contains(text(),'Net Payable')]//following-sibling::div[1]")
	WebElement get_Net_Payable_Amount;
	
	public WebElement get_Net_Payable_Amount() {
		return get_Net_Payable_Amount;
	}
	@FindAll({@FindBy(xpath="//div[@class='alert alert-success no-hide']")})
	WebElement intimation_Success_Msg;
	
	public WebElement intimation_Success_Msg() {
		return intimation_Success_Msg;
	}
	@FindAll({@FindBy(xpath="(//button[contains(text(),'Close')])[2]")})
	WebElement close_Button;
	
	public WebElement close_Button() {
		return close_Button;
	}
	
	@FindAll({@FindBy(xpath="//button[@class='btn btn-primary dropdown-toggle']//p")})
	WebElement get_Provider_Profile_Name;
	
	public WebElement get_Provider_Profile_Name() {
		return get_Provider_Profile_Name;
	}
	
	@FindAll({@FindBy(xpath="//a[contains(text(),'Logout')]")})
	WebElement logout_Button;
	
	public WebElement logout_Button() {
		return logout_Button;
	}
	
	@FindAll({@FindBy(xpath="(//span[text()='Browse file'])[1]"),@FindBy(xpath="//input[@name='attachment1']")})
	WebElement upload_Appeal_File;
	public WebElement upload_Appeal_File() {
		return upload_Appeal_File;
	}
	@FindAll({@FindBy(xpath="//button[contains(text(),'Upload')]"),@FindBy(xpath="(//button[@class='btn btn-greensea btn-sm'])[1]")})
	WebElement upload_Batch_Button;
	public WebElement upload_Batch_Button() {
		return upload_Batch_Button;
	}
	
	@FindAll({@FindBy(xpath="//h3[contains(text(),'Master Batch')]//strong"),@FindBy(xpath="//strong[@class='text-greensea']")})
	WebElement get_Master_Batch_Number;
	
	public WebElement get_Master_Batch_Number() {
		return get_Master_Batch_Number;
	}

	@FindAll({@FindBy(xpath="(//button[@class='btn btn-warning btn-sm'])[1]"),@FindBy(xpath="//button[contains(text(),'Close')]")})
	WebElement close_Batch_Button;
	
	public WebElement close_Batch_Button() {
		return close_Batch_Button;
	}
	
	@FindAll({@FindBy(xpath="//span[@id='span_passCount']")})
	WebElement MDS_File_Pass_Count;
	
	public WebElement MDS_File_Pass_Count() {
		return MDS_File_Pass_Count;
	}
	
	@FindAll({@FindBy(xpath="//div[contains(text(),'Gross Amount')]//following-sibling::div[1]")})
	WebElement get_MDS_Gross_Amount;
	public WebElement get_MDS_Gross_Amount() {
		return get_MDS_Gross_Amount;
	}
	
	@FindAll({@FindBy(xpath="//div[contains(text(),'Net Payable')]//following-sibling::div[1]")})
	WebElement get_MDS_Net_Payable_Amount;
	
	public WebElement get_MDS_Net_Payable_Amount() {
		return get_MDS_Net_Payable_Amount;
	}
	
	@FindAll({@FindBy(xpath="//td[@id='net_amt_tot']")})
	WebElement net_Total_Amount;
	public WebElement net_Total_Amount() {
		return net_Total_Amount;
	}

}
