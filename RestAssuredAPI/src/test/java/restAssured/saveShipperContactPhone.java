package restAssured;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class saveShipperContactPhone {

	private String PhoneNo;
	private String PhoneType;
	private String Extension;
	
	public String getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}
	public String getPhoneType() {
		return PhoneType;
	}
	public void setPhoneType(String phoneType) {
		PhoneType = phoneType;
	}
	public String getExtension() {
		return Extension;
	}
	public void setExtension(String extension) {
		Extension = extension;
	}
	
	
	
	
	
	
}
