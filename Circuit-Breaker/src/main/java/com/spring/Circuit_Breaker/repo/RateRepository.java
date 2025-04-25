package com.spring.Circuit_Breaker.repo;

import com.spring.Circuit_Breaker.entity.Rate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface RateRepository extends JpaRepository<Rate, Integer> {

    Optional<Rate> findByCurrency(String type);
}
