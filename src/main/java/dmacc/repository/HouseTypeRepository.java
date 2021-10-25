/**
 * @author AnthonT - atorgerson
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.HouseType;


/**
 * @author AnthonT
 *
 */
@Repository
public interface HouseTypeRepository extends JpaRepository<HouseType, Long> { }
