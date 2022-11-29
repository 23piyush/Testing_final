package com.example.backend.DAO;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DetailsJpaRepositoryTest {

    @Autowired
    private DetailsJpaRepository detailsJpaRepository;

    @Test
    void findByUsername() {
        UserDetails details = detailsJpaRepository.findByUsername("piyush1");
        assertThat(details).isNotNull();
    }

    @Test
    void findByEmail() {
        UserDetails details = detailsJpaRepository.findByEmail("piyush1@gmail.com");
        assertThat(details).isNotNull();
    }

    @Test
    void findUserDetailsByEmailAndPassword() {
        UserDetails details = detailsJpaRepository.findUserDetailsByEmailAndPassword("piyush@gmail.com", "piyush123");
        assertThat(details).isNotNull();
    }
}