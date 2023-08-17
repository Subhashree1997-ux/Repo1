package org.subaaa;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DialerAutomation {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "Galaxy S21 FE 5G");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "13");
		dc.setCapability("appPackage", "com.samsung.android.dialer");
		dc.setCapability("appActivity", "com.samsung.android.dialer.DialtactsActivity");
		URL u=new URL("http://0.0.0.0:4723/wd/hub");
        AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(u,dc);
        Thread.sleep(4000);
//        MobileElement findElement = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Select English\"]"));
//        findElement.click();
//        MobileElement findElement2 = driver.findElement(By.xpath("//*[@class='android.widget.Button']"));
//        findElement2.click();
        MobileElement findElement = driver.findElement(By.xpath("//*[@text='8']"));
        findElement.click();
        Thread.sleep(3000);
        MobileElement findElement2 = driver.findElement(By.xpath("(//*[@class='android.widget.TextView'])[16]"));
        findElement2.click();
        MobileElement findElement3 = driver.findElement(By.xpath("//*[@text='2']"));
        findElement3.click();
        MobileElement findElement4 = driver.findElement(By.xpath("//*[@text='5']"));
        findElement4.click();
        MobileElement findElement5 = driver.findElement(By.xpath("//*[@text='8']"));
        findElement5.click();
        MobileElement findElement6 = driver.findElement(By.xpath("//*[@text='2']"));
        findElement6.click();
        MobileElement findElement7 = driver.findElement(By.xpath("//*[@text='8']"));
        findElement7.click();
        MobileElement findElement8 = driver.findElement(By.xpath("//*[@text='4']"));
        findElement8.click();
        MobileElement findElement9 = driver.findElement(By.xpath("//*[@text='6']"));
        findElement9.click();
        MobileElement findElement10 = driver.findElement(By.xpath("//*[@text='8']"));
        findElement10.click();
        MobileElement findElement11 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Call button\"]/android.widget.ImageView"));
        findElement11.click();
            
	}

}
