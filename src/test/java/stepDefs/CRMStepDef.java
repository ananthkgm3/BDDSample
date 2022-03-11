package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepDef {
	
//	@Before("@RegressionTest") // taggedhooks
//	public void setup()
//	{
//		System.out.println("***Before***");
//	}
	
	@Before(value="@RegressionTest", order=2) 
	public void setupDB()
	{
		System.out.println("***DB***");
	}
	
	@Before(order=1) 
	public void setupbrowser()
	{
		System.out.println("***Browser***");
	}
	
//	@After					//hooks
//	public void close()
//	{
//		System.out.println("***After***");
//	}
	
	
	
	@Given("User must login")
	public void user_must_login() {
	    System.out.println("User must login");
	}
	@When("User create a new contact")
	public void user_create_a_new_contact() {
		System.out.println("User create a new contact");
	}
	
	@When("User view a contact")
	public void user_view_a_contact() {
		System.out.println("User view a contact");
	}

	@When("User edit contact details")
	public void user_edit_contact_details() {
		System.out.println("User edit contact details");
	}
	
	@When("User create a new deal")
	public void user_create_a_new_deal() {
		System.out.println("User create a new deal");
	}

	@When("User view deal details")
	public void user_view_deal_details() {
		System.out.println("User view deal details");
	}
	
	@When("User Logout from App")
	public void user_logout_from_app() {
	    System.out.println("User Logout from App");
	}
	
	@When("User create a new Task")
	public void user_create_a_new_task() {
		System.out.println("User create a new Task");
	}

	@When("User view a Task")
	public void user_view_a_task() {
		System.out.println("User view a Task");
	}
	
	@When("User edit Task details")
	public void user_edit_task_details() {
		System.out.println("User edit Task details");
	}


}
