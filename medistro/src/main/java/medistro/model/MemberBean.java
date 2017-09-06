package medistro.model;

import java.util.Date;

public class MemberBean {
	private String memberId;
	private String adharNumber;
	private String firstName;
	private String lastName;
	private String gender;
	private Date birthDate;
	private String occupation;
	private int phoneNumber;
	private String email;
	private String address;
	private String city;
	private String state;
	private String country;
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "MemberBean [memberId=" + memberId + ", adharNumber=" + adharNumber + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", gender=" + gender + ", birthDate=" + birthDate + ", occupation="
				+ occupation + ", phoneNumber=" + phoneNumber + ", email=" + email + ", address=" + address + ", city="
				+ city + ", state=" + state + ", country=" + country + "]";
	}
	
	
}
