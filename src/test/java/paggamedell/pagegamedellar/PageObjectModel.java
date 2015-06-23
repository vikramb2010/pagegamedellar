package paggamedell.pagegamedellar;
 

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

// Import package pageObject.*
 
public class PageObjectModel {
 
   private static WebDriver driver = null;
 
   public static void main(String[] args) throws InterruptedException, IOException {
 
     driver = new FirefoxDriver(); 
 
     //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
     driver.get("https://my.gameduell.com/gd/");
     driver.manage().window().maximize();
     ReadProperty prop = new ReadProperty();
     Home_Page.new_Gamer(driver).click();
     
     LogIn_Page.txtbx_UserName(driver).sendKeys(prop.getString("username"));
 
     LogIn_Page.txtbx_Password(driver).sendKeys(prop.getString("password"));
 
     LogIn_Page.txtbx_Email(driver).sendKeys(prop.getString("email"));
     
     Thread.sleep(2000);
     
     LogIn_Page.btn_LogIn(driver).click();
 
     System.out.println(" Login Successfully, now it is the time to Validate");
 
     
     Thread.sleep(3000);
     
     LogIn_Page.checkTab(driver).click();
     
     boolean bl = LogIn_Page.checkDivText(driver,"My GameDuell overview");
     
     Assert.assertTrue(bl);
     
     if(bl == true){
    	 System.out.println("Found the My GameDuell overview.....");
     }
     
     Home_Page.lnk_LogOut(driver).click();

     LogIn_Page.txtbx_UserNameLogin(driver).sendKeys(prop.getString("username"));
     
     LogIn_Page.txtbx_PasswordLogin(driver).sendKeys(prop.getString("password"));
     
     Home_Page.lnk_LogIn(driver).click();
     
     boolean burl = Home_Page.findUrl(driver,"/gd/emailManagement/emailValidation.xhtml");
     
     Assert.assertTrue(burl);
     
     if(burl == true){
    	 System.out.println("URL is matching - /gd/emailManagement/emailValidation.xhtml");
     }
     
     driver.quit();
 
     }
 
}