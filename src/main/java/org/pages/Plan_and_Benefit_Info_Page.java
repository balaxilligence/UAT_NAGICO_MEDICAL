package org.pages;

import java.util.List;

import org.common.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Plan_and_Benefit_Info_Page extends BaseClass{
	
	public Plan_and_Benefit_Info_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(xpath="//div[contains(text(),'Quote No')]//following-sibling::div[1]//b")})
	WebElement get_Quote_Number;
	
	public WebElement get_Quote_Number() {
		return get_Quote_Number;
	}
	
	@FindAll({@FindBy(xpath="//div[contains(text(),'Type of Policy')]//following-sibling::div[1]")})
	WebElement get_Policy_Type;
	
	public WebElement get_Policy_Type() {
		return get_Policy_Type;
	}
	
	@FindAll({@FindBy(xpath="//div[contains(text(),'Customer')]//following-sibling::div[1]")})
	WebElement get_Customer_Name;
	
	public WebElement get_Customer_Name() {
		return get_Customer_Name;
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
	
	@FindAll({@FindBy(xpath="//input[@id='txt_qpgInAnDedPerYrFc']"),@FindBy(xpath="//input[@name='polCatg.qpgInAnDedPerYrFc']")})
	WebElement indv_Ded_Per_Year_Field;
	public WebElement indv_Ded_Per_Year_Field() {
		return indv_Ded_Per_Year_Field;
	}
	
	@FindAll({@FindBy(xpath="//button[@id='btn_save_plan']")})
	WebElement save_Plan_Button;
	
	public WebElement save_Plan_Button() {
		return save_Plan_Button;
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
	WebElement get_Premium_Amount;
	
	public WebElement get_Premium_Amount() {
		return get_Premium_Amount;
	}
	
	@FindAll({@FindBy(xpath="//button[@class='btn btn-greensea btn-sm pull-right']"),@FindBy(xpath="//button[contains(text(),'Proceed')]")})
	WebElement proceed_Button;
	
	public WebElement proceed_Button() {
		return proceed_Button;
	}
	
	@FindAll({@FindBy(xpath="(//h5[@id='othersInfoGridTitle'])[1]//parent::div//following-sibling::div[3]//i"),@FindBy(xpath="//h5[contains(text(),'Discounts')]//parent::div//following-sibling::div[3]")})
	WebElement loading_Arrow_Button;
	
	public WebElement loading_Arrow_Button() {
		return loading_Arrow_Button;
	}
	
	@FindAll({@FindBy(xpath="//button[@id='btn_emp_others_add']")})
	WebElement add_Loading_Button;
	
	public WebElement add_Loading_Button() {
		return add_Loading_Button;
	}
	
	@FindAll({@FindBy(xpath="//select[@name='applPremimum']"),@FindBy(xpath="//select[@id='appList']")})
	WebElement applicable_Premium_Dropdown;
	
	public WebElement applicable_Premium_Dropdown() {
		return applicable_Premium_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@name='cvrType']"),@FindBy(xpath="//select[@id='cvrType']")})
	WebElement loading_Type_Dropdown;
	
	public WebElement loading_Type_Dropdown() {
		return loading_Type_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="(//input[contains(@name,'cvrCodes')])[1]"),@FindBy(xpath="(//input[contains(@id,'cvrCodes')])[1]")})
	WebElement loading_Checkbox;
	
	public WebElement loading_Checkbox() {
		return loading_Checkbox;
	}
	
	@FindAll({@FindBy(xpath="(//input[contains(@id,'rate')])[1]"),@FindBy(xpath="(//input[contains(@name,'rate')])[1]")})
	WebElement loading_Rate_Field;
	
	public WebElement loading_Rate_Field() {
		return loading_Rate_Field;
	}
	
	@FindAll({@FindBy(xpath="(//input[contains(@id,'premium')])[2]"),@FindBy(xpath="(//input[contains(@name,'premium')])[2]")})
	WebElement get_Loading_Value;
	
	public WebElement get_Loading_Value() {
		return get_Loading_Value;
	}
	
	@FindAll({@FindBy(xpath="//button[@id='save_others']"),@FindBy(xpath="(//button[contains(text(),'Save')])[3]")})
	WebElement save_Loadings_Button;
	
	public WebElement save_Loadings_Button() {
		return save_Loadings_Button;
	}
	
	@FindBy(xpath="//table[@id='empOthersInfoTbl']//tbody//tr[1]//td[4]")
	WebElement get_loading_Amount;
	
	public WebElement get_loading_Amount() {
		return get_loading_Amount;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='tbl_plan']//tbody[1]//tr[2]//td[10]//button[2]"),@FindBy(xpath="(//button[@title='Delete'])[2]")})
	WebElement delete_Plan;
	
	public WebElement delete_Plan() {
		return delete_Plan;
	}
	
	@FindAll({@FindBy(xpath="(//button[@id='btn_confirm_Yes'])[1]")})
	WebElement delete_Yes_Button;
	
	public WebElement delete_Yes_Button() {
		return delete_Yes_Button;
	}
	
	
	@FindAll({@FindBy(xpath="//button[@class='btn btn-greensea btn-sm pull-left']")})
	WebElement back_Button;
	
	public WebElement back_Button() {
		return back_Button;
	}
	
	@FindAll({@FindBy(xpath="//input[contains(@class,'checkboxs1')]"),@FindBy(xpath="//input[contains(@id,'check')]")})
	List<WebElement> sub_Plan_Checkbox;

	public List<WebElement> sub_Plan_Checkbox() {
		return sub_Plan_Checkbox;
	}
	
	@FindAll({@FindBy(xpath="(//input[contains(@class,'checkboxs1')])[1]"),@FindBy(xpath="(//input[contains(@id,'check')])[1]")})
	WebElement sub_Plan_Checkbox_1;

	public WebElement sub_Plan_Checkbox_1() {
		return sub_Plan_Checkbox_1;
	}
	
	@FindAll({@FindBy(xpath="(//input[contains(@class,'checkboxs1')])[2]"),@FindBy(xpath="(//input[contains(@id,'check')])[2]")})
	WebElement sub_Plan_Checkbox_2;

	public WebElement sub_Plan_Checkbox_2() {
		return sub_Plan_Checkbox_2;
	}
	
	@FindAll({@FindBy(xpath="(//input[contains(@class,'checkboxs1')])[3]"),@FindBy(xpath="(//input[contains(@id,'check')])[3]")})
	WebElement sub_Plan_Checkbox_3;

	public WebElement sub_Plan_Checkbox_3() {
		return sub_Plan_Checkbox_3;
	}
	
	@FindAll({@FindBy(xpath="(//input[contains(@class,'checkboxs1')])[4]"),@FindBy(xpath="(//input[contains(@id,'check')])[4]")})
	WebElement sub_Plan_Checkbox_4;

	public WebElement sub_Plan_Checkbox_4() {
		return sub_Plan_Checkbox_4;
	}
	
	@FindAll({@FindBy(xpath="(//input[contains(@class,'checkboxs1')])[5]"),@FindBy(xpath="(//input[contains(@id,'check')])[5]")})
	WebElement sub_Plan_Checkbox_5;

	public WebElement sub_Plan_Checkbox_5() {
		return sub_Plan_Checkbox_5;
	}
	
	@FindAll({@FindBy(xpath="(//button[@id='sub_benefit_add'])[2]"),@FindBy(xpath="//button[contains(text(),'Delete')]")})
	WebElement sub_Benefit_Delete_Button;
	
	public WebElement sub_Benefit_Delete_Button() {
		return sub_Benefit_Delete_Button;
	}
	
	
	@FindAll({@FindBy(xpath="//li[@id='tbl_medSubBenefit_next']//a[1]"),@FindBy(xpath="(//a[text()='Next'])[5]")})
	WebElement next_Button;
	
	public WebElement next_Button() {
		return next_Button;
	}

}
