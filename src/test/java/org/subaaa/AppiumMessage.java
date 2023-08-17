package org.subaaa;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumMessage {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "Galaxy S21 FE 5G");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "13");
		dc.setCapability("appPackage", "com.samsung.android.messaging");
		dc.setCapability("appActivity", "com.samsung.android.messaging.ui.view.main.WithActivity");
		URL u=new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(u,dc);
		Thread.sleep(5000);
        MobileElement findElement = driver.findElement(By.id("com.samsung.android.messaging:id/fab"));
        findElement.click();
        MobileElement findElement2 = driver.findElement(By.id("com.samsung.android.messaging:id/recipients_editor_to"));
        findElement2.sendKeys("Naveen GT");
        MobileElement findElement3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout"));
        findElement3.click();
        MobileElement findElement4 = driver.findElement(By.id("com.samsung.android.messaging:id/message_edit_text"));
        findElement4.click();
        findElement4.sendKeys("Hi");
        MobileElement findElement5 = driver.findElement(By.id("com.samsung.android.messaging:id/send_button_icon"));
        findElement5.click();
	}

}
