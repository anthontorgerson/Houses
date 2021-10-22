/**
 * @author AnthonT - atorgerson
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */
package dmacc;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Address;
import dmacc.beans.HouseType;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.HouseTypeRepository;

@SpringBootApplication
public class HousesApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(HousesApplication.class, args);
	}
	
	@Autowired
	HouseType repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Using an existing bean
		HouseType c = appContext.getBean("houseType", HouseType.class);
		c.setSize("medium");
		repo.save(c);
		
		//Create a bean to use - not managed by Spring
		HouseType d = new HouseType("Farmhouse", "blue", "large");
		Address a = new Address("555 250th Street", "Carroll", "IA");
		d.setAddress(a);
		repo.save(d);
		
		List<HouseType> allHouses = repo.findAll();
		for(HouseType house: allHouses) {
			System.out.println(house.toString());
		}
		
		//closes the ApplicationContext resource leak - not imperative to add but nice to clean it up
		((AbstractApplicationContext) appContext).close();
	
	}

}