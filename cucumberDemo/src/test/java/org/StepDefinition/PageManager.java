package org.StepDefinition;

public class PageManager {
 private FacebookPom facebook;
 public  FacebookPom getFacebook()
 {
	 if(facebook==null)
	 {
		 facebook= new FacebookPom();
	 }
	 return facebook;
 }
 private ForgotPassword forgot;
 public ForgotPassword getforgot()
 {
	 if(forgot==null)
	 {
		 forgot= new ForgotPassword();
		 
	 }
	 return forgot;
 }
 private CreateAccount account;
 public CreateAccount getAccount()
 {
	 if(account==null)
	 {
		 account= new CreateAccount();
	 }
	 return account;
 }
}
