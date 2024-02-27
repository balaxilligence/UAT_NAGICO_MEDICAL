package org.pages;

import org.common.BasicFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Member_Portal_Claim_Employee_Portal_Approval_Page extends BasicFunctions{
	
	public Member_Portal_Claim_Employee_Portal_Approval_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(xpath="(//span[contains(text(),'Reimbursement Claims')])[1]")})
	WebElement reimbursement_Claims_Menu;
	
	public WebElement reimbursement_Claims_Menu() {
		return reimbursement_Claims_Menu;
	}
	
	@FindAll({@FindBy(xpath="(//span[contains(text(),'Reimbursement Claims')])[1]//following::ul[1]//li[3]//a//span"),@FindBy(xpath="(//span[contains(text(),'Tracking')])[5]")})
	WebElement reimbursement_Tracking_Sub_Menu;
	public WebElement reimbursement_Tracking_Sub_Menu() {
		return reimbursement_Tracking_Sub_Menu;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='form_reimclaim_tracking_searchBy']"),@FindBy(xpath="//select[@name='searchBy']")})
	WebElement Claim_Search_By_Dropdown;
	
	public WebElement Claim_Search_By_Dropdown() {
		return Claim_Search_By_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='searchValues']"),@FindBy(xpath="//input[@name='searchValue']")})
	WebElement Claim_Search_Field;
	
	public WebElement Claim_Search_Field() {
		return Claim_Search_Field;
	}
	
	@FindAll({@FindBy(xpath="//div[contains(text(),'Search By')]//following-sibling::div[3]//a"),@FindBy(xpath="(//a[@data-original-title='Search'])[2]")})
	WebElement Claim_Search_Button;
	
	public WebElement Claim_Search_Button() {
		return Claim_Search_Button;
	}
	

}
