package org.pages;

import org.common.BasicFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customer_Info_Page extends BasicFunctions{
	
	public Customer_Info_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(xpath="//input[@id='txt_qpiCustCodeDisp']"),@FindBy(xpath="(//div[contains(text(),'Customer')]//following-sibling::div[1]//input)[1]")})
	WebElement customer_Code_Field;
	
	public WebElement customer_Code_Field() {
		return customer_Code_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='txt_qpiInsCodeDisp']"),@FindBy(xpath="(//div[contains(text(),'Assured')]//following-sibling::div[1]//input)[1]")})
	WebElement Assured_Field;
	
	public WebElement Assured_Field() {
		return Assured_Field;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='sel_busType']"),@FindBy(xpath="//select[@name='polInfo.qpiBusType']")})
	WebElement Business_Source_Dropdown;
	
	public WebElement Business_Source_Dropdown() {
		return Business_Source_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@name='polInfo.qpiFlex01']"),@FindBy(xpath="//select[@id='form_customer_polInfo_qpiFlex01']")})
	WebElement nature_of_Business_Dropdown;
	public WebElement nature_of_Business_Dropdown() {
		return nature_of_Business_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='id_prodCode']"),@FindBy(xpath="//select[@name='polInfo.qpiProdCode']")})
	WebElement product_Dropdown;
	
	public WebElement product_Dropdown() {
		return product_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@name='polInfo.qpiSiCurrCode']"),@FindBy(xpath="//select[@id='sel_siCurr']")})
	WebElement Limit_Currency_Dropdown;
	
	public WebElement Limit_Currency_Dropdown() {
		return Limit_Currency_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='sel_premCurr']"),@FindBy(xpath="//select[@name='polInfo.qpiPremCurrCode']")})
	WebElement Customer_Currency_Dropdown;
	
	public WebElement Customer_Currency_Dropdown() {
		return Customer_Currency_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@name='polInfo.qpiAddPremCalType']"),@FindBy(xpath="//select[@id='form_customer_polInfo_qpiAddPremCalType']")})
	WebElement Addition_of_Member_Cal_Type_Dropdown;
	
	public WebElement Addition_of_Member_Cal_Type_Dropdown() {
		return Addition_of_Member_Cal_Type_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='delMemType']"),@FindBy(xpath="//select[@name='polInfo.qpiDelPremCalType']")})
	WebElement deletion_of_Member_Cal_Type_Dropdown;
	
	public WebElement deletion_of_Member_Cal_Type_Dropdown() {
		return deletion_of_Member_Cal_Type_Dropdown;
	}
	@FindAll({@FindBy(xpath="//button[@class='btn btn-greensea btn-sm pull-right']"),@FindBy(xpath="//button[contains(text(),'Proceed')]")})
	WebElement proceed_Button;
	
	public WebElement proceed_Button() {
		return proceed_Button;
	}
	
	@FindAll({@FindBy(xpath="//label[@class='error']")})
	WebElement get_Error_Msg;
	
	public WebElement get_Error_Msg() {
		return get_Error_Msg;
	}
	@FindAll({@FindBy(xpath="//input[@id='ageFm']"),@FindBy(xpath="//input[@name='polInfo.qpiAgeFm']")})
	WebElement Age_From_Field;
	
	public WebElement Age_From_Field() {
		return Age_From_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='ageTo']"),@FindBy(xpath="//input[@name='polInfo.qpiAgeTo']")})
	WebElement Age_To_Field;
	
	public WebElement Age_To_Field() {
		return Age_To_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@name='polInfo.qpiMatAgeFm']"),@FindBy(xpath="//input[@id='matAgeFm']")})
	WebElement maternity_Age_From_Field;
	
	public WebElement maternity_Age_From_Field() {
		return maternity_Age_From_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@name='polInfo.qpiMatAgeTo']"),@FindBy(xpath="//input[@id='matAgeTo']")})
	WebElement maternity_Age_To_Field;
	
	public WebElement maternity_Age_To_Field() {
		return maternity_Age_To_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='vacnAgeFm']"),@FindBy(xpath="//input[@name='polInfo.qpiVacnAgeFm']")})
	WebElement Vaccination_Age_From;
	
	public WebElement Vaccination_Age_From() {
		return Vaccination_Age_From;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='vacnAgeTo']"),@FindBy(xpath="//input[@name='polInfo.qpiVacnAgeTo']")})
	WebElement Vaccination_Age_To;
	
	public WebElement Vaccination_Age_To() {
		return Vaccination_Age_To;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='qpiChildAgeFm']"),@FindBy(xpath="//input[@name='polInfo.qpiChildAgeFm']")})
	WebElement Child_Age_From;
	
	public WebElement Child_Age_From() {
		return Child_Age_From;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='qpiChildAgeTo']"),@FindBy(xpath="//input[@name='polInfo.qpiChildAgeTo']")})
	WebElement Child_Age_To;
	
	public WebElement Child_Age_To() {
		return Child_Age_To;
	}
	// Q2309067709
	@FindAll({@FindBy(xpath="//input[@id='txt_qpiAgentIdDisp']")})
	WebElement Agent_name_Field;
	
	public WebElement Agent_name_Field() {
		return Agent_name_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='txt_qpiBrokerIdDisp']")})
	WebElement Broker_name_Field;
	
	public WebElement Broker_name_Field() {
		return Broker_name_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='txt_qpiAcommPerc']"),@FindBy(xpath="//input[@name='polInfo.qpiAcommPerc']")})
	WebElement Broker_Commission_Field;
	
	public WebElement Broker_Commission_Field() {
		return Broker_Commission_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@name='polInward.qinPremRate']"),@FindBy(xpath="//input[@id='form_customer_polInward_qinPremRate']")})
	WebElement Inward_Premium_Rate;
	
	public WebElement Inward_Premium_Rate() {
		return Inward_Premium_Rate;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='form_customer_polInward_qinCommCode']"),@FindBy(xpath="//select[@name='polInward.qinCommCode']")})
	WebElement commission_Type_Dropdown;
	
	public WebElement commission_Type_Dropdown() {
		return commission_Type_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//input[@name='polInward.qinCommPerc']"),@FindBy(xpath="//input[@id='form_customer_polInward_qinCommPerc']")})
	WebElement commission_Percentage_Field;
	
	public WebElement commission_Percentage_Field() {
		return commission_Percentage_Field;
	}
	
	@FindAll({@FindBy(xpath="//select[@name='polInfo.qpiPremPayMode']"),@FindBy(xpath="//select[@id='qpiPremPayMode']")})
	WebElement premium_Payment_Mode;
	
	public WebElement premium_Payment_Mode() {
		return premium_Payment_Mode;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='qpiPremBenefitYear']"),@FindBy(xpath="//select[@name='polInfo.qpiPremBenefitYear']")})
	WebElement benefit_Year_Dropdown;
	
	public WebElement benefit_Year_Dropdown() {
		return benefit_Year_Dropdown;
	}
	
	
	
}
