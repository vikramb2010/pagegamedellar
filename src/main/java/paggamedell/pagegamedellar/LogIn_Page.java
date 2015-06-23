package paggamedell.pagegamedellar;

import org.openqa.selenium.*;
 
public class LogIn_Page {
 
        private static WebElement element = null;
 
    public static WebElement txtbx_UserName(WebDriver driver){
 
         element = driver.findElement(By.id(ReadProperty.username));
 
         return element;
 
         }
 
     public static WebElement txtbx_Password(WebDriver driver){
 
         element = driver.findElement(By.id(ReadProperty.password));
 
         return element;
 
         }

     public static WebElement txtbx_Email(WebDriver driver){
    	 
         element = driver.findElement(By.id(ReadProperty.email));
 
         return element;
 
         }
     
     public static WebElement btn_LogIn(WebDriver driver){
 
         element = driver.findElement(By.id(ReadProperty.registrationButton));
 
         return element;
 
         }

	public static WebElement checkTab(WebDriver driver) {
		
        element = driver.findElement(By.id(ReadProperty.topNaviMygdLink));
		
		return element;
	}

	public static boolean checkDivText(WebDriver driver, String data) {
		
		
				
        element = driver.findElement(By.xpath(ReadProperty.datatext));
		
        String str = element.getAttribute("innerHTML");
        
        if(str.indexOf(data) >= 0)
        	return true;
        
		return false;
	
	}

	public static WebElement txtbx_UserNameLogin(WebDriver driver) {

		element = driver.findElement(By.name(ReadProperty.j_username));
        
        return element;

	}

	public static WebElement txtbx_PasswordLogin(WebDriver driver) {

		element = driver.findElement(By.name(ReadProperty.j_password));
        
        return element;
	}
 
}