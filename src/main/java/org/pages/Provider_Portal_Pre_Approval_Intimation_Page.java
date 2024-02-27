package org.pages;

import org.common.BasicFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Provider_Portal_Pre_Approval_Intimation_Page extends BasicFunctions{
	
	public Provider_Portal_Pre_Approval_Intimation_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(xpath="//a[contains(text(),'Pre Approvals')]")})
	WebElement pre_Approval_Menu;

	public WebElement pre_Approval_Menu() {
		return pre_Approval_Menu;
	}
	
	@FindAll({@FindBy(xpath="//a[@class='clickhere']"),@FindBy(xpath="//a[text()='Click Here']")})
	WebElement click_Here_Button;
	
	public WebElement click_Here_Button() {
		return click_Here_Button;
	}
	
	@FindAll({@FindBy(xpath="//button[@data-id='sel_search_member']"),@FindBy(xpath="//select[@name='searchBy']")})
	WebElement search_Member_Dropdown;
	
	public WebElement search_Member_Dropdown() {
		return search_Member_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//input[@aria-label='Search']"),@FindBy(xpath="//input[@role='textbox']")})
	WebElement search_Member_Field;
	
	public WebElement search_Member_Field() {
		return search_Member_Field;
	}
	
	@FindAll({@FindBy(xpath="(//span[text()='Member Id'])[1]")})
	WebElement member_Id_Option;
	
	public WebElement member_Id_Option() {
		return member_Id_Option;
	}
	
	@FindAll({@FindBy(xpath="//input[@name='searchValue']"),@FindBy(xpath="//input[@id='searchValue']")})
	WebElement member_Id_Field;
	public WebElement member_Id_Field() {
		return member_Id_Field;
	}
	
	@FindAll({@FindBy(xpath="//button[text()=' Search']"),@FindBy(xpath="(//button[@class='policy_section_btn btn-sm mr-10'])[1]")})
	WebElement search_Button;
	
	public WebElement search_Button() {
		return search_Button;
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
	
	@FindAll({@FindBy(xpath="//select[@id='noOfDays']"),@FindBy(xpath="//select[@name='preApproval.paAdmnDays']")})
	WebElement admission_Period_Dropdown;
	
	public WebElement admission_Period_Dropdown() {
		return admission_Period_Dropdown;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='illnessDuration']"),@FindBy(xpath="//input[@name='preApproval.paIllnessDuration']")})
	WebElement present_illness_Duration;
	
	public WebElement present_illness_Duration() {
		return present_illness_Duration;
	}
	
	@FindAll({@FindBy(xpath="//textarea[@id='medicalHistory']"),@FindBy(xpath="//textarea[@name='preApproval.paPastMedicalHistory']")})
	WebElement past_Medical_History_Field;
	
	public WebElement past_Medical_History_Field() {
		return past_Medical_History_Field;
	}
	
	@FindAll({@FindBy(xpath="//textarea[@id='remarks']"),@FindBy(xpath="//textarea[@name='preApproval.paIllnessDetails']")})
	WebElement present_Illness_Details;
	
	public WebElement present_Illness_Details() {
		return present_Illness_Details;
	}
	
	@FindAll({@FindBy(xpath="//h1[text()='Agreed Treatments']//following::div[1]//div//button[1]")})
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
	@FindAll({@FindBy(xpath="//button[contains(text(),'Save & Close')]"),@FindBy(xpath="(//button[@class='btn btn-greensea btn-sm'])[2]")})
	WebElement save_and_Close_Button;
	
	public WebElement save_and_Close_Button() {
		return save_and_Close_Button;
	}
	
	@FindAll({@FindBy(xpath="//table[@id='agreeTreatmenttbl']//tbody[1]//tr[1]//td[6]")})
	WebElement get_Agreed_Treatment_Total_Amount;
	
	public WebElement get_Agreed_Treatment_Total_Amount() {
		return get_Agreed_Treatment_Total_Amount;
	}
	
	@FindAll({@FindBy(xpath="//h1[text()='Un Agreed Treatments']//following::div[1]//div//button[1]")})
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
	@FindAll({@FindBy(xpath="//select[@id='id_toothNumber']"),@FindBy(xpath="(//select[@name='preApprTreatments.patToothNumber'])[2]")})
	WebElement tooth_Number_Dropdown;
	public WebElement tooth_Number_Dropdown() {
		return tooth_Number_Dropdown;
	}
	@FindAll({@FindBy(xpath="//input[@id='otherTreatmentTotalFc']"),@FindBy(xpath="(//input[@name='preApprTreatments.patEstAmtFc'])[2]")})
	WebElement Un_Agreed_Total;
	
	public WebElement Un_Agreed_Total() {
		return Un_Agreed_Total;
	}
	
	@FindAll({@FindBy(xpath="(//button[contains(text(),'Save & Close')])[2]")})
	WebElement save_Un_Agreed_Treatment;
	
	public WebElement save_Un_Agreed_Treatment() {
		return save_Un_Agreed_Treatment;
	}
	
	@FindBy(xpath="//table[@id='unagreeTreatmenttbl']//tbody[1]//tr[1]//td[5]")
	WebElement overall_Un_Agreed_Total_Amount;
	
	public WebElement overall_Un_Agreed_Total_Amount() {
		return overall_Un_Agreed_Total_Amount;
	}
	
	@FindAll({@FindBy(xpath="//h1[text()='Pharmacy Details']//following::div[1]//div//button[1]")})
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
	
	@FindAll({@FindBy(xpath="//input[@id='papTotal']"),@FindBy(xpath="(//input[@name='preApprTreatments.patEstAmtFc'])[3]")})
	WebElement pharmacy_total;
	
	public WebElement pharmacy_total() {
		return pharmacy_total;
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
	
	@FindAll({@FindBy(xpath="//span[@id='refiD']"),@FindBy(xpath="//b[contains(text(),'Reference ID')]//font//span")})
	WebElement get_Reference_Id;
	
	public WebElement get_Reference_Id() {
		return get_Reference_Id;
	}
	
	@FindAll({@FindBy(xpath="//button[@class='btn btn-primary dropdown-toggle']//p")})
	WebElement get_Provider_Profile_Name;
	
	public WebElement get_Provider_Profile_Name() {
		return get_Provider_Profile_Name;
	}
	
	@FindAll({@FindBy(xpath="//a[contains(text(),'Logout')]")})
	WebElement logout_Button;
	
	public WebElement logout_Button() {
		return logout_Button;
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
	
	@FindAll({@FindBy(xpath="//table[@id='tbl_preAppTrack_list']//tbody[1]//tr[1]//td[7]//span//b")})
	WebElement get_Status;
	public WebElement get_Status() {
		return get_Status;
	}
	@FindAll({@FindBy(xpath="//button[@title='Appeal']"),@FindBy(xpath="//table[@id='tbl_preAppTrack_list']//tbody[1]//tr[1]//td[10]//button[2]")})
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
	@FindAll({@FindBy(xpath="//span[@id='succ_msg']")})
	WebElement Appeal_Success_Msg;
	
	public WebElement Appeal_Success_Msg() {
		return Appeal_Success_Msg;
	}
	
	@FindAll({@FindBy(xpath="(//button[@id='btnClose'])[2]"),@FindBy(xpath="(//button[text()=' Close'])[2]")})
	WebElement close_Button;
	
	public WebElement close_Button() {
		return close_Button;
	}
	
}
