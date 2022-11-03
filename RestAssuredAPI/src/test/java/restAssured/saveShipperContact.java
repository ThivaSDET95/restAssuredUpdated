package restAssured;

import java.util.List;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

public class saveShipperContact {

	private String JobTitle;
	private String Contact_Name;
	private saveShipperContactPhone Phone;
	private String Email;
	private List<Object> lstPhoneno;
	private String AccountGuid;
	private int AccountId;
	public String getJobTitle() {
		return JobTitle;
	}
	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}
	public String getContact_Name() {
		return Contact_Name;
	}
	public void setContact_Name(String contact_Name) {
		Contact_Name = contact_Name;
	}
	public saveShipperContactPhone getPhone() {
		return Phone;
	}
	public void setPhone(saveShipperContactPhone phone) {
		Phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public List<Object> getLstPhoneno() {
		return lstPhoneno;
	}
	public void setLstPhoneno(List<Object> lstPhoneno) {
		this.lstPhoneno = lstPhoneno;
	}
	public String getAccountGuid() {
		return AccountGuid;
	}
	public void setAccountGuid(String accountGuid) {
		AccountGuid = accountGuid;
	}
	public int getAccountId() {
		return AccountId;
	}
	public void setAccountId(int accountId) {
		AccountId = accountId;
	}
	
	
}
