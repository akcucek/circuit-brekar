package com.spring.Circuit_Breaker.service;

import com.spring.Circuit_Breaker.entity.Rate;
import com.spring.Circuit_Breaker.repo.RateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RateService {

    @Autowired
    private RateRepository rateRepository;

    public Rate getRateByType(String type) {
        return rateRepository.findByType(type)
                .orElseThrow(() -> new RuntimeException("Rate not found for type: " + type));
    }
}
