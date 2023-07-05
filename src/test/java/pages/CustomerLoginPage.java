package pages;

import base.Base;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Base {
    //Locators
    public static By textCustomerUserId = By.name("mailuid");
    public static By textCustomerPassword = By.xpath("//input[@name='pwd']");
    public static By btnCustomerLogin = By.cssSelector("input[name='login-submit']");


    //Actions
    public static void loginAsCustomer() {

        click( LandingPage.menuLogin );


        click( EmployeeLoginPage.menuCustomerLogin );


        sendKeys( CustomerLoginPage.textCustomerUserId , "david@gmail.com");


        sendKeys( CustomerLoginPage.textCustomerPassword ,"1234");


        click( CustomerLoginPage.btnCustomerLogin  );
    }

}
