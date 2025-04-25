package com.spring.Circuit_Breaker.repo;

import com.spring.Circuit_Breaker.entity.Rate;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RateRepository extends JpaRepository<Rate, Integer> {
}
