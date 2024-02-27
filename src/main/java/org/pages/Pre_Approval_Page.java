package org.pages;

import org.common.BasicFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pre_Approval_Page extends BasicFunctions{
	
	public Pre_Approval_Page() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(xpath="//span[contains(text(),'Pre Approvals')]")})
	WebElement pre_Approvals_Menu;
	
	public WebElement pre_Approvals_Menu() {
		return pre_Approvals_Menu;
	}
	
	@FindAll({@FindBy(xpath="//span[contains(text(),'Submission')]")})
	WebElement submission_Menu;
	public WebElement submission_Menu() {
		return submission_Menu;
	}
	@FindAll({@FindBy(xpath="//select[@id='preapproval_search_form_provider']"),@FindBy(xpath="//select[@name='provider']")})
	WebElement pre_Approval_Provider_Dropdown;
	
	public WebElement pre_Approval_Provider_Dropdown() {
		return pre_Approval_Provider_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//input[@name='policyNoDesc']"),@FindBy(xpath="//input[@id='id_Desc_policyNo']")})
	WebElement policy_Number_Field;
	
	public WebElement policy_Number_Field() {
		return policy_Number_Field;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='sel_search_member']"),@FindBy(xpath="//select[@name='searchBy']")})
	WebElement search_Member_Dropdown;
	
	public WebElement search_Member_Dropdown() {
		return search_Member_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//input[@name='searchValue']"),@FindBy(xpath="//input[@id='searchValue']")})
	WebElement member_Id_Field;
	public WebElement member_Id_Field() {
		return member_Id_Field;
	}
	
	@FindAll({@FindBy(xpath="//button[contains(text(),'Search')]"),@FindBy(xpath="(//button[@class='btn btn-greensea btn-sm'])[1]")})
	WebElement search_Button;
	
	public WebElement search_Button() {
		return search_Button;
	}
	
	@FindAll({@FindBy(xpath="//div[contains(text(),'Member ID')]//following-sibling::div[1]")})
	WebElement get_Member_Id;
	
	public WebElement get_Member_Id() {
		return get_Member_Id;
	}
	
	@FindAll({@FindBy(xpath="//div[contains(text(),'Policy No')]//following-sibling::div[1]")})
	WebElement get_Policy_Number;
	
	public WebElement get_Policy_Number() {
		return get_Policy_Number;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='deductibleId']"),@FindBy(xpath="//select[@name='preApproval.paCategory']")})
	WebElement catagory_Dropdown;
	
	public WebElement catagory_Dropdown() {
		return catagory_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@name='preApproval.paServiceType']"),@FindBy(xpath="//select[@id='typeId']")})
	WebElement service_Type_Dropdown;
	
	public WebElement service_Type_Dropdown() {
		return service_Type_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='illnessId']"),@FindBy(xpath="//select[@name='preApproval.paIllness']")})
	WebElement illness_Dropdown;
	
	public WebElement illness_Dropdown() {
		return illness_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='admitDate']"),@FindBy(xpath="//input[@name='preApproval.paServiceDate']")})
	WebElement treatment_Date_Field;
	
	public WebElement treatment_Date_Field() {
		return treatment_Date_Field;
	}

	@FindAll({@FindBy(xpath="//input[@id='doctorId']"),@FindBy(xpath="//input[@name='preApproval.paDoctorName']")})
	WebElement doctor_Name_Field;
	
	public WebElement doctor_Name_Field() {
		return doctor_Name_Field;
	}
	
	@FindAll({@FindBy(xpath="//select[@name='preApproval.paPriority']"),@FindBy(xpath="//select[@id='priorityId']")})
	WebElement priority_Dropdown;
	
	public WebElement priority_Dropdown() {
		return priority_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='phoneNo']"),@FindBy(xpath="//input[@name='preApproval.paPatientMobileNo']")})
	WebElement patient_Tel_No_Field;
	
	public WebElement patient_Tel_No_Field() {
		return patient_Tel_No_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@name='preApproval.paPrimaryDiagDisc']"),@FindBy(xpath="//input[@id='txt_primaryDesc']")})
	WebElement primary_Disgnosis_Field;
	
	public WebElement primary_Disgnosis_Field() {
		return primary_Disgnosis_Field;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='paModeOfComm']"),@FindBy(xpath="//select[@name='preApproval.paModeOfComm']")})
	WebElement mode_of_Communication;
	
	public WebElement mode_of_Communication() {
		return mode_of_Communication;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='paAdmnType']"),@FindBy(xpath="//select[@name='preApproval.paAdmnType']")})
	WebElement admission_Type_Dropdown;
	public WebElement admission_Type_Dropdown() {
		return admission_Type_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="(//strong[contains(text(),'Agreed Treatments')]//following::button[1])[1]")})
	WebElement agreed_Treatment_Add_Button;
	
	public WebElement agreed_Treatment_Add_Button() {
		return agreed_Treatment_Add_Button;
	}
	@FindAll({@FindBy(xpath="//input[@id='id_treatmentCode']"),@FindBy(xpath="")})
	WebElement treatment_Code;
	
	public WebElement treatment_Code() {
		return treatment_Code;
	}
	@FindAll({@FindBy(xpath="//input[@id='treatmentQuantity']"),@FindBy(xpath="//input[@name='preApprTreatments.patQuantity']")})
	WebElement treatment_Quantity;
	
	public WebElement treatment_Quantity() {
		return treatment_Quantity;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='treatmentTotal']"),@FindBy(xpath="//input[@name='preApprTreatments.patEstAmtFc']")})
	WebElement treatment_Total;
	
	public WebElement treatment_Total() {
		return treatment_Total;
	}
	
	@FindAll({@FindBy(xpath="//button[contains(text(),'Save & Add More')]")})
	WebElement save_and_More_Button;
	
	public WebElement save_and_More_Button() {
		return save_and_More_Button;
	}
	
	@FindAll({@FindBy(xpath="//button[contains(text(),'Save & Close')]"),@FindBy(xpath="(//button[@class='btn btn-greensea btn-sm'])[2]")})
	WebElement save_and_Close_Button;
	
	public WebElement save_and_Close_Button() {
		return save_and_Close_Button;
	}
	
	@FindAll({@FindBy(xpath="//strong[contains(text(),'Un Agreed Treatments')]//following::button[1]")})
	WebElement un_Agreed_Treatment_Add_Button;
	
	public WebElement un_Agreed_Treatment_Add_Button() {
		return un_Agreed_Treatment_Add_Button;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='otherTreatmentCode']"),@FindBy(xpath="(//input[@name='preApprTreatments.patProvTreatCode'])[2]")})
	WebElement un_Agreed_Treatment_Code;
	
	public WebElement un_Agreed_Treatment_Code() {
		return un_Agreed_Treatment_Code;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='otherTreatmentDesc']"),@FindBy(xpath="(//input[@name='preApprTreatments.patProvTreatDesc'])[2]")})
	WebElement Treatment_Desc_Field;
	
	public WebElement Treatment_Desc_Field() {
		return Treatment_Desc_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='otherTreatmentAmountFc']"),@FindBy(xpath="(//input[@name='preApprTreatments.patAmtFc'])[2]")})
	WebElement un_Agreed_Treatment_Amount;
	
	public WebElement un_Agreed_Treatment_Amount() {
		return un_Agreed_Treatment_Amount;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='otherTreatmentQuantity']"),@FindBy(xpath="(//input[@name='preApprTreatments.patQuantity'])[2]")})
	WebElement un_Agreed_Treatment_Quantity;
	
	public WebElement un_Agreed_Treatment_Quantity() {
		return un_Agreed_Treatment_Quantity;
	}
	@FindAll({@FindBy(xpath="//input[@id='unagreeInsTreatCode']")})
	WebElement Ins_Treatment_Code;
	
	public WebElement Ins_Treatment_Code() {
		return Ins_Treatment_Code;
	}
	
	@FindAll({@FindBy(xpath="(//button[contains(text(),'Save & Close')])[2]")})
	WebElement save_Un_Agreed_Treatment;
	
	public WebElement save_Un_Agreed_Treatment() {
		return save_Un_Agreed_Treatment;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='agreeTreatmenttbl']//tbody[1]//tr[1]//td[6]")})
	WebElement get_Agreed_Treatments_Total_Amount;
	public WebElement get_Agreed_Treatments_Total_Amount() {
		return get_Agreed_Treatments_Total_Amount;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='unagreeTreatmenttbl']//tbody[1]//tr[1]//td[5]")})
	WebElement get_Un_Agreed_Treatment_Amount;
	
	public WebElement get_Un_Agreed_Treatment_Amount() {
		return get_Un_Agreed_Treatment_Amount;
	}
	
	@FindAll({@FindBy(xpath="//strong[contains(text(),'Pharmacy Details')]//following::button[1]")})
	WebElement pharmacy_Details_Add_Button;
	
	public WebElement pharmacy_Details_Add_Button() {
		return pharmacy_Details_Add_Button;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='papTradeName']"),@FindBy(xpath="//input[@name='preApprTreatments.patDrugName']")})
	WebElement drug_Name_Field;
	
	public WebElement drug_Name_Field() {
		return drug_Name_Field;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='papQuantity']")})
	WebElement Drug_Quantity_Field;
	
	public WebElement Drug_Quantity_Field() {
		return Drug_Quantity_Field;
	}
	@FindAll({@FindBy(xpath="(//input[@id='patDrugDuration'])[1]"),@FindBy(xpath="(//input[@name='preApprTreatments.patDrugDuration'])[1]")})
	WebElement drug_Duration;
	
	public WebElement drug_Duration() {
		return drug_Duration;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='id_dur_unit']"),@FindBy(xpath="//select[@name='preApprTreatments.patFlex04']")})
	WebElement duration_Dropdown;
	
	public WebElement duration_Dropdown() {
		return duration_Dropdown;
	}
	@FindAll({@FindBy(xpath="(//input[@id='patDrugDuration'])[2]"),@FindBy(xpath="//input[@name='preApprTreatments.patUnitValue']")})
	WebElement unit_Dose_Field;
	
	public WebElement unit_Dose_Field() {
		return unit_Dose_Field;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='id_unit_dose']"),@FindBy(xpath="//select[@name='preApprTreatments.patUnitDose']")})
	WebElement unit_Dose_Dropdown;
	
	public WebElement unit_Dose_Dropdown() {
		return unit_Dose_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='id_drug_dose']"),@FindBy(xpath="//select[@name='preApprTreatments.patDrugDosage']")})
	WebElement dosage_Frequency_Dropdown;
	
	public WebElement dosage_Frequency_Dropdown() {
		return dosage_Frequency_Dropdown;
	}
	
	
	@FindAll({@FindBy(xpath="(//button[contains(text(),'Save & Close')])[3]")})
	WebElement save_Dosage_Details;
	
	public WebElement save_Dosage_Details() {
		return save_Dosage_Details;
	}
	@FindAll({@FindBy(xpath="//table[@id='pharmacytbl']//tbody[1]//tr[1]//td[7]")})
	WebElement get_Pharmacy_Total_Amount;
	public WebElement get_Pharmacy_Total_Amount() {
		return get_Pharmacy_Total_Amount;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='preAppr_submit']"),@FindBy(xpath="//input[@id='preAppr_submit']")})
	WebElement get_Me_Approval_Button;
	
	public WebElement get_Me_Approval_Button() {
		return get_Me_Approval_Button;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='noOfDays']"),@FindBy(xpath="//select[@name='preApproval.paAdmnDays']")})
	WebElement Admission_Period_Dropdown;
	
	public WebElement Admission_Period_Dropdown() {
		return Admission_Period_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//b[contains(text(),'Reference ID')]//font")})
	WebElement get_Reference_Id;
	
	public WebElement get_Reference_Id() {
		return get_Reference_Id;
	}
	// 23090131716
	@FindAll({@FindBy(xpath="//p[@class='custom-font pb-10']")})
	WebElement get_Approval_Msg;
	public WebElement get_Approval_Msg() {
		return get_Approval_Msg;
	}
	
	@FindAll({@FindBy(xpath="//input[@value='Close']"),@FindBy(xpath="//input[@class='btn-primary btn-sm btn-greensea']")})
	WebElement close_Button;
	
	public WebElement close_Button() {
		return close_Button;
	}
	
	@FindBy(xpath="//div[text()='Provider']//following-sibling::div[1]")
	WebElement get_Provider;
	
	public WebElement get_Provider() {
		return get_Provider;
	}
	
	@FindAll({@FindBy(xpath="//div[text()='Est. Amount']//following-sibling::div[1]")})
	WebElement get_Est_Amount;
	
	public WebElement get_Est_Amount() {
		return get_Est_Amount;
	}
	@FindAll({@FindBy(xpath="//input[@id='preAppr_submit']"),@FindBy(xpath="//input[@value='Send for Review']")})
	WebElement submit_button;
	
	public WebElement submit_button() {
		return submit_button;
	}
	@FindAll({@FindBy(xpath="(//button[contains(text(),'Yes')])[1]"),@FindBy(xpath="(//button[contains(text(),'Yes')])[1]")})
	WebElement yes_Button;
	public WebElement yes_Button() {
		return yes_Button;
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
	
	
	@FindAll({@FindBy(xpath="(//span[contains(text(),'Approver Tracking')])[1]")})
	WebElement approver_Tracking_Button;
	
	public WebElement approver_Tracking_Button() {
		return approver_Tracking_Button;
	}
	
	@FindBy(xpath="//textarea[@id='justification']")
	WebElement justification_Field;
	public WebElement justification_Field() {
		return justification_Field;
	}
	
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	WebElement continue_Button;
	
	public WebElement continue_Button() {
		return continue_Button;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='agreeTreatmenttbl']//tbody//tr[1]//td[12]")})
	WebElement agreed_Treatment_Status;
	
	public WebElement agreed_Treatment_Status() {
		return agreed_Treatment_Status;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='agreeTreatmenttbl']//tbody//tr[1]//td[17]//button[1]")})
	WebElement agreed_Treatment_Approve_Button;
	public WebElement agreed_Treatment_Approve_Button() {
		return agreed_Treatment_Approve_Button;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='unagreeTreatmenttbl']//tbody//tr[1]//td[10]")})
	WebElement unagreed_Treatment_Status;
	
	public WebElement unagreed_Treatment_Status() {
		return unagreed_Treatment_Status;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='unagreeTreatmenttbl']//tbody//tr[1]//td[14]//button[1]")})
	WebElement un_agreed_Treatment_Approve_Button;
	public WebElement un_agreed_Treatment_Approve_Button() {
		return un_agreed_Treatment_Approve_Button;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='pharmacytbl']//tbody//tr[1]//td[12]")})
	WebElement pharmacy_Details_Status;
	public WebElement pharmacy_Details_Status() {
		return pharmacy_Details_Status;
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
	
	@FindAll({@FindBy(xpath="(//span[contains(text(),'Tracking')])[2]"),@FindBy(xpath="")})
	WebElement tracking_Menu;
	public WebElement tracking_Menu() {
		return tracking_Menu;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='tbl_preAppTrack_list']//tbody[1]//tr[1]//td[9]//span//b[1]")})
	WebElement get_Status;
	public WebElement get_Status() {
		return get_Status;
	}
	@FindAll({@FindBy(xpath="//button[@title='Amend']"),@FindBy(xpath="//table[@id='tbl_preAppTrack_list']//tbody[1]//tr[1]//td[14]//button[3]")})
	WebElement amend_Menu;
	public WebElement amend_Menu() {
		return amend_Menu;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='amendType']"),@FindBy(xpath="//select[@name='preApproval.paAmendType']")})
	WebElement amend_Type;
	public WebElement amend_Type() {
		return amend_Type;
	}
	@FindAll({@FindBy(xpath="//button[@id='btn_amend']")})
	WebElement amend_Button;
	
	public WebElement amend_Button() {
		return amend_Button;
	}
	
	@FindAll({@FindBy(xpath="//textarea[@id='amendReason']"),@FindBy(xpath="//textarea[@name='preApproval.paAmendReason']")})
	WebElement Amend_Reason;
	public WebElement Amend_Reason() {
		return Amend_Reason;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='id_mode_of_comm']//following::h2[1]//strong")})
	WebElement pre_Approval_Status;
	public WebElement pre_Approval_Status() {
		return pre_Approval_Status;
	}
	
	@FindAll({@FindBy(xpath="(//ul[@id='navigation']//li[2]//a[1])[1]")})
	WebElement pre_Approval;
	
	public WebElement pre_Approval() {
		return pre_Approval;
	}
	
	
}
