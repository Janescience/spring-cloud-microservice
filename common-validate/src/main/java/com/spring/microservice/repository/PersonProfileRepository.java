package com.spring.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.microservice.model.PersonProfile;
import java.math.BigDecimal;

@Repository
public interface PersonProfileRepository extends JpaRepository<PersonProfile,BigDecimal>{
//    List<SSC_PersonProfile> findById();
}
