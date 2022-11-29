package com.example.backend.DAO;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ServiceJpaRepositoryTest {

    @Autowired
    private ServiceJpaRepository serviceJpaRepository;

    @Test
    void findByLocation() {

        List<Service> serviceList = serviceJpaRepository.findByLocation("Delhi12");
        assertThat(serviceList).isNotNull();

    }
}