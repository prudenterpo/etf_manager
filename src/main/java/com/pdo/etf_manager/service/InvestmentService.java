package com.pdo.etf_manager.service;

import com.pdo.etf_manager.model.Investment;
import com.pdo.etf_manager.repository.InvestmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvestmentService {

    private final InvestmentRepository investmentRepository;

    @Autowired
    public InvestmentService(InvestmentRepository investmentRepository) {
        this.investmentRepository = investmentRepository;
    }

    public Investment saveInvestment(Investment investment) {
        return investmentRepository.save(investment);
    }

    public Optional<Investment> getInvestmentById(Long id) {
        return investmentRepository.findById(id);
    }

    public List<Investment> getAllInvestments() {
        return investmentRepository.findAll();
    }

    public void deleteInvestment(Long id) {
        investmentRepository.deleteById(id);
    }
}
