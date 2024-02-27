package org.pages;

import org.common.BasicFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Underwriting_Page extends BasicFunctions{
	
	public Underwriting_Page() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(xpath="(//span[contains(text(),'Underwriting')])[1]"),@FindBy(xpath="(//ul[@id='navigation']//li[2]//span)[1]")})
	WebElement underwriting_Menu;
	public WebElement underwriting_Menu() {
		return underwriting_Menu;
	}
	
	@FindAll({@FindBy(xpath="//span[contains(text(),'Group Medical')]")})
	WebElement group_Medical_Menu;

	public WebElement group_Medical_Menu() {
		return group_Medical_Menu;
	}
	
	@FindAll({@FindBy(xpath="//span[contains(text(),'Individual Medical')]")})
	WebElement Individual_Medical_Menu;

	public WebElement Individual_Medical_Menu() {
		return Individual_Medical_Menu;
	}
	
	@FindAll({@FindBy(xpath="//span[text()=' Personal Accident - Group']"),@FindBy(xpath="//span[contains(text(),'Personal Accident - Group')]")})
	WebElement Personal_Accident_Group_Medical_Menu;

	public WebElement Personal_Accident_Group_Medical_Menu() {
		return Personal_Accident_Group_Medical_Menu;
	}
	
	@FindAll({@FindBy(xpath="//span[contains(text(),'Personal Accident - Individual')]"),@FindBy(xpath="//span[text()=' Personal Accident - Individual']")})
	WebElement Personal_Accident_Individual_Medical_Menu;

	public WebElement Personal_Accident_Individual_Medical_Menu() {
		return Personal_Accident_Individual_Medical_Menu;
	}
	
	@FindAll({@FindBy(xpath="//span[text()=' Critical Illness - Group']"),@FindBy(xpath="//span[contains(text(),'Critical Illness - Group')]")})
	WebElement critical_Illness_Group_Menu;
	
	public WebElement critical_Illness_Group_Menu() {
		return critical_Illness_Group_Menu;
	}
	
	
	@FindAll({@FindBy(xpath="//span[contains(text(),'Critical Illness - Individual')]"),@FindBy(xpath="")})
	WebElement critical_illness_Individual_Menu;
	
	public WebElement critical_illness_Individual_Menu() {
		return critical_illness_Individual_Menu;
	}
	
	
	
	
	
}
