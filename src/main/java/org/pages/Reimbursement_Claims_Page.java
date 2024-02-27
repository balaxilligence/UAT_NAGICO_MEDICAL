package org.pages;

import org.common.BasicFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reimbursement_Claims_Page extends BasicFunctions{
	
	public Reimbursement_Claims_Page() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(xpath="(//span[contains(text(),'Reimbursement Claims')])[1]")})
	WebElement reimbursement_Claims_Menu;
	
	public WebElement reimbursement_Claims_Menu() {
		return reimbursement_Claims_Menu;
	}
	@FindAll({@FindBy(xpath="//span[contains(text(),'Member Intimation')]")})
	WebElement member_Intimation_SubMenu;
	public WebElement member_Intimation_SubMenu() {
		return member_Intimation_SubMenu;
	}
	
	@FindAll({@FindBy(xpath="//select[@name='searchBy']"),@FindBy(xpath="//select[@id='searchBy']")})
	WebElement search_Member_Dropdown;
	
	public WebElement search_Member_Dropdown() {
		return search_Member_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//input[@name='searchValue']"),@FindBy(xpath="//input[@id='searchValue']")})
	WebElement member_Id_Field;
	public WebElement member_Id_Field() {
		return member_Id_Field;
	}
	
	@FindAll({@FindBy(xpath="//a[@title='Search Policy']"),@FindBy(xpath="//a[@class='btn btn-greensea btn-sm btn-blue']")})
	WebElement search_Button;
	
	public WebElement search_Button() {
		return search_Button;
	}
	
	@FindBy(xpath="//table[@id='member_search_tbl']//tbody[1]//tr[1]//td[3]")
	WebElement get_Member_Id;
	
	public WebElement get_Member_Id() {
		return get_Member_Id;
	}
	
	@FindBy(xpath="//table[@id='member_search_tbl']//tbody[1]//tr[1]//td[5]")
	WebElement get_policy_Number;
	
	public WebElement get_policy_Number() {
		return get_policy_Number;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='member_search_tbl']//tbody[1]//tr[1]//td[1]//input[1]"),@FindBy(xpath="//input[@name='select']")})
	WebElement member_Query_Radio_Button;
	
	public WebElement member_Query_Radio_Button() {
		return member_Query_Radio_Button;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='rcPaymentMethod']"),@FindBy(xpath="//select[@name='bean.paymentMethod']")})
	WebElement pay_method_Dropdown;
	
	public WebElement pay_method_Dropdown() {
		return pay_method_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//input[@name='bean.empBankName']"),@FindBy(xpath="//input[@id='mem_bank_name']")})
	WebElement bank_Name_Field;
	
	public WebElement bank_Name_Field() {
		return bank_Name_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='mem_bank_loc']"),@FindBy(xpath="//input[@name='bean.bankLoc']")})
	WebElement bank_Location_Field;
	
	public WebElement bank_Location_Field() {
		return bank_Location_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='mem_acntNo']"),@FindBy(xpath="//input[@name='bean.acntNo']")})
	WebElement account_Number_Field;
	
	public WebElement account_Number_Field() {
		return account_Number_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='mem_iban_no']"),@FindBy(xpath="//input[@name='bean.empIbanNo']")})
	WebElement IBAN_Field;
	public WebElement IBAN_Field() {
		return IBAN_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='frm_mem_clm_int_bean_billCount']"),@FindBy(xpath="//input[@name='bean.billCount']")})
	WebElement bill_Count_Field;
	
	public WebElement bill_Count_Field() {
		return bill_Count_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@name='bean.estAmt']"),@FindBy(xpath="//input[@id='frm_mem_clm_int_bean_estAmt']")})
	WebElement estimate_Amount_Field;
	public WebElement estimate_Amount_Field() {
		return estimate_Amount_Field;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='currCode']"),@FindBy(xpath="//select[@name='bean.currCode']")})
	WebElement pay_Currency_Dropdown;
	public WebElement pay_Currency_Dropdown() {
		return pay_Currency_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//button[@id='btn_mem_clm_int_save']"),@FindBy(xpath="//button[contains(text(),'Intimate')]")})
	WebElement intimate_Button;
	
	public WebElement intimate_Button() {
		return intimate_Button;
	}
	
	@FindBy(xpath="//div[@id='succ_mem_clm_int_div']//following-sibling::div[1]//child::div[1]//span[1]//h3")
	WebElement intimation_Success_Msg;
	
	public WebElement intimation_Success_Msg() {
		return intimation_Success_Msg;
	}
	
	@FindBy(xpath="//span[@id='ref_no_res']")
	WebElement intimated_Ref_Id;
	
	public WebElement intimated_Ref_Id() {
		return intimated_Ref_Id;
	}
	@FindAll({@FindBy(xpath="(//button[@id='btn_mem_clm_int_close'])[2]"),@FindBy(xpath="(//button[contains(text(),'Close')])[2]")})
	WebElement close_Button;
	
	public WebElement close_Button() {
		return close_Button;
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
	
	@FindAll({@FindBy(xpath="//table[@id='tbl_reimb_clm']//tbody[1]//tr[1]//td[7]//span//b")})
	WebElement get_Claim_Status;
	
	public WebElement get_Claim_Status() {
		return Claim_Search_Button;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='tbl_reimb_clm']//tbody[1]//tr[1]//td[1]")})
	WebElement get_Ref_Id;
	public WebElement get_Ref_Id() {
		return get_Ref_Id;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='tbl_reimb_clm']//tbody[1]//tr[1]//td[7]")})
	WebElement get_pay_Currency;
	public WebElement get_pay_Currency() {
		return get_pay_Currency;
	}
	@FindAll({@FindBy(xpath="//table[@id='tbl_reimb_clm']//tbody[1]//tr[1]//td[12]//button[1]"),@FindBy(xpath="//table[@id='tbl_reimb_clm']//tbody[1]//tr[1]//td[12]//button[1]")})
	WebElement claim_view_Button;
	
	public WebElement claim_view_Button() {
		return claim_view_Button;
	}
	
	@FindAll({@FindBy(xpath="//button[@id='btn_add_invoices']")})
	WebElement add_Invoice_button;
	public WebElement add_Invoice_button() {
		return add_Invoice_button;
	}
	
	@FindAll({@FindBy(xpath="//button[@class='btn btn-greensea']"),@FindBy(xpath="//button[contains(text(),'Go')]")})
	WebElement go_Button;
	
	public WebElement go_Button() {
		return go_Button;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='typeId']"),@FindBy(xpath="//select[@name='wmedlmervices.wsServiceType']")})
	WebElement service_Type_Dropdown;
	
	public WebElement service_Type_Dropdown() {
		return service_Type_Dropdown;
	}
	
	
	@FindAll({@FindBy(xpath="//input[@name='wmedlmervices.wsPrimaryDiagDesc']"),@FindBy(xpath="//input[@id='txt_primaryDesc']")})
	WebElement primary_Disgnosis_Field;
	
	public WebElement primary_Disgnosis_Field() {
		return primary_Disgnosis_Field;
	}
	
	@FindAll({@FindBy(xpath="//select[@name='wmedlmervices.wsBenCode']"),@FindBy(xpath="//select[@id='id_ben_code']")})
	WebElement ben_Code_Dropdown;
	
	public WebElement ben_Code_Dropdown() {
		return ben_Code_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='id_sub_ben_code']"),@FindBy(xpath="//select[@name='wmedlmervices.wsSubBenCode']")})
	WebElement sub_Ben_Code_Dropdown;
	
	public WebElement sub_Ben_Code_Dropdown() {
		return sub_Ben_Code_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@name='wmedlmervices.wsProviderCode']"),@FindBy(xpath="//select[@id='providerList']")})
	WebElement provider_Dropdown;
	public WebElement provider_Dropdown() {
		return provider_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='rchTreatCountry']"),@FindBy(xpath="//select[@name='wmedlmervices.wsTreatCountry']")})
	WebElement treatment_Country;
	
	public WebElement treatment_Country() {
		return treatment_Country;
	}
	
	@FindAll({@FindBy(xpath="//input[@name='wmedlmervices.wsServiceDate']"),@FindBy(xpath="//input[@id='txt_serviceDt']")})
	WebElement service_Date_Field;
	
	public WebElement service_Date_Field() {
		return service_Date_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='ins_treat_desc']"),@FindBy(xpath="//input[@name='wmedlmervices.mcdInsTreatDesc']")})
	WebElement treatment_Code_Field;
	
	public WebElement treatment_Code_Field() {
		return treatment_Code_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@name='wmedlmervices.wsInvNo']"),@FindBy(xpath="//input[@id='wsInvNo']")})
	WebElement invoice_No_Field;
	
	public WebElement invoice_No_Field() {
		return invoice_No_Field;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='rcCurrency']"),@FindBy(xpath="//select[@name='wmedlmervices.wsCurrency']")})
	WebElement invoice_Currency;
	
	public WebElement invoice_Currency() {
		return invoice_Currency;
	}
	
	@FindAll({@FindBy(xpath="//input[@name='wmedlmervices.wsAmountFc']"),@FindBy(xpath="//input[@id='wsAmountFc']")})
	WebElement invoice_Amount_Field;
	public WebElement invoice_Amount_Field() {
		return invoice_Amount_Field;
	}
	
	@FindAll({@FindBy(xpath="//button[contains(text(),'Adjudicate')]")})
	WebElement adjudicate_Button;
	public WebElement adjudicate_Button() {
		return adjudicate_Button;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='invoices_tbl']//tbody[1]//tr[1]//td[1]//span")})
	WebElement get_Claim_Number;
	public WebElement get_Claim_Number() {
		return get_Claim_Number;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='invoices_tbl']//tbody[1]//tr[1]//td[9]")})
	WebElement get_Claim_and_Invoice_Status;
	
	public WebElement get_Claim_and_Invoice_Status() {
		return get_Claim_and_Invoice_Status;
	}
	
	@FindAll({@FindBy(xpath="//button[@id='btn_process_save']")})
	WebElement save_Button;
	
	public WebElement save_Button() {
		return save_Button;
	}
	
	@FindAll({@FindBy(xpath="//button[@id='btn_process_open1']"),@FindBy(xpath="//button[contains(text(),'Add Service')]")})
	WebElement add_Service_Button;
	
	public WebElement add_Service_Button() {
		return add_Service_Button;
	}
	@FindAll({@FindBy(xpath="//button[@id='btn_process_open']")})
	WebElement add_Claim_Button;
	
	public WebElement add_Claim_Button() {
		return add_Claim_Button;
	}
	@FindAll({@FindBy(xpath="//button[@id='btn_track_back']")})
	WebElement back_Button;
	public WebElement back_Button() {
		return back_Button;
	}
	
	@FindAll({@FindBy(xpath="(//button[@id='btn_approve_mb'])[2]"),@FindBy(xpath="//button[contains(text(),'Approve MB')]")})
	WebElement Approve_MB_Button;
	
	public WebElement Approve_MB_Button() {
		return Approve_MB_Button;
	}
	@FindAll({@FindBy(xpath="//textarea[@id='matser_batch_remarks']"),@FindBy(xpath="//textarea[@name='medClmMasterBantch.mbApprRemarks']")})
	WebElement remarks_Field;
	
	public WebElement remarks_Field() {
		return remarks_Field;
	}
	
	@FindAll({@FindBy(xpath="(//button[@id='btn_close'])[1]"),@FindBy(xpath="(//button[contains(text(),'Approve')])[2]")})
	WebElement approve_Button;
	
	public WebElement approve_Button() {
		return approve_Button;
	}
	
	@FindAll({@FindBy(xpath="(//span[contains(text(),'Reimbursement Claims')])[1]//following::ul[1]//li[4]//a//span"),@FindBy(xpath="(//span[contains(text(),'Reviewer Tracking')])[3]")})
	WebElement reimbursement_Reviewer_Tracking_Sub_Menu;
	public WebElement reimbursement_Reviewer_Tracking_Sub_Menu() {
		return reimbursement_Reviewer_Tracking_Sub_Menu;
	}
	
	
	@FindAll({@FindBy(xpath="(//span[contains(text(),'Reimbursement Claims')])[1]//following::ul[1]//li[5]//a//span"),@FindBy(xpath="(//span[contains(text(),'Approver Tracking')])[3]")})
	WebElement reimbursement_Approver_Tracking_Sub_Menu;
	public WebElement reimbursement_Approver_Tracking_Sub_Menu() {
		return reimbursement_Approver_Tracking_Sub_Menu;
	}
	
	@FindBy(xpath="//table[@id='tbl_reimb_clm']//tbody[1]//tr[1]//td[5]")
	WebElement get_Workflow_Status;
	
	public WebElement get_Workflow_Status() {
		return get_Workflow_Status;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='tbl_reimb_clm']//tbody[1]//tr[1]//td[9]//button[1]")})
	WebElement Reviewer_view_Button;
	public WebElement Reviewer_view_Button() {
		return Reviewer_view_Button;
	}
	
	@FindAll({@FindBy(xpath="//div[contains(text(),'Status')]//following::div[1]//span[1]//b")})
	WebElement master_Batch_Status;
	
	public WebElement master_Batch_Status() {
		return master_Batch_Status;
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
	
	@FindAll({@FindBy(xpath="//table[@id='batches_tbl']//tbody[1]//tr[1]//td[11]//button[4]"),@FindBy(xpath="//button[@title='Appeal']")})
	WebElement appeal_Menu_Button;
	
	public WebElement appeal_Menu_Button() {
		return appeal_Menu_Button;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='cbAppealRemarks']"),@FindBy(xpath="//input[@name='medClmBatch.cbAppealRemarks']")})
	WebElement claim_Appeal_Remarks_Field;
	
	public WebElement claim_Appeal_Remarks_Field() {
		return claim_Appeal_Remarks_Field;
	}
	
	@FindAll({@FindBy(xpath="//button[contains(text(),'Appeal')]"),@FindBy(xpath="(//button[@id='btn_close'])[1]")})
	WebElement appeal_Button;
	
	public WebElement appeal_Button() {
		return appeal_Button;
	}
	
	@FindAll({@FindBy(xpath="//button[@title='Process Appeal']"),@FindBy(xpath="//table[@id='batches_tbl']//tbody[1]//tr[1]//td[11]//button[2]")})
	WebElement process_Appeal_Menu_Button;
	
	public WebElement process_Appeal_Menu_Button() {
		return process_Appeal_Menu_Button;
	}
	
	@FindAll({@FindBy(xpath="//textarea[@id='proc_remarks']"),@FindBy(xpath="//textarea[@name='clmBatch.cbProcessRemarks']")})
	WebElement process_Appeal_Remarks_Field;
	
	public WebElement process_Appeal_Remarks_Field() {
		return process_Appeal_Remarks_Field;
	}
	
	@FindAll({@FindBy(xpath="//button[contains(text(),'Process Appeal')]"),@FindBy(xpath="//button[@id='btn_close']")})
	WebElement process_Appeal_Button;
	
	public WebElement process_Appeal_Button() {
		return process_Appeal_Button;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='batches_tbl']//tbody[1]//tr[1]//td[10]")})
	WebElement batch_Status;
	
	public WebElement batch_Status() {
		return batch_Status;
	}
	
	@FindBy(xpath="//table[@id='batches_tbl']//tbody[1]//tr[2]//td[10]")
	WebElement new_Batch_Status;
	public WebElement new_Batch_Status() {
		return new_Batch_Status;
	}
	

	@FindAll({@FindBy(xpath="//select[@id='batchId']"),@FindBy(xpath="//select[@name='wmedlmervices.wsMemSrNo']")})
	WebElement select_Member_Id;
	
	public WebElement select_Member_Id() {
		return select_Member_Id;
	}
	

	
	
//	M23090006160
	
	
}
