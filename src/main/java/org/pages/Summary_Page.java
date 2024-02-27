package org.pages;

import org.common.BasicFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary_Page extends BasicFunctions{
	
	public Summary_Page() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(xpath="//button[@id='btn_finalQuote']")})
	WebElement finalize_Quote_Button;
	
	public WebElement finalize_Quote_Button() {
		return finalize_Quote_Button;
	}
	@FindAll({@FindBy(xpath="//button[@id='btn_approveQuote']")})
	WebElement Approve_Policy_Button;
	
	public WebElement Approve_Policy_Button() {
		return Approve_Policy_Button;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='sel_modeOfpay']"),@FindBy(xpath="//select[@name='modeOfPay']")})
	WebElement mode_of_pay_Dropdown;
	
	public WebElement mode_of_pay_Dropdown() {
		return mode_of_pay_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@name='beanInfo.insBillAcnt']"),@FindBy(xpath="//select[@id='id_insBillAcnt']")})
	WebElement insured_Billing_Account_Dropdown;
	
	public WebElement insured_Billing_Account_Dropdown() {
		return insured_Billing_Account_Dropdown;
	}
	@FindAll({@FindBy(xpath="//div[text()='Policy No']//following-sibling::div[1]")})
	WebElement get_policy_Number;
	
	public WebElement get_policy_Number() {
		return get_policy_Number;
	}
	@FindAll({@FindBy(xpath="//table[@id='occuGrid']//tbody//tr[1]//td[1]")})
	WebElement get_Plan;
	
	public WebElement get_Plan() {
		return get_Plan;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='occuGrid']//tbody//tr[1]//td[2]")})
	WebElement get_Sub_Plan;
	
	public WebElement get_Sub_Plan() {
		return get_Sub_Plan;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='occuGrid']//tbody//tr[1]//td[3]")})
	WebElement get_Limit_Amount_FC;
	
	public WebElement get_Limit_Amount_FC() {
		return get_Limit_Amount_FC;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='occuGrid']//tbody//tr[1]//td[4]")})
	WebElement get_Limit_Basis;
	
	public WebElement get_Limit_Basis() {
		return get_Limit_Basis;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='occuGrid']//tbody//tr[1]//td[5]")})
	WebElement get_Premium_Rate_Basis;
	
	public WebElement get_Premium_Rate_Basis() {
		return get_Premium_Rate_Basis;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='occuGrid']//tbody//tr[1]//td[6]")})
	WebElement get_Appl_Network;
	
	public WebElement get_Appl_Network() {
		return get_Appl_Network;
	}
	@FindAll({@FindBy(xpath="//table[@id='occuGrid']//tbody//tr[1]//td[10]")})
	WebElement get_Emergency;
	
	public WebElement get_Emergency() {
		return get_Emergency;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='occuGrid']//tbody//tr[1]//td[9]")})
	WebElement get_Scope_of_Cover;
	
	public WebElement get_Scope_of_Cover() {
		return get_Scope_of_Cover;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='occuGrid']//tbody//tr[1]//td[11]")})
	WebElement get_Emergency_Cover_Days;
	
	public WebElement get_Emergency_Cover_Days() {
		return get_Emergency_Cover_Days;
	}
	
	@FindAll({@FindBy(xpath="//td[contains(text(),'Gross Premium')]//following-sibling::td[1]")})
	WebElement get_Gross_Premium;
	
	public WebElement get_Gross_Premium() {
		return get_Gross_Premium;
	}
	
	@FindAll({@FindBy(xpath="//th[contains(text(),'Net Premium')]//following-sibling::th[1]")})
	WebElement get_Net_Premium;
	public WebElement get_Net_Premium() {
		return get_Net_Premium;
	}
	
	@FindAll({@FindBy(xpath="(//div[contains(text(),'Quote No')]//following-sibling::div[1])[2]")})
	WebElement get_Quote_Number;
	
	public WebElement get_Quote_Number() {
		return get_Quote_Number;
	}
	
	@FindAll({@FindBy(xpath="(//div[contains(text(),'Customer')]//following-sibling::div[1])[2]")})
	WebElement get_Customer;
	
	public WebElement get_Customer() {
		return get_Customer;
	}
	
	@FindAll({@FindBy(xpath="(//table[@class='table table-custom table-bordered'])[2]//tbody//tr[13]//td[2]")})
	WebElement get_Inward_Commission_Type;
	
	public WebElement get_Inward_Commission_Type() {
		return get_Inward_Commission_Type;
	}
	@FindAll({@FindBy(xpath="(//table[@class='table table-custom table-bordered'])[2]//tbody//tr[3]//td[2]")})
	WebElement get_Discount_Amount;
	
	public WebElement get_Discount_Amount() {
		return get_Discount_Amount;
	}
	
	@FindAll({@FindBy(xpath="(//table[@class='table table-custom table-bordered'])[2]//tbody//tr[4]//td[2]")})
	WebElement get_Loading_Amount;
	
	public WebElement get_Loading_Amount() {
		return get_Loading_Amount;
	}
	
	@FindAll({@FindBy(xpath="(//table[@class='table table-custom table-bordered'])[2]//tbody//tr[5]//td[2]")})
	WebElement get_Charge_Amount;
	
	public WebElement get_Charge_Amount() {
		return get_Charge_Amount;
	}
	@FindAll({@FindBy(xpath="//input[@id='id_apprDate']"),@FindBy(xpath="//input[@name='apprDate']")})
	WebElement policy_Approval_Date;
	
	public WebElement policy_Approval_Date() {
		return policy_Approval_Date;
	}
	
	@FindAll({@FindBy(xpath="(//button[contains(text(),'Save')])[1]")})
	WebElement save_Button;
	
	public WebElement save_Button() {
		return save_Button;
	}
	
	
//	Approval request sent to 'Jessa Odevilas'. Workflow Reference No 80976-
//	(//a[@class='dropdown-toggle'])[1]
	
//	
}
