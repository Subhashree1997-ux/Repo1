package org.subaaa;

import java.awt.Dimension;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AmazonAutomation{
	static AppiumDriver<MobileElement> driver;

	public static List<MobileElement> locateElements() {
		List<MobileElement> findElements = driver
				.findElements(By.xpath("//android.view.View[@content-desc=\"Spigen Ultra Hybrid Magfit Back"
						+ " Cover Case Compatible with MagSafe Designed for iPhone 14 Pro Max (TPU + Poly Carbonate | Deep Purple)\"]/android.widget.TextView"));
		return findElements;
	}

	public static void verticalScroll() {
		org.openqa.selenium.Dimension d = driver.manage().window().getSize();
		int height = d.getHeight();
		Double anchor = height * 0.5;
		Double endPoint = height * 0.25;
		int start = anchor.intValue();
		int ending = endPoint.intValue();
		TouchAction tc = new TouchAction(driver); 
		tc.press(PointOption.point(0, start)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
				.moveTo(PointOption.point(0, ending)).release().perform();
	}
	public static void performScroll() {
		while(locateElements().size()==0) {
			verticalScroll();
			}
		if(locateElements().size()!=0) {
			locateElements().get(0).click();
	}}

	
}
