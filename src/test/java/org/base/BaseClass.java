package org.base;

import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BaseClass {
	public static AndroidDriver<MobileElement> driver;

	public static void appLaunch(String deviceName, String platformName, String platformVersion, String appPackage,
			String appActivity) { 
		try {
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability("deviceName", deviceName);
			dc.setCapability("platformName", platformName);
			dc.setCapability("platformVersion", platformVersion);
			dc.setCapability("appPackage", appPackage);
			dc.setCapability("appActivity", appActivity);
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);

		} catch (Exception e) {
		}

	}

	public static void enterText(MobileElement element, String value) {
		element.sendKeys(value);
	}

	public static void click(MobileElement element) {
		element.click();
	}

	public static List<MobileElement> locateElements() {
		List<MobileElement> findElements = driver
				.findElements(By.xpath("/android.view.View[@content-desc=\\\"Spigen Ultra Hybrid Magfit Back\"\r\n"
						+ "						+ \" Cover Case Compatible with MagSafe Designed for iPhone 14 Pro Max (TPU + Poly Carbonate | Deep Purple)\\\"]/android.widget.TextView"));
		return findElements;
	}

	public static void verticalScroll() {
		Dimension d = driver.manage().window().getSize();
		int height = d.getHeight();
		Double anchor = height * 0.5;
		Double endPoint = height * 0.25;
		int start = anchor.intValue();
		int end = endPoint.intValue();
		TouchAction tc = new TouchAction(driver);
		tc.press(PointOption.point(0, start)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
				.moveTo(PointOption.point(0, end)).release().perform();
	}

	public static void performScroll() {
		while(locateElements().size()==0) {
			verticalScroll();
			}
		if(locateElements().size()!=0) {
			locateElements().get(0).click();
		}

}
}