
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import cucumber.runtime.junit.*;
import static org.junit.Assert.*;

@SuppressWarnings("deprecation")
public class CalculatorStepDefination {

	BDDCalculator target=new BDDCalculator();
	int actualOutput=0;
	@Given("Open a calculator and give {int} and {int} as input")
	public void open_a_calculator_and_give_and_as_input(Integer int1,
			Integer int2) {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
		target.setA(int1);
		target.setB(int2);
		
	}

	@When("click on add")
	public void click_on_add() {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
		
		actualOutput=target.add();
	}

	@Then("verify {int} is the output")
	public void verify_is_the_output(Integer expectedOutput) {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
		assertTrue(actualOutput==expectedOutput?true:false);
	}
	
	@When("click on sub")
	public void click_on_sub() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		actualOutput=target.subtract();
	}


	@When("click on {string}")
	public void click_on_sub(String action) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		
		if(action=="add"){
			actualOutput=target.add();
		}
		else if(action=="sub"){
			actualOutput=target.subtract();
		}
	}

	

}
