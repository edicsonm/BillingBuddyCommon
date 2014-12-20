package au.com.billingbuddy.porlet.common.objects;

import java.util.ResourceBundle;

public class ConfigurationPortal {
	
	public static ResourceBundle resourceBundle = ResourceBundle.getBundle("au.com.billingbuddy.porlet.properties.ConfigurationPortal");
	private static ConfigurationPortal instance;
	
	public static ConfigurationPortal getInstance() {
		if (instance == null) {
			instance = new ConfigurationPortal();
		}
		return instance;
	}
	
	public String getKey(String key){
		return resourceBundle.getString(key);
	}
	
}
