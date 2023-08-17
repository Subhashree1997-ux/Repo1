package org.subaaa;

import java.net.MalformedURLException;

import org.base.BaseClass;

import io.appium.java_client.MobileElement;

public class AmazonClass extends BaseClass {
	public void AmazonHomePageFunctions(String text)throws MalformedURLException, InterruptedException {
		AmazonHomePage a=new AmazonHomePage();
	    MobileElement selectLang = a.getSelectLang();
	    click(selectLang);
		Thread.sleep(5000);
        MobileElement clickContinue2 = a.getClickContinue();
		click(clickContinue2);
		MobileElement skipSignIn2 = a.getSkipSignIn();
		click(skipSignIn2);
		MobileElement searchBox2 = a.getSearchBox();
		click(searchBox2);
		MobileElement searchText2 = a.getSearchText();
		enterText(searchText2,text);
		Thread.sleep(5000);
		MobileElement clickText2 = a.getClickText();
		click(clickText2);
		performScroll();
	}

	

}
