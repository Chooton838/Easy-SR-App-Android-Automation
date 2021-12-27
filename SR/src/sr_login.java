import java.util.Scanner;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class sr_login {

	public static void main(AndroidDriver<MobileElement> driver, Scanner sc) throws InterruptedException {
		
		driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
		Thread.sleep(2000);
		
		driver.findElementById("com.sslwireless.srapp:id/btnSetEngLang").click();
		Thread.sleep(5000);
		
		/*System.out.println("Please Enter the Phone Number: ");
		String phone_number = sc.nextLine();
				
		System.out.println("Please Enter the PIN: ");
		String password = sc.nextLine();*/
		
		String phone_number = "01888000007";
		String password = "12345";
		
		driver.findElementById("com.sslwireless.srapp:id/evMobile").setValue(phone_number);
		driver.findElementById("com.sslwireless.srapp:id/evPin").setValue(password);
		driver.findElementById("com.sslwireless.srapp:id/btnLogin").click();
		Thread.sleep(5000);
		
		driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
		Thread.sleep(3000);
		
		System.out.println("Welcome to The Easy SR App");
		
		System.out.println(driver.findElementById("com.sslwireless.srapp:id/tvQuasemServices").getText());
		
	}
}
