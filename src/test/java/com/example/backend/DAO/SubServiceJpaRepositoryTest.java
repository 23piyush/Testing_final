package com.example.backend.DAO;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SubServiceJpaRepositoryTest {

    @Autowired
    private SubServiceJpaRepository subServiceJpaRepository;

    @Test
    void findByServiceProviderID() {
        List<SubServiceDetails> subServiceDetails = subServiceJpaRepository.findByServiceProviderID(11L);
        assertThat(subServiceDetails).isNotNull();
    }
}