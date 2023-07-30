package OrangeHRMSDemoTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utilities.BaseTest;
import allpages.HomePage;
import allpages.LoginPage;

public class HomePageNavigationsTc02 

{
	
	@Test
	public void homePageNavigationsTc02()
//	public static void main(String[] args) 
	{

		// Tester 1- addinge line -1
		// Tester 1 -addling line 2
//		
		
		// call openBrowser()
				BaseTest btest=  new BaseTest();
			     WebDriver driver=	btest.openBrowser();

		//  access logiPAge class variables + Methods		
		LoginPage  lPage =  new LoginPage(driver);
//		lPage.enter_UserName("Admin");
//		lPage.enter_Password("admin123");		
//		lPage.clickLoginBtn();
		lPage.loginToAppl("Admin", "admin123");


		// Verify Home page is dispalyed or not
		HomePage  hPage =  new HomePage(driver);
		hPage.isHomePageDisplayed();

		//  check navigate menu option

		//	navigateToAdminMenu
//		hPage.navigateToAdminMenu();		
		

		//  naviate to Pim menu
		hPage.navigateToPIMMenu();
		

		// HW Navigate to 'Leave' menu option

		// HW Navigate to 'Time' menu option

		// HW navigate to  all menu options



	}		


}
