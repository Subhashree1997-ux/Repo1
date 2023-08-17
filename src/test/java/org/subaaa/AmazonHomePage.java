package org.subaaa;

import java.net.MalformedURLException;
import java.net.URL;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AmazonHomePage extends BaseClass {
	public AmazonHomePage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Select English\"]")
	private MobileElement selectLang;

	public MobileElement getSelectLang() {
		return selectLang;
	}

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button")
	private MobileElement clickContinue;

	public MobileElement getClickContinue() {
		return clickContinue;
	}

	@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[3]")
	private MobileElement skipSignIn;

	public MobileElement getSkipSignIn() {
		return skipSignIn;
	}

	@AndroidBy(id = "in.amazon.mShop.android.shopping:id/chrome_search_hint_view")
	private MobileElement searchBox;

	public MobileElement getSearchBox() {
		return searchBox;
	}

	@AndroidFindBy(id = "in.amazon.mShop.android.shopping:id/rs_search_src_text")
	public MobileElement searchText;

	public MobileElement getSearchText() {
		return searchText;
	}

	@AndroidFindBy(xpath = "\"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.widget.Button[2]")
	private MobileElement clickText;

	public MobileElement getClickText() {
		return clickText;
	}

	public void setSelectLang(MobileElement selectLang) {
		this.selectLang = selectLang;
	}

	public void setClickContinue(MobileElement clickContinue) {
		this.clickContinue = clickContinue;
	}

	public void setSkipSignIn(MobileElement skipSignIn) {
		this.skipSignIn = skipSignIn;
	}

	public void setSearchBox(MobileElement searchBox) {
		this.searchBox = searchBox;
	}

	public void setSearchText(MobileElement searchText) {
		this.searchText = searchText;
	}

	public void setClickText(MobileElement clickText) {
		this.clickText = clickText;
	}

	public void AmazonHomePageFunctions(String text) throws MalformedURLException, InterruptedException {
		Thread.sleep(5000);
		MobileElement selectLang = getSelectLang();
		click(selectLang);
		Thread.sleep(5000);
		MobileElement clickContinue2 = getClickContinue();
		click(clickContinue2);
		Thread.sleep(5000);
		MobileElement skipSignIn2 = getSkipSignIn();
		click(skipSignIn2);
		Thread.sleep(5000);
		MobileElement searchBox2 = getSearchBox();
		click(searchBox2);
		Thread.sleep(5000);
		MobileElement searchText2 = getSearchText();
		enterText(searchText2, text);
		Thread.sleep(5000);
		MobileElement clickText2 = getClickText();
		click(clickText2);
		performScroll();

	}
}
