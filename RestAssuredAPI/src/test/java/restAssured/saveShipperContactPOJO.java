package restAssured;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class saveShipperContactPOJO {

	public static void main(String[] args) throws IOException {
		
		saveShipperContact save=new saveShipperContact();
		
		
		save.setJobTitle("CFO");
		
		save.setContact_Name("KathikaDev");
		
		saveShipperContactPhone savePh=new saveShipperContactPhone();
		savePh.setPhoneNo(null);
		savePh.setPhoneType(null);
		savePh.setExtension(null); 
		save.setPhone(savePh);
		
		save.setEmail("iamthiv178@testmail.com");
		List<Object> listIsPhone=new ArrayList<Object>();
//		List<saveShipperContactlstPhoneno> phoneLis=new ArrayList<saveShipperContactlstPhoneno>();
		saveShipperContactlstPhoneno istPho=new saveShipperContactlstPhoneno();
		
		istPho.setPhoneno("8767577257");
		istPho.setPhonenoType(2);
		istPho.setIsActive(true);
		listIsPhone.add(istPho);
		save.setLstPhoneno(listIsPhone);
	

		save.setAccountGuid("3a8b8aae-ce15-47bc-87cb-fe13489bac8f");
		save.setAccountId(87347);
		
		
		
		//object mapper
		
		ObjectMapper om=new ObjectMapper();
//		String pretty= om.writerWithDefaultPrettyPrinter().writeValueAsString(save);
//		System.out.println(pretty);
		File jsonFile=new File("result.json");
		om.writerWithDefaultPrettyPrinter().writeValue(jsonFile, save);
		
	}

}
