package com.spring.microservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.microservice.common.payload.response.MessageResponse;
import com.spring.microservice.model.PersonProfile;
import com.spring.microservice.repository.PersonProfileRepository;
import java.math.BigDecimal;
import java.util.Optional;

@Service
public class IndividualValidateService {

    
    @Autowired
    PersonProfileRepository personProfileRepository;


    public String serviceName() {
       return "Individual Validate Service";
    }

    public ResponseEntity<?> getDataByID(String PERSON_ID_Str) {       
        PersonProfile personData = null;        
        BigDecimal PERSON_ID = new BigDecimal(PERSON_ID_Str);
        Optional<PersonProfile> personDataOpt =  personProfileRepository.findById(PERSON_ID);
        if(personDataOpt.isPresent()){
            personData = personDataOpt.get();
        }

        return ResponseEntity.ok(new MessageResponse("Get data user", "200", "success", personData));
    }
}
