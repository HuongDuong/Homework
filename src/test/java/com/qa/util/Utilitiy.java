package com.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utilitiy {

	public static WebDriver driver;

	public void gotoWebSite() {

		// goto the site
		driver.get("http://automationpractice.com/index.php");
	}

	public void click_Sign_in_link() {
		// TODO Auto-generated method stub
		WebElement linkSignin = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		linkSignin.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void input_email(String email) {
		// TODO Auto-generated method stub
		String strEmail = email;
		WebElement inputEmail = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
		inputEmail.clear();
		inputEmail.sendKeys(strEmail);

	}

	public void click_Create_an_account_button() {
		WebElement btnCreate = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]"));
		btnCreate.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void click_radio_button_select_gender(String gender) {
		// TODO Auto-generated method stub
		WebElement radGender = driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]/div[2]"));
		radGender.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void input_first_name(String firstname) {
		// TODO Auto-generated method stub
		String strFirstname = firstname;
		WebElement inputFirstname = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
		inputFirstname.clear();
		inputFirstname.sendKeys(strFirstname);

	}

	public void input_last_name(String lastname) {
		// TODO Auto-generated method stub
		String strLastname = lastname;
		WebElement inputLastname = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
		inputLastname.clear();
		inputLastname.sendKeys(strLastname);

	}

	public void input_password(String password) {
		// TODO Auto-generated method stub
		String strPassword = password;
		WebElement inputPassword = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		inputPassword.clear();
		inputPassword.sendKeys(strPassword);
	}

	public void input_date_of_birth(String day, String month, String year) {
		// TODO Auto-generated method stub

	}

	public void input_company(String company) {
		// TODO Auto-generated method stub
		String strCompany = company;
		WebElement inputCompany = driver.findElement(By.xpath("//*[@id=\"company\"]"));
		inputCompany.clear();
		inputCompany.sendKeys(strCompany);

	}

	public void input_address(String address) {
		// TODO Auto-generated method stub
		String strAddress = address;
		WebElement inputAddress = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
		inputAddress.clear();
		inputAddress.sendKeys(strAddress);

	}

	public void input_address_line(String addressline) {
		// TODO Auto-generated method stub
		String strAddressline = addressline;
		WebElement inputAddressline = driver.findElement(By.xpath("//*[@id=\"address2\"]"));
		inputAddressline.clear();
		inputAddressline.sendKeys(strAddressline);

	}

	public void input_city(String city) {
		// TODO Auto-generated method stub
		String strCity = city;
		WebElement inputCity = driver.findElement(By.xpath("//*[@id=\"city\"]"));
		inputCity.clear();
		inputCity.sendKeys(strCity);

	}

	public void input_state(String state) {
		// TODO Auto-generated method stub

	}

	public void input_postal_code(String postalcode) {
		// TODO Auto-generated method stub
		String strPostalcode = postalcode;
		WebElement inputPostalcode = driver.findElement(By.xpath("//*[@id=\"address2\"]"));
		inputPostalcode.clear();
		inputPostalcode.sendKeys(strPostalcode);

	}

	public void input_country(String country) {
		// TODO Auto-generated method stub

	}

	public void input_additional_information(String additional) {
		// TODO Auto-generated method stub
		String strAdditional = additional;
		WebElement inputAdditional = driver.findElement(By.xpath("//*[@id=\"other\"]"));
		inputAdditional.clear();
		inputAdditional.sendKeys(strAdditional);

	}

	public void input_home_phone(String homephone) {
		// TODO Auto-generated method stub
		String strHomephone = homephone;
		WebElement inputHomephone = driver.findElement(By.xpath("//*[@id=\"other\"]"));
		inputHomephone.clear();
		inputHomephone.sendKeys(strHomephone);

	}

	public void input_mobile_phone(String mobilephone) {
		// TODO Auto-generated method stub
		String strMobilephone = mobilephone;
		WebElement inputMobilephone = driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
		inputMobilephone.clear();
		inputMobilephone.sendKeys(strMobilephone);

	}

	public void input_assign_an_address_alias_for_future_reference(String assignaddress) {
		// TODO Auto-generated method stub
		String strAssignaddress = assignaddress;
		WebElement inputAssignaddress = driver.findElement(By.xpath("//*[@id=\"alias\"]"));
		inputAssignaddress.clear();
		inputAssignaddress.sendKeys(strAssignaddress);

	}

	public void click_on_Register_button() {
		// TODO Auto-generated method stub
		WebElement btnRegister = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]"));
		btnRegister.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
