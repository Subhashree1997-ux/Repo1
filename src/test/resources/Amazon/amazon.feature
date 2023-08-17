Feature: Validating the Amazon App
Scenario: Validation of vertical scroll of Amazon App
Given User navigates to amazon app with "Galaxy S21 FE 5G" and "Android" and "13" and "in.amazon.mShop.android.shopping" and "com.amazon.mShop.splashscreen.StartupActivity"
When User clicks on the language
And User clicks on the continue button
And User clicks on the skip sign in button
And User enters "iphone 14 pro max" in search box
And User clicks on the iphone fourteen pro max on dropdown
And User clicks on the product to be located
Then User performs the vertical Scroll
