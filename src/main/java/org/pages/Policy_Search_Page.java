package org.pages;

import org.common.BasicFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Policy_Search_Page extends BasicFunctions{
	
	public Policy_Search_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(xpath="(//div[contains(text(),'Quote No')]//following-sibling::div[1])[1]")})
	WebElement get_Quote_Number;
	
	public WebElement get_Quote_Number() {
		return get_Quote_Number;
	}
	
	@FindAll({@FindBy(xpath="//li[@class='dropdown nav-profile']//span")})
	WebElement get_User_Profile_Name;
	
	public WebElement get_User_Profile_Name() {
		return get_User_Profile_Name;
	}
	
	@FindAll({@FindBy(xpath="(//ul[@class='dropdown-menu animated littleFadeInRight']//a)[2]")})
	WebElement logout_Button;
	
	public WebElement logout_Button() {
		return logout_Button;
	}
	
	@FindAll({@FindBy(xpath="//ul[@class='nav-left pull-left list-unstyled list-inline']//li[2]//a"),@FindBy(xpath="(//a[@class='dropdown-toggle'])[1]")})
	WebElement global_Search_Button;

	public WebElement global_Search_Button() {
		return global_Search_Button;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='txt_quoteNo']"),@FindBy(xpath="//input[@name='quoteNo']")})
	WebElement search_Quote_Number_Field;
	
	public WebElement search_Quote_Number_Field() {
		return search_Quote_Number_Field;
	}
	
	@FindAll({@FindBy(xpath="//div[contains(text(),'Search Quote')]//following-sibling::div[3]//a"),@FindBy(xpath="//a[@title='Search Quote']")})
	WebElement search_Quote_Button;
	
	public WebElement search_Quote_Button() {
		return search_Quote_Button;
	}
	
	@FindBy(xpath="//a[@title='My Actions']")
	WebElement my_Action;
	
	public WebElement my_Action() {
		return my_Action;
	}
	
	@FindAll({@FindBy(xpath="//div[@id='div_tbl_search']//input"),@FindBy(xpath="//input[@aria-controls='WorkflowQueryTable']")})
	WebElement work_Flow_Query_Button;
	
	public WebElement work_Flow_Query_Button() {
		return work_Flow_Query_Button;
	}
	
	@FindAll({@FindBy(xpath="//span[@id='btn_view']"),@FindBy(xpath="//span[@title='Approve']")})
	WebElement approve_Menu;
	
	public WebElement approve_Menu() {
		return approve_Menu;
	}
	
	@FindAll({@FindBy(xpath="//button[@name='btn_approve']"),@FindBy(xpath="//button[@id='btn_approve']")})
	WebElement approve_Button;
	
	public WebElement approve_Button() {
		return approve_Button;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='sel_search_policy']"),@FindBy(xpath="//select[@name='policyBy']")})
	WebElement search_Policy_Dropdown;
	
	public WebElement search_Policy_Dropdown() {
		return search_Policy_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='txt_policyNo']"),@FindBy(xpath="(//input[@name='policyNo'])[1]")})
	WebElement search_Policy_Field;
	
	public WebElement search_Policy_Field() {
		return search_Policy_Field;
	}
	
	@FindAll({@FindBy(xpath="//div[contains(text(),'Search Policy')]//following-sibling::div[3]//a"),@FindBy(xpath="(//a[@title='Search Policy'])[1]")})
	WebElement search_policy_Button;
	public WebElement search_policy_Button() {
		return search_policy_Button;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='dashboard_search_tbl']//tbody//tr[1]//td[2]")})
	WebElement get_Policy_Number;
	
	public WebElement get_Policy_Number() {
		return get_Policy_Number;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='dashboard_search_tbl']//tbody//tr[1]//td[3]")})
	WebElement get_Policy_Type;
	
	public WebElement get_Policy_Type() {
		return get_Policy_Type;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='dashboard_search_tbl']//tbody//tr[1]//td[4]")})
	WebElement get_Insured_Name;
	
	public WebElement get_Insured_Name() {
		return get_Insured_Name;
	}
	
	@FindAll({@FindBy(xpath="//ul[@class='actionMessage']//li//span")})
	WebElement policy_Approval_Msg;
	
	public WebElement policy_Approval_Msg() {
		return policy_Approval_Msg;
	}
	
	@FindAll({@FindBy(xpath="//button[@id='btn_endorsement']"),@FindBy(xpath="//button[contains(text(),'Endorsement')]")})
	WebElement endorsement_Button;
	
	public WebElement endorsement_Button() {
		return endorsement_Button;
	}
	
	@FindAll({@FindBy(xpath="//a[@id='employee-tab']"),@FindBy(xpath="//a[@aria-controls='employee']")})
	WebElement Employee_Option;
	
	public WebElement Employee_Option() {
		return Employee_Option;
	}
	@FindAll({@FindBy(xpath="//input[@id='userId']")})
	WebElement Employee_Id_Field;
	public WebElement Employee_Id_Field() {
		return Employee_Id_Field;
	}
	@FindAll({@FindBy(xpath="//input[@id='password']")})
	WebElement password_Field;
	public WebElement password_Field() {
		return password_Field;
	}
	
	@FindAll({@FindBy(xpath="(//button[@class='button buttonBlue'])[4]")})
	WebElement login_Button;
	
	public WebElement login_Button() {
		return login_Button;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='dashboard_search_tbl']//tbody[1]//tr[1]//td[9]")})
	WebElement policy_To_Date;
	
	public WebElement policy_To_Date() {
		return policy_To_Date;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='dashboard_search_tbl']//tbody[1]//tr[1]//td[8]")})
	WebElement get_policy_From_Date;
	
	public WebElement get_policy_From_Date() {
		return get_policy_From_Date;
	}
	
	@FindAll({@FindBy(xpath="//a[contains(text(),'Member Details')]"),@FindBy(xpath="//h4[@id='queryMemberDetails']//a")})
	WebElement member_Details;
	
	public WebElement member_Details() {
		return member_Details;
	}
	@FindAll({@FindBy(xpath="//table[@id='view_member']//tbody[1]//tr[3]//td[4]")})
	WebElement get_Member_Id;
	
	public WebElement get_Member_Id() {
		return get_Member_Id;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='view_member']//tbody[1]//tr[1]//td[4]")})
	WebElement find_Member_Id;
	
	public WebElement find_Member_Id() {
		return find_Member_Id;
	}
	
	@FindAll({@FindBy(xpath="(//div[contains(text(),'Customer')]//following-sibling::div[1])[2]")})
	WebElement get_Customer;
	
	public WebElement get_Customer() {
		return get_Customer;
	}
	
	@FindAll({@FindBy(xpath="//div[contains(text(),'Insured Name')]//following-sibling::div[1]")})
	WebElement get_Insured;
	
	public WebElement get_Insured() {
		return get_Insured;
	}
}
