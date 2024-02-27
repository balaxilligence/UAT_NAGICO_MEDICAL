package org.pages;

import org.common.BasicFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pre_Approval_Employee_Portal_Approval_Page extends BasicFunctions{
	
	public Pre_Approval_Employee_Portal_Approval_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(xpath="//span[contains(text(),'Pre Approvals')]")})
	WebElement pre_Approvals_Menu;
	
	public WebElement pre_Approvals_Menu() {
		return pre_Approvals_Menu;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='searchBy']"),@FindBy(xpath="//select[@name='searchBy']")})
	WebElement pre_Approval_Search_By_Dropdown;
	
	public WebElement pre_Approval_Search_By_Dropdown() {
		return pre_Approval_Search_By_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='searchValue']"),@FindBy(xpath="//input[@name='searchValue']")})
	WebElement pre_Approval_Search_Field;
	
	public WebElement pre_Approval_Search_Field() {
		return pre_Approval_Search_Field;
	}
	
	@FindAll({@FindBy(xpath="//button[@id='plan_add']")})
	WebElement pre_Approval_Search_Button;
	
	public WebElement pre_Approval_Search_Button() {
		return pre_Approval_Search_Button;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='tbl_preAppTrack_list']//tbody[1]//tr[1]//td[8]//span")})
	WebElement get_Priority;
	
	public WebElement get_Priority() {
		return get_Priority;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='tbl_preAppTrack_list']//tbody[1]//tr[1]//td[10]")})
	WebElement workflow_Status;
	public WebElement workflow_Status() {
		return workflow_Status;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='tbl_preAppTrack_list']//tbody[1]//tr[1]//td[15]//button[1]")})
	WebElement process_View_Button;
	
	public WebElement process_View_Button() {
		return process_View_Button;
	}
	
	@FindAll({@FindBy(xpath="(//span[contains(text(),'Tracking')])[2]"),@FindBy(xpath="")})
	WebElement tracking_Menu;
	public WebElement tracking_Menu() {
		return tracking_Menu;
	}
	
	@FindAll({@FindBy(xpath="//div[text()='Est. Amount']//following-sibling::div[1]")})
	WebElement get_Est_Amount;
	
	public WebElement get_Est_Amount() {
		return get_Est_Amount;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='unagreeTreatmenttbl']//tbody//tr[1]//td[10]")})
	WebElement unagreed_Treatment_Status;
	
	public WebElement unagreed_Treatment_Status() {
		return unagreed_Treatment_Status;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='agreeTreatmenttbl']//tbody//tr[1]//td[12]")})
	WebElement agreed_Treatment_Status;
	
	public WebElement agreed_Treatment_Status() {
		return agreed_Treatment_Status;
	}
	
	@FindAll({@FindBy(xpath="//div[contains(text(),'Member ID')]//following-sibling::div[1]")})
	WebElement get_Member_Id;
	
	public WebElement get_Member_Id() {
		return get_Member_Id;
	}
	@FindAll({@FindBy(xpath="//table[@id='unagreeTreatmenttbl']//tbody[1]//tr[1]//td[15]//button[1]")})
	WebElement edit_Unagreed_Treatment_Button;
	
	public WebElement edit_Unagreed_Treatment_Button() {
		return edit_Unagreed_Treatment_Button;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='pharmacytbl']//tbody//tr[1]//td[12]")})
	WebElement pharmacy_Details_Status;
	public WebElement pharmacy_Details_Status() {
		return pharmacy_Details_Status;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='preAppr_submit']"),@FindBy(xpath="//input[@value='Send for Review']")})
	WebElement submit_button;
	
	public WebElement submit_button() {
		return submit_button;
	}
	@FindAll({@FindBy(xpath="//select[@id='id_toothNumber']"),@FindBy(xpath="(//select[@name='preApprTreatments.patToothNumber'])[2]")})
	WebElement tooth_Number_Dropdown;
	public WebElement tooth_Number_Dropdown() {
		return tooth_Number_Dropdown;
	}
	@FindAll({@FindBy(xpath="//button[contains(text(),'Save & Close')]"),@FindBy(xpath="(//button[@class='btn btn-greensea btn-sm'])[2]")})
	WebElement save_and_Close_Button;
	
	public WebElement save_and_Close_Button() {
		return save_and_Close_Button;
	}
	
	@FindAll({@FindBy(xpath="//span[@id='id_est_amt']")})
	WebElement estimate_Amount;
	public WebElement estimate_Amount() {
		return estimate_Amount;
	}
	
	
	@FindAll({@FindBy(xpath="//span[@id='id_appr_amt']")})
	WebElement approved_Amount;
	public WebElement approved_Amount() {
		return approved_Amount;
	}
	
	@FindAll({@FindBy(xpath="(//button[contains(text(),'Yes')])[1]"),@FindBy(xpath="(//button[contains(text(),'Yes')])[1]")})
	WebElement yes_Button;
	public WebElement yes_Button() {
		return yes_Button;
	}
	
	@FindAll({@FindBy(xpath="//textarea[@id='appr_remarks']"),@FindBy(xpath="//textarea[@name='appr_remarks']")})
	WebElement approval_Remarks;
	
	public WebElement approval_Remarks() {
		return approval_Remarks;
	}
	
	@FindAll({@FindBy(xpath="//button[@id='apprev_btn']")})
	WebElement approve_Button;
	
	public WebElement approve_Button() {
		return approve_Button;
	}
	
	@FindAll({@FindBy(xpath="//h3[@id='success_modal_dialog_heading']")})
	WebElement success_msg;
	
	public WebElement success_msg() {
		return success_msg;
	}
	
	@FindAll({@FindBy(xpath="//span[@id='preApp_success_div']")})
	WebElement pre_Approval_Success_Msg;
	
	public WebElement pre_Approval_Success_Msg() {
		return pre_Approval_Success_Msg;
	}
	
	@FindAll({@FindBy(xpath="//button[@id='btn_close']")})
	WebElement go_To_Tracking_Button;
	
	public WebElement go_To_Tracking_Button() {
		return go_To_Tracking_Button;
	}
	
	@FindAll({@FindBy(xpath="(//span[contains(text(),'Reviewer Tracking')])[1]")})
	WebElement pre_Approval_Review_Tracking_Button;
	
	public WebElement pre_Approval_Review_Tracking_Button() {
		return pre_Approval_Review_Tracking_Button;
	}
	@FindAll({@FindBy(xpath="//input[@id='unagreeInsTreatCode']")})
	WebElement Ins_Treatment_Code;
	
	public WebElement Ins_Treatment_Code() {
		return Ins_Treatment_Code;
	}
	
	@FindAll({@FindBy(xpath="(//span[contains(text(),'Approver Tracking')])[1]")})
	WebElement approver_Tracking_Button;
	
	public WebElement approver_Tracking_Button() {
		return approver_Tracking_Button;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='tbl_preAppTrack_list']//tbody[1]//tr[1]//td[9]//span//b[1]")})
	WebElement get_Status;
	public WebElement get_Status() {
		return get_Status;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='agreeTreatmenttbl']//tbody//tr[1]//td[17]//button[1]")})
	WebElement agreed_Treatment_Approve_Button;
	public WebElement agreed_Treatment_Approve_Button() {
		return agreed_Treatment_Approve_Button;
	}
	

	@FindAll({@FindBy(xpath="//table[@id='unagreeTreatmenttbl']//tbody//tr[1]//td[14]//button[1]")})
	WebElement un_agreed_Treatment_Approve_Button;
	public WebElement un_agreed_Treatment_Approve_Button() {
		return un_agreed_Treatment_Approve_Button;
	}
	
	@FindAll({@FindBy(xpath="//span[contains(text(),'Decision')]//following::button[1]"),@FindBy(xpath="//table[@id='pharmacytbl']//tbody//tr[1]//td[18]//button[1]")})
	WebElement pharmacy_Details_Approve_Button;
	public WebElement pharmacy_Details_Approve_Button() {
		return pharmacy_Details_Approve_Button;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='pharmacytbl']//tbody[1]//tr[1]//td[1]")})
	WebElement pre_Approval_Cursor;
	public WebElement pre_Approval_Cursor() {
		return pre_Approval_Cursor;
	}
	
	@FindBy(xpath="//select[@id='sel_overrideReason']")
	WebElement override_Reason;
	
	public WebElement override_Reason() {
		return override_Reason;
	}
	
	@FindAll({@FindBy(xpath="//button[contains(text(),'Save')]")})
	WebElement save_Button;
	public WebElement save_Button() {
		return save_Button;
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
