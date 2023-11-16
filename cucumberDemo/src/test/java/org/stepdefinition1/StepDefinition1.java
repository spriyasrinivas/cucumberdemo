package org.stepdefinition1;

import org.StepDefinition.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition1 extends BaseClass {
	PageManager manager;
	SearchPom things;
	MobilePhone phone;
	AddTocart cart;
	@Given("Enter the mobiles phone in search tab")
	public void enter_the_mobiles_phone_in_search_tab() {
	   things= new SearchPom();
	   passValue(things.getSearchtab(),"Mobiles phones");
	}

	
	@Given("click any one mobiles")
	public void click_any_one_mobiles() {
		phone= new MobilePhone();
	   elementClick(phone.getApplephone());
	}
	@Then("add To cart")
	public void add_to_cart() {
	cart=manager. AddTocart();
	   wHandles(1);
	   elementClick(cart.getaddCart());
	
	}

	@Given("click any one mobiles2")
	public void click_any_one_mobiles2() {
	    phone=new MobilePhone();
	    elementClick(phone.getPoco());
	}


	@Then("add To cart2")
	public void add_to_cart2() {
	   cart=manager.AddTocart();
	   wHandles(1);
	   elementClick(cart.getaddCart1());
	}




}
