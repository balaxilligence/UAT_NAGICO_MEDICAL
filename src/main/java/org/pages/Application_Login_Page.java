package org.pages;

import org.common.BasicFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Application_Login_Page extends BasicFunctions{
	
	public Application_Login_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(xpath="//a[@id='emp_tab']"),@FindBy(xpath="//a[text()='Employee']")})
	WebElement Employee_Option;
	
	public WebElement Employee_Option() {
		return Employee_Option;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='userId']")})
	WebElement Employee_Id_Field;
	public WebElement Employee_Id_Field() {
		return Employee_Id_Field;
	}
	@FindAll({@FindBy(xpath="//a[@id='members-tab']"),@FindBy(xpath="//a[@aria-controls='members']")})
	WebElement member_Option;
	
	public WebElement member_Option() {
		return member_Option;
	}
	@FindAll({@FindBy(xpath="//input[@id='prov-id']")})
	WebElement provider_Id_Field;
	public WebElement provider_Id_Field() {
		return provider_Id_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='password']")})
	WebElement password_Field;
	public WebElement password_Field() {
		return password_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='prov-password']")})
	WebElement provider_Password_Field;
	
	public WebElement provider_Password_Field() {
		return provider_Password_Field;
	}
	@FindAll({@FindBy(xpath="//input[@id='civilId']")})
	WebElement civil_ID_Field;
	
	public WebElement civil_ID_Field() {
		return civil_ID_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='mem_password']")})
	WebElement member_Password_Field;
	public WebElement member_Password_Field() {
		return member_Password_Field;
	}
	
	@FindAll({@FindBy(xpath="(//button[@class='button buttonBlue'])[1]"),@FindBy(xpath="(//button[contains(text(),'Login')])[1]")})
	WebElement Member_login_Button;
	
	public WebElement Member_login_Button() {
		return Member_login_Button;
	} 
	
	@FindAll({@FindBy(xpath="(//button[@class='button buttonBlue'])[3]"),@FindBy(xpath="(//button[contains(text(),'Login')])[3]")})
	WebElement provider_login_Button;
	
	public WebElement provider_login_Button() {
		return provider_login_Button;
	}
	
	
	@FindAll({@FindBy(xpath="(//button[text()='Login'])[1]"),@FindBy(xpath="(//button[@class='btn btn-lg btn-block login-button'])[1]")})
	WebElement login_Button;
	
	public WebElement login_Button() {
		return login_Button;
	}
	@FindAll({@FindBy(xpath="//li[@class='dropdown nav-profile']//span")})
	WebElement get_User_Profile_Name;
	
	public WebElement get_User_Profile_Name() {
		return get_User_Profile_Name;
	}
	@FindAll({@FindBy(xpath="//button[@class='btn btn-primary dropdown-toggle']//p")})
	WebElement get_Provider_Profile_Name;
	
	public WebElement get_Provider_Profile_Name() {
		return get_Provider_Profile_Name;
	}
	
	@FindAll({@FindBy(xpath="//button[@class='btn btn-primary dropdown-toggle']//p")})
	WebElement get_Member_Profile_Name;
	
	public WebElement get_Member_Profile_Name() {
		return get_Member_Profile_Name;
	}
	
	@FindAll({@FindBy(xpath="//a[@id='providers-tab']"),@FindBy(xpath="//a[contains(text(),'Providers')]")})
	WebElement provider_Option;
	
	public WebElement provider_Option() {
		return provider_Option;
	}
}
