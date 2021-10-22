/**
 * @author AnthonT - atorgerson
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author AnthonT
 *
 */

@Entity
public class HouseType {
	@Id
	@GeneratedValue
	private long id;
	private String houseStyle;
	private String color;
	private String size;
	@Autowired
	private Address address;

	public HouseType() {
		super();
		this.size = "medium";
	}

	public HouseType(String houseStyle) {
		// space holder
	}

	public HouseType(String houseStyle, String color, String size) {
		// space holder
	}

	public HouseType(int id, String houseStyle, String color, String size, Address address) {
		// space holder
	}

	// getters and setters too
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getHouseStyle() {
		return houseStyle;
	}

	public void setHouseStyle(String name) {
		this.houseStyle = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String phone) {
		this.color = phone;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String relationship) {
		this.size = relationship;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "Contact [id = “ + id + “, style=" + houseStyle + ", color =" + color + ", size=" + size + "]";
	}
}