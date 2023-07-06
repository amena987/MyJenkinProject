package stepDefinitions;

import base.Base;
import io.cucumber.java.en.Then;
import pages.CustomerHomePage;
import pages.CustomerLoginPage;
import pages.EmployeeHomePage;
import pages.EmployeeLoginPage;

import static org.junit.Assert.assertEquals;

public class EmployeeLogin extends Base {

    @Then("I click on Employee Login Menu")
    public void i_click_on_employee_login_menu() {
        click(EmployeeLoginPage.menuEmployeeLogin);

    }

    @Then("I Enter employee User Id")
    public void i_enter_employee_user_id() {
        sendKeys( CustomerLoginPage.textCustomerUserId , "testpilot@gmail.com");
    }
    @Then("I enter employee Password")
    public void i_enter_employee_password() {
        sendKeys( CustomerLoginPage.textCustomerPassword ,"1234");
    }
    @Then("Verify I am in Employee Home Page")
    public void verify_i_am_in_employee_home_page() {
        String welcomeTest =  getText(EmployeeHomePage.labelWelcomeMsg);
        assertEquals( "Welcome Test",welcomeTest);

    }
}
