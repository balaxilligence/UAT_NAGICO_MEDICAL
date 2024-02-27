package org.pages;


import org.common.BasicFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Provider_Claims_Page extends BasicFunctions{
	
	public Provider_Claims_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(xpath="(//span[contains(text(),'Provider Claims')])[1]")})
	WebElement provider_Claim_Menu;

	public WebElement provider_Claim_Menu() {
		return provider_Claim_Menu;
	}
	
	@FindAll({@FindBy(xpath="(//span[contains(text(),'Batch Intimation')])[1]")})
	WebElement batch_Intimation_Sub_Menu;
	
	public WebElement batch_Intimation_Sub_Menu() {
		return batch_Intimation_Sub_Menu;
	}
	
	@FindAll({@FindBy(xpath="//select[@name='provider']"),@FindBy(xpath="//select[@id='provider']")})
	WebElement provider_Dropdown;
	
	public WebElement provider_Dropdown() {
		return provider_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@name='currency']"),@FindBy(xpath="//select[@id='sel_currency']")})
	WebElement currency_Dropdown;
	
	public WebElement currency_Dropdown() {
		return currency_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='providerRefNo']"),@FindBy(xpath="//input[@name='providerRefNo']")})
	WebElement provider_Ref_No_Field;
	
	public WebElement provider_Ref_No_Field() {
		return provider_Ref_No_Field;
	}
	@FindAll({@FindBy(xpath="//input[@name='providerInimatedGrossAmt']"),@FindBy(xpath="//input[@id='providerInimatedGrossAmt']")})
	WebElement intimated_Gross_Amount;
	
	public WebElement intimated_Gross_Amount() {
		return intimated_Gross_Amount;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='billingType']"),@FindBy(xpath="//select[@name='billingType']")})
	WebElement claim_Type_Dropdown;
	
	public WebElement claim_Type_Dropdown() {
		return claim_Type_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//button[contains(text(),'Create Batch')]"),@FindBy(xpath="(//button[@class='btn btn-greensea btn-sm'])[2]")})
	WebElement create_Batch_Dropdown;
	
	public WebElement create_Batch_Dropdown() {
		return create_Batch_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='txt_year']"),@FindBy(xpath="//input[@name='year']")})
	WebElement year_Field;
	public WebElement year_Field() {
		return year_Field;
	}
	
	@FindAll({@FindBy(xpath="//select[@name='month']"),@FindBy(xpath="//select[@id='sel_month']")})
	WebElement month_Dropdown;
	
	public WebElement month_Dropdown() {
		return month_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="(//button[contains(text(),'Submit')])[1]")})
	WebElement submit_Button;	
	public WebElement submit_Button() {
		return submit_Button;
	}
	
	@FindAll({@FindBy(xpath="//div[text()='QLM Ref No ']//following-sibling::div[1]")})
	WebElement get_QLM_ref_no;
	
	public WebElement get_QLM_ref_no() {
		return get_QLM_ref_no;
	}
	
	@FindAll({@FindBy(xpath="//div[text()='Status ']//following-sibling::div[1]//span//b")})
	WebElement get_Status;
	
	public WebElement get_Status() {
		return get_Status;
	}
	
	@FindAll({@FindBy(xpath="//div[text()='Year ']//following-sibling::div[1]")})
	WebElement get_Year;
	
	public WebElement get_Year() {
		return get_Year;
	}
	
	@FindAll({@FindBy(xpath="//div[text()='Month ']//following-sibling::div[1]//div[1]")})
	WebElement get_Month;
	
	public WebElement get_Month() {
		return get_Month;
	}
	
	@FindAll({@FindBy(xpath="//button[@title='Add New']"),@FindBy(xpath="")})
	WebElement add_Button;
	
	public WebElement add_Button() {
		return add_Button;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='id_mco_policyNo']"),@FindBy(xpath="//input[@name='claimOS.mcoPolNo']")})
	WebElement policy_Number_Field;
	
	public WebElement policy_Number_Field() {
		return policy_Number_Field;
	}
	@FindAll({@FindBy(xpath="//input[@id='id_mco_clmCnt']"),@FindBy(xpath="//input[@name='claimOS.mcoClmCnt']")})
	WebElement no_of_Claims_Field;
	
	public WebElement no_of_Claims_Field() {
		return no_of_Claims_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='id_mco_gross_amt']"),@FindBy(xpath="//input[@name='claimOS.mcoGrossAmt']")})
	WebElement gross_Amount_Field;
	
	public WebElement gross_Amount_Field() {
		return gross_Amount_Field;
	}
	@FindAll({@FindBy(xpath="//button[contains(text(),'Save & Close')]")})
	WebElement save_And_Close_Button;
	
	public WebElement save_And_Close_Button() {
		return save_And_Close_Button;
	}
	@FindAll({@FindBy(xpath="//table[@id='claims_os_tbl']//tbody[1]//tr[1]//td[4]")})
	WebElement get_Gross_Amount;
	
	public WebElement get_Gross_Amount() {
		return get_Gross_Amount;
	}
	
	@FindAll({@FindBy(xpath="//td[@id='net_amt_tot']")})
	WebElement get_Net_Amount;
	
	public WebElement get_Net_Amount() {
		return get_Net_Amount;
	}
	
	@FindAll({@FindBy(xpath="//button[contains(text(),'Close & Submit Batch')]")})
	WebElement close_and_Submit_Batch;
	
	public WebElement close_and_Submit_Batch() {
		return close_and_Submit_Batch;
	}
	
	@FindAll({@FindBy(xpath="//h3[contains(text(),'Master Batch')]//strong")})
	WebElement get_Master_Batch_Ref_No;
	
	public WebElement get_Master_Batch_Ref_No() {
		return get_Master_Batch_Ref_No;
	}
	
	@FindBy(xpath="//div[contains(text(),'Net Payable')]//following-sibling::div[1]")
	WebElement get_Net_Payable_Amount;
	
	public WebElement get_Net_Payable_Amount() {
		return get_Net_Payable_Amount;
	}
	@FindAll({@FindBy(xpath="//div[@class='alert alert-success no-hide']")})
	WebElement intimation_Success_Msg;
	
	public WebElement intimation_Success_Msg() {
		return intimation_Success_Msg;
	}
	@FindAll({@FindBy(xpath="(//button[contains(text(),'Close')])[2]")})
	WebElement close_Button;
	
	public WebElement close_Button() {
		return close_Button;
	}
	
	@FindAll({@FindBy(xpath="//button[contains(text(),'Process')]")})
	WebElement process_Button;
	
	public WebElement process_Button() {
		return process_Button;
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
	@FindAll({@FindBy(xpath="//table[@id='tbl']//tbody[1]//tr[1]//td[1]")})
	WebElement get_Ref_Num;
	
	public WebElement get_Ref_Num() {
		return get_Ref_Num;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='tbl']//tbody[1]//tr[1]//td[4]")})
	WebElement get_Workflow_Msg;
	
	public WebElement get_Workflow_Msg() {
		return get_Workflow_Msg;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='tbl']//tbody[1]//tr[1]//td[14]")})
	WebElement get_overall_Gross_Amount;
	
	public WebElement get_overall_Gross_Amount() {
		return get_overall_Gross_Amount;
	}
	
	@FindAll({@FindBy(xpath="//span[text()='Action']//following::span[1]//button[1]"),@FindBy(xpath="(//button[@title='view'])[2]")})
	WebElement view_Button;
	public WebElement view_Button() {
		return view_Button;
	}
	
	@FindAll({@FindBy(xpath="//button[@title='Add Invoices']"),@FindBy(xpath="//table[@id='batches_tbl']//tbody[1]//tr[1]//td[8]//button[5]")})
	WebElement add_Invoice_Button;
	
	public WebElement add_Invoice_Button() {
		return add_Invoice_Button;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='sel_search_member']"),@FindBy(xpath="//select[@name='searchBy']")})
	WebElement search_Member_Dropdown;
	
	public WebElement search_Member_Dropdown() {
		return search_Member_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//input[@name='searchValue']"),@FindBy(xpath="//input[@id='searchValue']")})
	WebElement search_Member_Field;
	
	public WebElement search_Member_Field() {
		return search_Member_Field;
	}
	@FindAll({@FindBy(xpath="//button[@class='btn btn-greensea']")})
	WebElement member_Search_Button;
	
	public WebElement member_Search_Button() {
		return member_Search_Button;
	}
	@FindAll({@FindBy(xpath="//input[@id='txt_primaryDesc']"),@FindBy(xpath="//input[@name='wmedlmervices.wsPrimaryDiagDesc']")})
	WebElement primary_Diagnosis_Field;
	public WebElement primary_Diagnosis_Field() {
		return primary_Diagnosis_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@name='wmedlmervices.wsDocName']"),@FindBy(xpath="//input[@id='id_docName']")})
	WebElement doctor_Name_Field;
	
	public WebElement doctor_Name_Field() {
		return doctor_Name_Field;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='typeId']"),@FindBy(xpath="//select[@name='wmedlmervices.wsServiceType']")})
	WebElement select_Service_Type;
	
	public WebElement select_Service_Type() {
		return select_Service_Type;
	}
	
	@FindAll({@FindBy(xpath="//select[@name='wmedlmervices.wsBenCode']"),@FindBy(xpath="//select[@id='id_ben_code']")})
	WebElement benefit_Dropdown;
	
	public WebElement benefit_Dropdown() {
		return benefit_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='sel_wsDocLicenceNo']"),@FindBy(xpath="//input[@name='wmedlmervices.wsDocLicenseNo']")})
	WebElement doctor_Licence_Id;
	public WebElement doctor_Licence_Id() {
		return doctor_Licence_Id;
	}
	
	@FindAll({@FindBy(xpath="//select[@name='wmedlmervices.wsSubBenCode']"),@FindBy(xpath="//select[@id='id_sub_ben_code']")})
	WebElement sub_Benefit_Dropdown;
	
	public WebElement sub_Benefit_Dropdown() {
		return sub_Benefit_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='id_service_dt']"),@FindBy(xpath="//input[@name='wmedlmervices.wsServiceDate']")})
	WebElement service_Date_Field;
	
	public WebElement service_Date_Field() {
		return service_Date_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='id_inv_no']"),@FindBy(xpath="//input[@name='wmedlmervices.wsInvNo']")})
	WebElement invoice_Number_Field;
	public WebElement invoice_Number_Field() {
		return invoice_Number_Field;
	}
	
	@FindAll({@FindBy(xpath="//select[@name='wmedlmervices.wsTreatMode']"),@FindBy(xpath="//select[@id='sel_treatMode']")})
	WebElement treatment_Mode_Dropdown;
	
	public WebElement treatment_Mode_Dropdown() {
		return treatment_Mode_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='id_prov_treat_Code']"),@FindBy(xpath="(//input[@name='wmedlmervices.wsProvTreatCode'])[1]")})
	WebElement Provider_Treatment_Code_Field;
	
	public WebElement Provider_Treatment_Code_Field() {
		return Provider_Treatment_Code_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='id_prov_treat_desc']"),@FindBy(xpath="(//input[@name='wmedlmervices.wsProvTreatDesc'])[1]")})
	WebElement Provider_Treatment_Desc_Field;
	
	public WebElement Provider_Treatment_Desc_Field() {
		return Provider_Treatment_Desc_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='ins_treat_desc']"),@FindBy(xpath="//input[@name='wmedlmervices.mcdInsTreatDesc']")})
	WebElement ins_Treatment_Code;
	
	public WebElement ins_Treatment_Code() {
		return ins_Treatment_Code;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='txt_wsEstAmt']"),@FindBy(xpath="//input[@name='wmedlmervices.wsEstAmt']")})
	WebElement estimate_Amount_Field;
	
	public WebElement estimate_Amount_Field() {
		return estimate_Amount_Field;
	}
	
	@FindAll({@FindBy(xpath="(//button[contains(text(),'Adjudicate')])[1]"),@FindBy(xpath="(//button[@class='btn btn-greensea btn-sm'])[1]")})
	WebElement adjudicate_Button;
	public WebElement adjudicate_Button() {
		return adjudicate_Button;
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
	
	@FindAll({@FindBy(xpath="//table[@id='invoices_tbl']//tbody[1]//tr[1]//td[1]//span[1]")})
	WebElement get_Claim_Num;
	
	public WebElement get_Claim_Num() {
		return get_Claim_Num;
	}
	
	@FindAll({@FindBy(xpath="//button[@id='btn_track_back']"),@FindBy(xpath="")})
	WebElement back_Button;
	
	public WebElement back_Button() {
		return back_Button;
	}
	
	@FindAll({@FindBy(xpath="//td[@id='gross_amt_tot']")})
	WebElement get_Total_Gross_Amount;
	
	public WebElement get_Total_Gross_Amount() {
		return get_Total_Gross_Amount;
	}
	@FindAll({@FindBy(xpath="//input[@id='apprBatch_submit']"),@FindBy(xpath="//input[@value='Approve Batch']")})
	WebElement approve_Batch_Button;
	
	public WebElement approve_Batch_Button() {
		return approve_Batch_Button;
	}
	@FindAll({@FindBy(xpath="//a[@class='btn btn-greensea btn-sm btn-blue pull-left']")})
	WebElement Ref_Search_button;
	public WebElement Ref_Search_button() {
		return Ref_Search_button;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='services_tbl']//tbody[1]//tr[1]//td[12]//span//b")})
	WebElement get_Provider_Claim_Status;
	
	public WebElement get_Provider_Claim_Status() {
		return get_Provider_Claim_Status;
	}
	
	@FindAll({@FindBy(xpath="//button[@title='Appeal']"),@FindBy(xpath="//button[text()=' Appeal']")})
	WebElement Provider_Claim_Appeal_Menu;
	
	public WebElement Provider_Claim_Appeal_Menu() {
		return Provider_Claim_Appeal_Menu;
	}
	@FindAll({@FindBy(xpath="//i[@title='Ref. File Format']"),@FindBy(xpath="//i[contains(text(),'Ref. File Format')]")})
	WebElement download_Ref_File_Format;
	
	public WebElement download_Ref_File_Format() {
		return download_Ref_File_Format;
	}
	
	@FindAll({@FindBy(xpath="//span[@class='btn btn-file btn-greensea btn-sm']"),@FindBy(xpath="(//div[@data-provides='fileupload'])[1]")})
	WebElement upload_Appeal_File;
	public WebElement upload_Appeal_File() {
		return upload_Appeal_File;
	}
	@FindAll({@FindBy(xpath="//button[contains(text(),'Upload')]"),@FindBy(xpath="(//button[@class='btn btn-greensea btn-sm'])[2]")})
	WebElement upload_Button;
	public WebElement upload_Button() {
		return upload_Button;
	}
	@FindAll({@FindBy(xpath="//span[@id='spans_passCount']"),@FindBy(xpath="")})
	WebElement get_Pass_Count;
	public WebElement get_Pass_Count() {
		return get_Pass_Count;
	}
	
	@FindAll({@FindBy(xpath="//span[@id='spans_failCount']")})
	WebElement get_Failed_Count;
	public WebElement get_Failed_Count() {
		return get_Failed_Count;
	}
	@FindAll({@FindBy(xpath="//button[@id='btn_appeal']"),@FindBy(xpath="//button[@title='Appeal']")})
	WebElement submit_Appeal_button;
	public WebElement submit_Appeal_button() {
		return submit_Appeal_button;
	}
	@FindAll({@FindBy(xpath="//table[@id='appealTrackingTbl']//tbody[1]//tr[1]//td[1]")})
	WebElement get_Provider_ref_No;
	
	public WebElement get_Provider_ref_No() {
		return get_Provider_ref_No;
	}
	
	@FindBy(xpath="//table[@id='appealTrackingTbl']//tbody[1]//tr[1]//td[2]")
	WebElement get_Appeal_Tracking_Ref_Num;
	public WebElement get_Appeal_Tracking_Ref_Num() {
		return get_Appeal_Tracking_Ref_Num;
	}
	
	@FindBy(xpath="//table[@id='appealTrackingTbl']//tbody[1]//tr[1]//td[3]//span//b")
	WebElement get_Appeal_Tracking_Status;
	public WebElement get_Appeal_Tracking_Status() {
		return get_Appeal_Tracking_Status;
	}
	
	@FindAll({@FindBy(xpath="//textarea[@id='mbAppealRemarks']"),@FindBy(xpath="//textarea[@name='medClmMasterBantch.mbAppealRemarks']")})
	WebElement Appeal_Remarks_Field;
	
	public WebElement Appeal_Remarks_Field() {
		return Appeal_Remarks_Field;
	}
	@FindAll({@FindBy(xpath="//button[@id='btn_locked_yes']"),@FindBy(xpath="//button[contains(text(),'Process')]")})
	WebElement Appeal_Process_button;
	
	public WebElement Appeal_Process_button() {
		return Appeal_Process_button;
	}
	
	@FindBy(xpath="((//div[@col-id='mcaServiceId'])[2]//div//span[1])[1]")
	WebElement appeal_Claim_Checkbox;
	
	public WebElement appeal_Claim_Checkbox() {
		return appeal_Claim_Checkbox;
	}
	@FindAll({@FindBy(xpath="//button[@id='btn_approve']"),@FindBy(xpath="(//button[@class='btn btn-rounded-20 btn-default btn-sm'])[2]")})
	WebElement approve_Button;
	
	public WebElement approve_Button() {
		return approve_Button;
	}
	
	@FindAll({@FindBy(xpath="(//div[@col-id='mcaAppealSts'])[2]//span//b")})
	WebElement appeal_Claim_Status;
	
	public WebElement appeal_Claim_Status() {
		return appeal_Claim_Status;
	}
	@FindAll({@FindBy(xpath="//button[@id='btn_cmpl_appl']"),@FindBy(xpath="//button[text()=' Complete Appeal ']")})
	WebElement complete_Appeal_Button;
	public WebElement complete_Appeal_Button() {
		return complete_Appeal_Button;
	}
	
	@FindAll({@FindBy(xpath="//button[@id='btn_appr_appl']"),@FindBy(xpath="//button[text()=' Approve Appeal ']")})
	WebElement Approve_Appeal_Button;
	public WebElement Approve_Appeal_Button() {
		return Approve_Appeal_Button;
	}
	@FindAll({@FindBy(xpath="//textarea[@id='matser_batch_appl_remarks']"),@FindBy(xpath="//textarea[@name='medClmAppeal.mcaApproveRemarks']")})
	WebElement Appeal_Approval_Remarks;
	public WebElement Appeal_Approval_Remarks() {
		return Appeal_Approval_Remarks;
	}
	@FindAll({@FindBy(xpath="(//button[@id='btn_close'])[1]"),@FindBy(xpath="(//button[contains(text(),'Approve')])[3]")})
	WebElement Appeal_Approve_Button;
	
	public WebElement Appeal_Approve_Button() {
		return Appeal_Approve_Button;
	}
	
	@FindAll({@FindBy(xpath="//span[text()=' Batch Tracking']")})
	WebElement batch_tracking_SubMenu;
	public WebElement batch_tracking_SubMenu() {
		return batch_tracking_SubMenu;
	}
	
	@FindAll({@FindBy(xpath="//button[@title='Rejected Service Excel Download']"),@FindBy(xpath="//button[contains(text(),'Rejected Services')]")})
	WebElement Rejected_Ref_File;
	public WebElement Rejected_Ref_File() {
		return Rejected_Ref_File;
	}
	
	@FindAll({@FindBy(xpath="//span[@id='proc_rej_fc']")})
	WebElement get_Rejected_Amount;
	public WebElement get_Rejected_Amount() {
		return get_Rejected_Amount;
	}
	
	@FindAll({@FindBy(xpath="//span[text()=' Appeal Tracking']")})
	WebElement Appeal_Tracking_Submenu;
	public WebElement Appeal_Tracking_Submenu() {
		return Appeal_Tracking_Submenu;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='batches_tbl']//tbody[1]//tr[2]//td[1]")})
	WebElement get_Appeal_Batch_Num;
	
	public WebElement get_Appeal_Batch_Num() {
		return get_Appeal_Batch_Num;
	}
	
	@FindAll({@FindBy(xpath="//span[@id='int_net_fc']")})
	WebElement get_Intimated_FC;
	
	public WebElement get_Intimated_FC() {
		return get_Intimated_FC;
	}
	
	@FindAll({@FindBy(xpath="//span[@id='proc_net_fc']")})
	WebElement get_Processed_FC;
	
	public WebElement get_Processed_FC() {
		return get_Processed_FC;
	}
	
	@FindAll({@FindBy(xpath="//button[contains(text(),'Upload')]"),@FindBy(xpath="(//button[@class='btn btn-greensea btn-sm'])[1]")})
	WebElement upload_Batch_Button;
	public WebElement upload_Batch_Button() {
		return upload_Batch_Button;
	}
	
	@FindAll({@FindBy(xpath="//h3[contains(text(),'Master Batch')]//strong"),@FindBy(xpath="//strong[@class='text-greensea']")})
	WebElement get_Master_Batch_Number;
	
	public WebElement get_Master_Batch_Number() {
		return get_Master_Batch_Number;
	}

	@FindAll({@FindBy(xpath="(//button[@class='btn btn-warning btn-sm'])[1]"),@FindBy(xpath="//button[contains(text(),'Close')]")})
	WebElement close_Batch_Button;
	
	public WebElement close_Batch_Button() {
		return close_Batch_Button;
	}
	
	@FindAll({@FindBy(xpath="//span[@id='span_passCount']")})
	WebElement MDS_File_Pass_Count;
	
	public WebElement MDS_File_Pass_Count() {
		return MDS_File_Pass_Count;
	}
	
	@FindAll({@FindBy(xpath="//div[contains(text(),'Gross Amount')]//following-sibling::div[1]")})
	WebElement get_MDS_Gross_Amount;
	public WebElement get_MDS_Gross_Amount() {
		return get_MDS_Gross_Amount;
	}
	
	@FindAll({@FindBy(xpath="//div[contains(text(),'Net Payable')]//following-sibling::div[1]")})
	WebElement get_MDS_Net_Payable_Amount;
	
	public WebElement get_MDS_Net_Payable_Amount() {
		return get_MDS_Net_Payable_Amount;
	}
	
	@FindAll({@FindBy(xpath="//td[@id='net_amt_tot']")})
	WebElement net_Total_Amount;
	public WebElement net_Total_Amount() {
		return net_Total_Amount;
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
	
//	M23090006193
	
}
