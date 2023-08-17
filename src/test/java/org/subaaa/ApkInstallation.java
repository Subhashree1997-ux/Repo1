package org.subaaa;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ApkInstallation {
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "Galaxy S21 FE 5G");
		dc.setCapability("platformName", "Android");
		dc.setCapability("app", "C:\\Users\\Dinesh\\Downloads\\WeTV_v5.9.5.10760_www.9apps.com_.apk");
		URL u=new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(u,dc);
		
	}

}
