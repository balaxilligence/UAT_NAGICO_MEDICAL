package org.pages;

import org.common.BasicFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Endorsement_Page extends BasicFunctions{
	
	public Endorsement_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[contains(text(),'Policy Number')]//following-sibling::div[1]//span")
	WebElement get_Policy_Number;
	
	public WebElement get_Policy_Number() {
		return get_Policy_Number;
	}
	
	@FindAll({@FindBy(xpath="//div[contains(text(),'Insured Name')]//following-sibling::div[1]//span")})
	WebElement get_Insured_Name;
	
	public WebElement get_Insured_Name() {
		return get_Insured_Name;
	}
	@FindAll({@FindBy(xpath="//select[@id='endorsementType']"),@FindBy(xpath="//select[@name='endorsementType']")})
	WebElement endorsement_Type;
	
	public WebElement endorsement_Type() {
		return endorsement_Type;
	}
	
	@FindAll({@FindBy(xpath="//button[@id='btn_submit_endt']"),@FindBy(xpath="//button[contains(text(),'Proceed')]")})
	WebElement proceed_Button;
	
	public WebElement proceed_Button() {
		return proceed_Button;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='endToDate']"),@FindBy(xpath="//input[@name='endToDate']")})
	WebElement effective_To_Date;
	
	public WebElement effective_To_Date() {
		return effective_To_Date;
	}
	
	@FindAll({@FindBy(xpath="//input[@name='endFromDate']"),@FindBy(xpath="//input[@id='endFromDate']")})
	WebElement Endorsement_From_Date;
	
	public WebElement Endorsement_From_Date() {
		return Endorsement_From_Date;
	}
	
	

}
