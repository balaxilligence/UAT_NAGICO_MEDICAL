package org.pages;

import org.common.BasicFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Provider_Claim_Employee_Portal_Approval_Page extends BasicFunctions{
	
	public Provider_Claim_Employee_Portal_Approval_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(xpath="(//span[contains(text(),'Provider Claims')])[1]")})
	WebElement provider_Claim_Menu;

	public WebElement provider_Claim_Menu() {
		return provider_Claim_Menu;
	}
	
	@FindAll({@FindBy(xpath="//span[text()=' Batch Tracking']")})
	WebElement batch_tracking_SubMenu;
	public WebElement batch_tracking_SubMenu() {
		return batch_tracking_SubMenu;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='id_searchBy']"),@FindBy(xpath="")})
	WebElement search_Ref_Number_Dropdown;
	
	public WebElement search_Ref_Number_Dropdown() {
		return search_Ref_Number_Dropdown;
	}
	@FindAll({@FindBy(xpath="//input[@id='txt_mbNo']")})
	WebElement search_Ref_Number_Field;
	public WebElement search_Ref_Number_Field() {
		return search_Ref_Number_Field;
	}
	
	@FindAll({@FindBy(xpath="//a[@class='btn btn-greensea btn-sm btn-blue pull-left']")})
	WebElement Ref_Search_button;
	public WebElement Ref_Search_button() {
		return Ref_Search_button;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='tbl']//tbody[1]//tr[1]//td[1]")})
	WebElement get_Ref_Num;
	
	public WebElement get_Ref_Num() {
		return get_Ref_Num;
	}
	
	@FindAll({@FindBy(xpath="//span[text()='Action']//following::span[1]//button[1]"),@FindBy(xpath="(//button[@title='view'])[2]")})
	WebElement view_Button;
	public WebElement view_Button() {
		return view_Button;
	}
	
	@FindAll({@FindBy(xpath="//button[@title='Select All']"),@FindBy(xpath="//button[@class='btn btn-greensea btn-sm mr-5 pull-right']")})
	WebElement select_All_Button;
	
	public WebElement select_All_Button() {
		return select_All_Button;
	}
	@FindAll({@FindBy(xpath="//select[@id='allColumnsId']"),@FindBy(xpath="//select[@name='clmUidList']")})
	WebElement processor_Assign_dropdown;
	
	public WebElement processor_Assign_dropdown() {
		return processor_Assign_dropdown;
	}
	
	@FindAll({@FindBy(xpath="(//button[@class='btn btn-greensea btn-sm'])[3]")})
	WebElement processor_Assign_Button;
	
	public WebElement processor_Assign_Button() {
		return processor_Assign_Button;
	}
	
	@FindAll({@FindBy(xpath="//button[contains(text(),'Save')]")})
	WebElement save_Button;
	
	public WebElement save_Button() {
		return save_Button;
	}
	
	
	@FindAll({@FindBy(xpath="//button[contains(text(),'Process')]")})
	WebElement process_Button;
	
	public WebElement process_Button() {
		return process_Button;
	}

	@FindAll({@FindBy(xpath="//table[@id='tbl']//tbody[1]//tr[1]//td[3]//span//b")})
	WebElement Batch_Tracking_Status;
	
	public WebElement Batch_Tracking_Status() {
		return Batch_Tracking_Status;
	}
	
	@FindBy(xpath="(//button[contains(text(),'Yes')])[2]")
	WebElement yes_Button;
	public WebElement yes_Button() {
		return yes_Button;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='apprBatch_submit']"),@FindBy(xpath="//input[@value='Approve Batch']")})
	WebElement approve_Batch_Button;
	
	public WebElement approve_Batch_Button() {
		return approve_Batch_Button;
	}
	
	@FindAll({@FindBy(xpath="(//button[@id='btn_approve_mb'])[2]")})
	WebElement approval_Menu;
	
	public WebElement approval_Menu() {
		return approval_Menu;
	}
	
	@FindAll({@FindBy(xpath="//textarea[@id='matser_batch_remarks']"),@FindBy(xpath="//textarea[@name='medClmMasterBantch.mbApprRemarks']")})
	WebElement master_Batch_Approval_Remarks;
	
	public WebElement master_Batch_Approval_Remarks() {
		return master_Batch_Approval_Remarks;
	}
	
	@FindAll({@FindBy(xpath="(//button[@id='btn_close'])[1]"),@FindBy(xpath="//button[text()='  Submit']")})
	WebElement master_Batch_Submit_Button;
	
	public WebElement master_Batch_Submit_Button() {
		return master_Batch_Submit_Button;
	}
	@FindAll({@FindBy(xpath="(//span[contains(text(),' Reviewer Tracking')])[2]"),@FindBy(xpath="//span[text()=' Provider Claims ']//following::ul[1]//li[5]//span")})
	WebElement reviewer_Tracking_Submenu;
	
	public WebElement reviewer_Tracking_Submenu() {
		return reviewer_Tracking_Submenu;
	}
	
	@FindAll({@FindBy(xpath="(//span[text()=' Approver Tracking'])[2]"),@FindBy(xpath="//span[text()=' Provider Claims ']//following::ul[1]//li[6]//span")})
	WebElement approver_Tracking_Submenu;
	
	public WebElement approver_Tracking_Submenu() {
		return approver_Tracking_Submenu;
	}
	
	@FindAll({@FindBy(xpath="//div[text()='Status ']//following-sibling::div[1]//span//b")})
	WebElement get_Status;
	
	public WebElement get_Status() {
		return get_Status;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='tbl']//tbody[1]//tr[1]//td[4]")})
	WebElement get_Workflow_Msg;
	
	public WebElement get_Workflow_Msg() {
		return get_Workflow_Msg;
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
}
