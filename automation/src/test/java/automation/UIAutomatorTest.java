package automation;

import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIAutomatorTest extends base{
	
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement>  driver = capabilities("emulator");
		// driver.findElementByAndroidUIAutomator("attribute("value")")
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
	    
	    
	    
   }
}
