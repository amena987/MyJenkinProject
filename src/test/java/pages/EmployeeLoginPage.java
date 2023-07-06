package pages;

import base.Base;
import org.openqa.selenium.By;
import pages.EmployeeLoginPage;


public class EmployeeLoginPage extends Base {

    //Locators
    public static By menuEmployeeLogin = By.partialLinkText("Employee");

    public static By menuCustomerLogin = By.partialLinkText("Customer");

    public static By textEmployeeUserId = By.name("mailuid");
    public static By textEmployeePassword = By.xpath("//input[@name='pwd']");
    public static By btnEmployeeLogin = By.cssSelector("input[name='login-submit']");
    public static By btnEmployeeLogout = By.xpath("//a[text()='Log Out']");
    public static By employeeLogoutTextverify = By.xpath("//h2[contains(text(),'Welcome')]");
    public static By lebelWelcomeSlogan;

    //Actions
    public static String loginAsEmployee(String userId, String password) {
      Base.navigate("http://it.microtechlimited.com");
        Base.click( EmployeeLoginPage.menuEmployeeLogin );
       Base.sendKeys(EmployeeLoginPage.textEmployeeUserId , userId );
        Base.sendKeys(EmployeeLoginPage.textEmployeePassword, password );
       Base.click( EmployeeLoginPage.btnEmployeeLogin);
        String s =  getText(EmployeeHomePage.labelWelcomeMsg);
        return s;

    }

    public static void employeeLogOut() {
        click(EmployeeLoginPage.btnEmployeeLogout);

}
}
