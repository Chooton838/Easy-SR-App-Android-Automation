import java.util.Scanner;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class sr_add_new_retailer {

	public static void main(AndroidDriver<MobileElement> driver, Scanner sc) throws InterruptedException {
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.widget.LinearLayout[3]/android.widget.ImageView").click();
		Thread.sleep(2000);
		
		//Retailer Name
		System.out.println("Retailer Name: ");
		String r_name = sc.nextLine();
		driver.findElementById("com.sslwireless.srapp:id/evRetailerName").setValue(r_name);
		Thread.sleep(1000);
		
		//Retailer Owner Name
		System.out.println("Retailer Owner Name: ");
		String rw_name = sc.nextLine();
		driver.findElementById("com.sslwireless.srapp:id/evName").setValue(rw_name);
		Thread.sleep(1000);
		
		//Mobile No
		System.out.println("Mobile No.: ");
		String r_mobile_no = sc.nextLine();
		driver.findElementById("com.sslwireless.srapp:id/evRetailerMobileNo").setValue(r_mobile_no);
		Thread.sleep(1000);
		
		//Location
		System.out.println("Location Address: ");
		String location = sc.nextLine();
		driver.findElementById("com.sslwireless.srapp:id/evAddress").setValue(location);
		Thread.sleep(1000);
				
		//NID
		System.out.println("NID: ");
		String nid = sc.nextLine();
		driver.findElementById("com.sslwireless.srapp:id/evNid").setValue(nid);
		Thread.sleep(1000);
		
		//Route
		System.out.println("Select Route: ");
		driver.findElementById("com.sslwireless.srapp:id/tvRouteList").click();
		System.out.println(driver.findElementById("com.sslwireless.srapp:id/md_text_title").getText());
		
		
		Thread.sleep(1000);
		

	}

}
