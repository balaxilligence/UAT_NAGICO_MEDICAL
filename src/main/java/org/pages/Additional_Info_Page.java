package org.pages;

import org.common.BasicFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Additional_Info_Page extends BasicFunctions{

	public Additional_Info_Page() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(xpath="//strong[contains(text(),'Treatment Exclusions')]//parent::h5//parent::div//following-sibling::div[3]//i")})
	WebElement treatment_Exclusion_Dropdown;
	
	public WebElement treatment_Exclusion_Dropdown() {
		return treatment_Exclusion_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//div[@id='btn_others_add_TRT']//button[2]"),@FindBy(xpath="(//button[contains(text(),'Add')])[1]")})
	WebElement add_Button;
	
	public WebElement add_Button() {
		return add_Button;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='id_qpcPlan']"),@FindBy(xpath="//select[@name='polCondition.id.qpcPlan']")})
	WebElement plan_Dropdown;
	
	public WebElement plan_Dropdown() {
		return plan_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@name='polCondition.id.qpcSplan']"),@FindBy(xpath="//select[@id='id_qpcSplan']")})
	WebElement sub_Plan_Dropdown;
	
	public WebElement sub_Plan_Dropdown() {
		return sub_Plan_Dropdown;
	}
	
//	
	
	@FindAll({@FindBy(xpath="//select[@id='id_qpcBenefit']"),@FindBy(xpath="//select[@name='polCondition.id.qpcBenefit']")})
	WebElement benefit_Dropdown;
	
	public WebElement benefit_Dropdown() {
		return benefit_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='id_qpcSubBenefit']"),@FindBy(xpath="//select[@name='polCondition.id.qpcSubBenefit']")})
	WebElement sub_Benefit_Dropdown;
	
	public WebElement sub_Benefit_Dropdown() {
		return sub_Benefit_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='txt_searchText']")})
	WebElement search_Field;
	
	public WebElement search_Field() {
		return search_Field;
	}
	@FindAll({@FindBy(xpath="//input[@id='txt_searchText']//following::div[1]//button"),@FindBy(xpath="(//button[@class='btn btn-greensea btn-sm pull-right'])[7]")})
	WebElement search_button;
	
	public WebElement search_button() {
		return search_button;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='id_0']"),@FindBy(xpath="(//input[@type='checkbox'])[1]")})
	WebElement Exclusion_Checkbox;
	
	public WebElement Exclusion_Checkbox() {
		return Exclusion_Checkbox;
	}
	
	@FindAll({@FindBy(xpath="//button[@class='btn btn-greensea btn-sm mr-10']")})
	WebElement save_and_Close_Button;
	public WebElement save_and_Close_Button() {
		return save_and_Close_Button;
	}
	
	
	@FindAll({@FindBy(xpath="//strong[contains(text(),'Diagnosis Exclusions')]//parent::h5//parent::div//following-sibling::div[3]//i"),@FindBy(xpath="(//i[@class='fa fa-arrow-circle-down'])[1]")})
	WebElement diagnosis_Exclusion_Dropdown;
	
	public WebElement diagnosis_Exclusion_Dropdown() {
		return diagnosis_Exclusion_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//div[@id='btn_others_add_DIG']//button[2]"),@FindBy(xpath="(//button[contains(text(),'Add')])[2]")})
	WebElement add_Diagnosis_Button;
	
	public WebElement add_Diagnosis_Button() {
		return add_Diagnosis_Button;
	}
	
	@FindAll({@FindBy(xpath="//strong[contains(text(),'Drug Exclusions')]//parent::h5//parent::div//following-sibling::div[3]//i"),@FindBy(xpath="(//i[@class='fa fa-arrow-circle-down'])[1]")})
	WebElement drug_Exclusion_Dropdown;
	
	public WebElement drug_Exclusion_Dropdown() {
		return drug_Exclusion_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//div[@id='btn_others_add_DRG']//button[2]"),@FindBy(xpath="(//button[contains(text(),'Add')])[3]")})
	WebElement add_Drug_Exclusion_Button;
	
	public WebElement add_Drug_Exclusion_Button() {
		return add_Drug_Exclusion_Button;
	}
	
	@FindAll({@FindBy(xpath="//h5[contains(text(),'Discount')]//parent::div//following-sibling::div[3]//i"),@FindBy(xpath="(//i[@class='fa fa-arrow-circle-down'])[4]")})
	WebElement discount_Dropdown;
	
	public WebElement discount_Dropdown() {
		return discount_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//button[@id='btn_others_add']")})
	WebElement add_Discount_Button;
	
	public WebElement add_Discount_Button() {
		return add_Discount_Button;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='cvrType']"),@FindBy(xpath="//select[@name='cvrType']")})
	WebElement discount_Loading_Dropdown;
	
	public WebElement discount_Loading_Dropdown() {
		return discount_Loading_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="(//input[contains(@id,'cvrCodes')])[1]"),@FindBy(xpath="(//input[contains(@name,'cvrCodes')])[1]")})
	WebElement discount_Loading_Checkbox;
	
	public WebElement discount_Loading_Checkbox() {
		return discount_Loading_Checkbox;
	}
	
	@FindAll({@FindBy(xpath="(//input[contains(@id,'rate')])[1]"),@FindBy(xpath="(//input[contains(@name,'rate')])[1]")})
	WebElement rate_Field;
	
	public WebElement rate_Field() {
		return rate_Field;
	}
	
	@FindAll({@FindBy(xpath="(//input[contains(@id,'premium')])[2]"),@FindBy(xpath="(//input[contains(@name,'premium')])[2]")})
	WebElement premium_Field;
	
	public WebElement premium_Field() {
		return premium_Field;
	}
	@FindAll({@FindBy(xpath="//button[@id='save_others']")})
	WebElement save_Button;
	
	public WebElement save_Button() {
		return save_Button;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='othersInfoTbl']//tbody[1]//tr[1]//td[4]")})
	WebElement get_Charge_Amount_Value;
	
	public WebElement get_Charge_Amount_Value() {
		return get_Charge_Amount_Value;
	}
	
	@FindAll({@FindBy(xpath="//button[contains(text(),'Proceed')]"),@FindBy(xpath="//button[contains(text(),'Proceed')]")})
	WebElement proceed_Button;
	
	public WebElement proceed_Button() {
		return proceed_Button;
	}
	
	@FindAll({@FindBy(xpath="(//div[@id='agentInfo']//following-sibling::div)[7]")})
	WebElement get_Commission_Percentage;
	public WebElement get_Commission_Percentage() {
		return get_Commission_Percentage;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='inwCommFc']"),@FindBy(xpath="//input[@name='lifeInfoBean.inwCommFc']")})
	WebElement get_Commission_Amount;
	
	public WebElement get_Commission_Amount() {
		return get_Commission_Amount;
	}
	
	
	// Q2309067684
}
