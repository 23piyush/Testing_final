package com.example.backend.service;

import com.example.backend.DAO.DetailsJpaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class DetailServiceTest {

    @Mock
    DetailsJpaRepository detailsJpaRepository;

    DetailService detailService;

    @BeforeEach
    void setUp() {
        this.detailService=new DetailService(this.detailsJpaRepository);
    }


    @Test
    void getDetailsByEmail() {
        detailService.getDetailsByEmail("piyush@gmail.com");
        Mockito.verify(detailsJpaRepository).findByEmail("piyus676h@gmail.com");
    }
}