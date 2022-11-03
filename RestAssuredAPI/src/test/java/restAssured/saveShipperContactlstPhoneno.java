package restAssured;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class saveShipperContactlstPhoneno {
	
private String phoneno;
private int phonenoType;
private Boolean IsActive;
public String getPhoneno() {
	return phoneno;
}
public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}
public int getPhonenoType() {
	return phonenoType;
}
public void setPhonenoType(int phonenoType) {
	this.phonenoType = phonenoType;
}
public Boolean getIsActive() {
	return IsActive;
}
public void setIsActive(Boolean isActive) {
	IsActive = isActive;
}


	

}
