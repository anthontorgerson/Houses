/**
 * @author AnthonT - atorgerson
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */

package dmacc.controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Address;
import dmacc.beans.HouseType;

/**
 * @author AnthonT
 *
 */
@Configuration
public class BeanConfiguration {
	@Bean
	public HouseType contact() {
		HouseType bean = new HouseType();
		return bean;
	}
	
	public Address address() {
		Address bean = new Address("777 Rainbow Road", "Carroll", "IA");
		return bean;
	}
}
