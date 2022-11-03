package commonUtils;

import java.io.IOException;
import java.util.Properties;
import constantProperties.constants;

public class utils {


	private static utils initiateUtils;
	private utils(){

	}
	public static utils getUtils(){
		if (initiateUtils==null) {
			initiateUtils=new utils();
		}
		return initiateUtils;
	}


	Properties properties;

	public  void loadProperties() throws IOException {

		properties=new Properties();
		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		constants.browser= properties.getProperty("Browser");
		constants.url= properties.getProperty("Url");
		constants.driverLocation= properties.getProperty("DriverLocation");
		constants.username= properties.getProperty("Username");
		constants.password= properties.getProperty("Password");



	}

}
