package org.pages;

import org.common.BasicFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Endorsement_Information_Page extends BasicFunctions{
	
	public Endorsement_Information_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(xpath="//div[contains(text(),'Endorsement Type')]//following-sibling::div[1]")})
	WebElement get_Endorsement_Type;
	
	public WebElement get_Endorsement_Type() {
		return get_Endorsement_Type;
	}
	
	@FindAll({@FindBy(xpath="(//span[@id='assured_span'])[1]"),@FindBy(xpath="(//span[@class='input-group-addon'])[1]")})
	WebElement assured_Edit_Button;
	
	public WebElement assured_Edit_Button() {
		return assured_Edit_Button;
	}
	
	@FindAll({@FindBy(xpath="//label[@class='error']")})
	WebElement error_Msg;
	
	public WebElement error_Msg() {
		return error_Msg;
	}
	
	@FindAll({@FindBy(xpath="(//td[contains(text(),'Broker Commission')]//following-sibling::td[1])[1]")})
	WebElement broker_Commission_Amount;
	
	public WebElement broker_Commission_Amount() {
		return broker_Commission_Amount;
	}
	
	@FindAll({@FindBy(xpath="//input[@name='insured.insMobileNo']"),@FindBy(xpath="//input[@id='form_assured_insured_insMobileNo']")})
	WebElement mobile_Number_Field;
	
	public WebElement mobile_Number_Field() {
		return mobile_Number_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='txt_insEmail1']"),@FindBy(xpath="//input[@name='insured.insEmail1']")})
	WebElement email_Field;
	
	public WebElement email_Field() {
		return email_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@name='insured.insPoBox']"),@FindBy(xpath="//input[@id='txt_insPoBox']")})
	WebElement po_Box_Field;
	
	public WebElement po_Box_Field() {
		return po_Box_Field;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='country']"),@FindBy(xpath="//select[@name='insured.insCountry']")})
	WebElement country_Dropdown;// State Of Qatar
	
	public WebElement country_Dropdown() {
		return country_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@name='insured.insCity']"),@FindBy(xpath="//select[@id='city']")})
	WebElement city_Dropdown;
	
	public WebElement city_Dropdown() {
		return city_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='region']"),@FindBy(xpath="//select[@name='insured.insRegion']")})
	WebElement region_Dropdown;
	
	public WebElement region_Dropdown() {
		return region_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@name='insured.insArea']"),@FindBy(xpath="//select[@id='area']")})
	WebElement area_Dropdown;
	
	public WebElement area_Dropdown() {
		return area_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//button[text()=' Save & Close']")})
	WebElement save_and_Close_Button;
	
	public WebElement save_and_Close_Button() {
		return save_and_Close_Button;
	}
	
	@FindAll({@FindBy(xpath="//textarea[@id='txnRemarks']"),@FindBy(xpath="//textarea[@name='quoteInfo.txnRemarks']")})
	WebElement remarks_Field;
	
	public WebElement remarks_Field() {
		return remarks_Field;
	}
	
	@FindAll({@FindBy(xpath="//button[contains(text(),'Proceed')]"),@FindBy(xpath="//button[@id='btn_proceed']")})
	WebElement proceed_Button;
	
	public WebElement proceed_Button() {
		return proceed_Button;
	}
	
	@FindAll({@FindBy(xpath="//button[@id='btn_approveNonFinanceEndt']")})
	WebElement approve_Endorsement;
	
	public WebElement approve_Endorsement() {
		return approve_Endorsement;
	}
	
	@FindAll({@FindBy(xpath="//div[contains(text(),'Policy No')]//following-sibling::div[1]")})
	WebElement get_Policy_Number;
	
	public WebElement get_Policy_Number() {
		return get_Policy_Number;
	}
	
	@FindBy(xpath="//button[@id='btn_approveclose']")
	WebElement close_Button;
	
	public WebElement close_Button() {
		return close_Button;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='tbl_plan']//tbody[1]//tr[1]//td[12]"),@FindBy(xpath="(//tbody)[2]//tr[1]//td[12]")})
	WebElement get_Premium_Amount;
	
	public WebElement get_Premium_Amount() {
		return get_Premium_Amount;
	}

	@FindAll({@FindBy(xpath="//button[@id='btn_approveEndt']"),@FindBy(xpath="")})
	WebElement approve_Endorsement_Button;
	
	public WebElement approve_Endorsement_Button() {
		return approve_Endorsement_Button;
	}
	
	@FindAll({@FindBy(xpath="//button[@id='btn_calculate']"),@FindBy(xpath="//button[@onclick='showCalculatePremium();']")})
	WebElement calculate_Premium_Button;
	
	public WebElement calculate_Premium_Button() {
		return calculate_Premium_Button;
	}
	@FindBy(xpath="//table[@id='tbl_medBenefit']//tbody//tr[1]//td[13]")
	WebElement get_Premium_FC;
	public WebElement get_Premium_FC() {
		return get_Premium_FC;
	}
	@FindAll({@FindBy(xpath="(//button[@id='btn_confirm_Yes'])[1]")})
	WebElement yes_Button;
	
	public WebElement yes_Button() {
		return yes_Button;
	}
	
	@FindAll({@FindBy(xpath="//td[contains(text(),'Basic')]//following-sibling::td[10]")})
	WebElement get_Calculated_Premium_Amount;
	
	public WebElement get_Calculated_Premium_Amount() {
		return get_Calculated_Premium_Amount;
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
	
	@FindAll({@FindBy(xpath="//button[@id='btn_back']"),@FindBy(xpath="//button[contains(text(),'Back')]")})
	WebElement back_Button;
	
	public WebElement back_Button() {
		return back_Button;
	}
	
	@FindAll({@FindBy(xpath="//ul[@class='errorMessage']//span[1]"),@FindBy(xpath="//div[@id='AddlInfoErrorDiv']//ul//span[1]")})
	WebElement Approval_error_Message;
	
	public WebElement Approval_error_Message() {
		return Approval_error_Message;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='tbl_medBenefit']//tbody//tr[1]//td[16]//button[1]"),@FindBy(xpath="(//td[text()='Basic'])[1]//following-sibling::td[15]//button[1]")})
	WebElement Basic_Cover_Plan_Edit_Button;
	public WebElement Basic_Cover_Plan_Edit_Button() {
		return Basic_Cover_Plan_Edit_Button;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='txt_qmbPremFc']"),@FindBy(xpath="//input[@name='medBenInfo.qmbPremFc']")})
	WebElement premium_Field;
	public WebElement premium_Field() {
		return premium_Field;
	}
	
	@FindAll({@FindBy(xpath="//button[contains(text(),'Update & Close')]"),@FindBy(xpath="(//button[@class='btn btn-greensea btn-sm'])[4]")})
	WebElement update_and_Close_Button;
	
	public WebElement update_and_Close_Button() {
		return update_and_Close_Button;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='tbl_medBenefit']//tbody//tr[1]//td[12]"),@FindBy(xpath="(//td[text()='Basic'])[1]//following-sibling::td[11]")})
	WebElement getPremium;
	
	public WebElement getPremium() {
		return getPremium;
	}
	
	@FindAll({@FindBy(xpath="//button[@id='plan_add']")})
	WebElement add_Plan_Button;
	public WebElement add_Plan_Button() {
		return add_Plan_Button;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='qpgCatg']"),@FindBy(xpath="//select[@name='polCatg.id.qpgCatg']")})
	WebElement plan_Dropdown;
	
	public WebElement plan_Dropdown() {
		return plan_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='sel_qpgSubCatg']"),@FindBy(xpath="//select[@name='polCatg.id.qpgSubCatg']")})
	WebElement sub_Plan_Dropdown;
	
	public WebElement sub_Plan_Dropdown() {
		return sub_Plan_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='txt_qpgSaFc']"),@FindBy(xpath="//input[@name='polCatg.qpgSaFc']")})
	WebElement limit_Amount_FC_Field;
	
	public WebElement limit_Amount_FC_Field() {
		return limit_Amount_FC_Field;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='limitBasisList']"),@FindBy(xpath="//select[@name='polCatg.qpgLimitBasis']")})
	WebElement limit_Basis_Dropdown;
	
	public WebElement limit_Basis_Dropdown() {
		return limit_Basis_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='premRateBasisList']"),@FindBy(xpath="//select[@name='polCatg.qpgPremBasis']")})
	WebElement premium_Rate_Basis_Dropdown;
	
	public WebElement premium_Rate_Basis_Dropdown() {
		return premium_Rate_Basis_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='applNetworkList']"),@FindBy(xpath="//select[@name='polCatg.qpgApplNtCatg']")})
	WebElement Appl_Network_Dropdown;
	
	public WebElement Appl_Network_Dropdown() {
		return Appl_Network_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='scopeCvrList']"),@FindBy(xpath="//select[@name='polCatg.qpgScope']")})
	WebElement scope_of_Cover_Dropdown;
	
	public WebElement scope_of_Cover_Dropdown() {
		return scope_of_Cover_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@name='polCatg.qpgEmergency']"),@FindBy(xpath="//select[@id='emergencyList']")})
	WebElement emergency_Cover_Dropdown;
	
	public WebElement emergency_Cover_Dropdown() {
		return emergency_Cover_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='qpgEmergencyDays']"),@FindBy(xpath="//input[@name='polCatg.qpgEmergencyDays']")})
	WebElement emergency_Cover_Days_Field;
	public WebElement emergency_Cover_Days_Field() {
		return emergency_Cover_Days_Field;
	}
	
	@FindAll({@FindBy(xpath="//button[@id='btn_save_plan']")})
	WebElement save_Plan_Button;
	
	public WebElement save_Plan_Button() {
		return save_Plan_Button;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='tbl_plan']//tbody[1]//tr[2]")})
	WebElement plan_Details;
	
	public WebElement plan_Details() {
		return plan_Details;
	}
	
	@FindAll({@FindBy(xpath="//button[@id='member_add']")})
	WebElement add_Member_Button;
	
	public WebElement add_Member_Button() {
		return add_Member_Button;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='form_member_riskMedical_id_qrmMemberName']"),@FindBy(xpath="//input[@name='riskMedical.id.qrmMemberName']")})
	WebElement employee_Name_Field;
	public WebElement employee_Name_Field() {
		return employee_Name_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='empNo']"),@FindBy(xpath="//input[@name='riskMedical.id.qrmEmpNo']")})
	WebElement employee_Number_Field;
	
	public WebElement employee_Number_Field() {
		return employee_Number_Field;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='prodSchApplCatgList']"),@FindBy(xpath="//select[@name='riskMedical.id.qrmCatg']")})
	WebElement Plan;
	
	public WebElement Plan() {
		return Plan;
	}
	@FindAll({@FindBy(xpath="//select[@name='riskMedical.id.qrmSubCatg']"),@FindBy(xpath="//select[@id='occupation']")})
	WebElement Sub_Plan;
	
	public WebElement Sub_Plan() {
		return Sub_Plan;
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
	
	@FindAll({@FindBy(xpath="//select[@id='sel_searchType']"),@FindBy(xpath="//select[@name='searchType']")})
	WebElement member_Search_By_Dropdown;
	public WebElement member_Search_By_Dropdown() {
		return member_Search_By_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//input[@name='searchVal']"),@FindBy(xpath="//input[@id='txt_searchVal']")})
	WebElement member_Search_Field;
	
	public WebElement member_Search_Field() {
		return member_Search_Field;
	}
	
	@FindAll({@FindBy(xpath="//button[@id='search_Button_Id']")})
	WebElement member_Search_Button;
	
	public WebElement member_Search_Button() {
		return member_Search_Button;
	}
	
	@FindAll({@FindBy(xpath="//button[@title='Suspend']"),@FindBy(xpath="//table[@id='tbl_member']//tbody[1]//tr[1]//td[13]//button[1]")})
	WebElement suspend_Menu;
	
	public WebElement suspend_Menu() {
		return suspend_Menu;
	}
	
	@FindAll({@FindBy(xpath="//button[@id='btn_suspendMember']"),@FindBy(xpath="(//button[contains(text(),'Suspend')])[1]")})
	WebElement suspend_Button;
	
	public WebElement suspend_Button() {
		return suspend_Button;
	}
	
	@FindAll({@FindBy(xpath="//button[@title='Delete']"),@FindBy(xpath="//table[@id='tbl_member']//tbody[1]//tr[1]//td[13]//button[1]")})
	WebElement delete_Member;
	
	public WebElement delete_Member() {
		return delete_Member;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='tbl_member']//tbody[1]//tr[1]//td[13]//button[1]")})
	WebElement Edit_Member_Details;
	public WebElement Edit_Member_Details() {
		return Edit_Member_Details;
	}
	@FindAll({@FindBy(xpath="//div[@class='alert alert-success']//p")})
	WebElement approval_Msg;
	
	public WebElement approval_Msg() {
		return approval_Msg;
	}
	@FindAll({@FindBy(xpath="//input[@id='OR_CUST_NAME_DISP']"),@FindBy(xpath="(//input[@class='form-control ui-autocomplete-input'])[1]")})
	WebElement customer_Code_Field;
	
	public WebElement customer_Code_Field() {
		return customer_Code_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='txt_qpiInsCodeDisp']"),@FindBy(xpath="//input[@name='aaa']")})
	WebElement assured_Name_Field;
	
	public WebElement assured_Name_Field() {
		return assured_Name_Field;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='sel_busType']"),@FindBy(xpath="//select[@name='quoteInfo.busType']")})
	WebElement Business_Source;
	
	public WebElement Business_Source() {
		return Business_Source;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='txt_qpiAgentIdDisp']")})
	WebElement Broker_name_Field;
	
	public WebElement Broker_name_Field() {
		return Broker_name_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='agentCommPerc']"),@FindBy(xpath="//input[@name='quoteInfo.agentPercent']")})
	WebElement Broker_Commission_Field;
	
	public WebElement Broker_Commission_Field() {
		return Broker_Commission_Field;
	}
	@FindAll({@FindBy(xpath="//input[@id='agentCommFc']"),@FindBy(xpath="//input[@name='quoteInfo.agentCommFc']")})
	WebElement Get_Broker_Commission_Amount;
	
	public WebElement Get_Broker_Commission_Amount() {
		return Get_Broker_Commission_Amount;
	}
	
	@FindBy(xpath="//div[contains(text(),'Policy From Date')]//following-sibling::div[1]")
	WebElement get_Policy_From_Date;
	
	public WebElement get_Policy_From_Date() {
		return get_Policy_From_Date;
	}
	
	
	
	
}
