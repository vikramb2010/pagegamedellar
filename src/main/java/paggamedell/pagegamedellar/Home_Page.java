package paggamedell.pagegamedellar;

import org.openqa.selenium.By;

 
    import org.openqa.selenium.WebDriver;
 
    import org.openqa.selenium.WebElement;
 
public class Home_Page {
 
    private static WebElement element = null;
 
public static WebElement new_Gamer(WebDriver driver){
 
    element = driver.findElement(By.id(ReadProperty.newgamer1));
 
    return element;
 
    }
 
public static WebElement lnk_LogOut(WebDriver driver){
 
    element = driver.findElement(By.id(ReadProperty.logout));
 
return element;
 
    }

public static WebElement lnk_LogIn(WebDriver driver) {
    
	element = driver.findElement(By.id(ReadProperty.login));
    
    return element;
}

public static boolean findUrl(WebDriver driver, String url) {
	
	if( driver.getCurrentUrl().indexOf(url) >= 0)
		return true;
	
	return false;
	
}
 
}