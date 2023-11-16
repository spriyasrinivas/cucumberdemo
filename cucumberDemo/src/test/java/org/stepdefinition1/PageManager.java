package org.stepdefinition1;

public class PageManager  {
private AddTocart addcart;
public AddTocart AddTocart() {
	if(addcart==null)
	{
		addcart = new AddTocart();
	}
	return addcart;
}

}
