package paggamedell.pagegamedellar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.PropertyResourceBundle;

import com.beust.jcommander.ResourceBundle;

public class ReadProperty {
	
	PropertyResourceBundle bundle = null;
	public static String newgamer1 = "newHereLink";
	public static String username = "tf1";
	public static String password = "tf2";
	public static String email = "tf3";
	public static String registrationButton = "registrationButton";
	public static String datatext = "html/body/div[2]/div/div[3]/div/div[1]/div/div[2]";
	public static String topNaviMygdLink = "topNaviMygdLink";
	public static String j_username = "j_username";
	public static String j_password = "j_password";
	public static String logout = "logoutLink";
	public static String login = "loginLink";
	
	public ReadProperty() throws IOException{
		
		FileInputStream fin = new FileInputStream("credentials.txt");
		bundle = new PropertyResourceBundle(fin);
		
	}
	
	public String getString(String key)
	{
		
		return bundle.getString(key);
		
	}
	
}
