package com.bridgelabz.AddressBookApplication;

public class PersonInfo {
	private String firstName;
	private String lastName;
	private String address;
	private String cityName;
	private String stateName;
	private String zipCode;
	private String phoneNo;
	
	
	public PersonInfo()
	{
		
	}
	
	public PersonInfo(String firstName,String lastName,String address,String cityName,String stateName,String zipCode,String phoneNo) {
		setFirstName(firstName);
		setLastName(lastName);
		setAddress(address);
		setCityName(cityName);
		setStateName(stateName);
		setZipCode(zipCode);
		setPhoneNo(phoneNo);
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public String toString() {
		return "PersonInfo[firstName: "+firstName+ ",lastName: "+lastName+",address: "+address+",cityName: "+cityName+",stateName: "+stateName+",zipCode: "+zipCode+",phoneNo:"+phoneNo+"]";
	}
	
	public void updatePerson(String address, String cityName, String stateName, String zipCode, String phoneNo)
	{
		
}
}
