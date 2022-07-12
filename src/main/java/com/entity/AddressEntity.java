package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class AddressEntity {

	@Id
	@GeneratedValue
	int addressId;

	String adressLine;
	String city;
	String state;

	@OneToOne
	@JoinColumn(name = "userId", referencedColumnName = "userId")
	UserEntity user;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAdressLine() {
		return adressLine;
	}

	public void setAdressLine(String adressLine) {
		this.adressLine = adressLine;
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

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

}
