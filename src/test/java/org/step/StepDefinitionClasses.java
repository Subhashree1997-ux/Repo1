package org.step;

import java.net.MalformedURLException;
import org.base.BaseClass;
import org.subaaa.AmazonClass;
import org.subaaa.AmazonHomePage;

import io.cucumber.java.en.*;

public class StepDefinitionClasses extends BaseClass{
	@Given("User navigates to amazon app with {string} and {string} and {string} and {string} and {string}")
	public void tc01(String string, String string2, String string3, String string4, String string5) {
	    appLaunch(string, string2, string3, string4, string5);
	    
	}
	@When("User clicks on the language")
	public void user_clicks_on_the_language() {
	    System.out.println("User Clicks on Language");
	}
	@When("User clicks on the continue button")
	public void user_clicks_on_the_continue_button() {
		 System.out.println("User Clicks on LoginButton");
	    
	}
	@When("User clicks on the skip sign in button")
	public void user_clicks_on_the_skip_sign_in_button() {
	    
	    System.out.println("User clicks on the skip sign in button");
	}
	@When("User enters {string} in search box")
	public void user_enters_in_search_box(String string) throws InterruptedException, MalformedURLException {
	    	AmazonHomePage ac=new AmazonHomePage();
		    ac.AmazonHomePageFunctions(string);
		
		}
	@When("User clicks on the iphone fourteen pro max on dropdown")
	public void user_clicks_on_the_iphone_fourteen_pro_max_on_dropdown() {
	    System.out.println("User clicks on the iphone fourteen pro max on dropdown");
	}
	@When("User clicks on the product to be located")
	public void user_clicks_on_the_product_to_be_located() {
	    System.out.println("User clicks on the product to be located");
	    
	}
	@Then("User performs the vertical Scroll")
	public void user_performs_the_vertical_scroll(){
	   System.out.println("VerticalScrollSuccessfullyPerformed");
	    
	}




}
