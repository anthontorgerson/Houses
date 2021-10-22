/**
 * @author AnthonT - atorgerson
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */
package dmacc.beans;

import javax.persistence.Embeddable;

/**
 * @author AnthonT
 *
 */
@Embeddable
public class Address {
	private String street;
	private String city;
	private String state;
	
	public Address() {
		// spaceholder
	}

	public Address(String street, String city, String state) {
		// spaceholder
	}

	// getters and setters
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	// tostring method
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + "]";
	}
}
