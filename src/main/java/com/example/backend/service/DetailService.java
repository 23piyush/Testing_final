package com.example.backend.service;

import com.example.backend.DAO.DetailsJpaRepository;
import com.example.backend.DAO.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailService {

    @Autowired
    private DetailsJpaRepository detailsJpaRepository;

    public DetailService(DetailsJpaRepository detailsJpaRepository) {
        this.detailsJpaRepository = detailsJpaRepository;
    }

    public UserDetails getDetailsByEmail(String email){
        return detailsJpaRepository.findByEmail(email);
    }

}
