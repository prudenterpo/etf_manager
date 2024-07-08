package com.pdo.etf_manager.repository;

import com.pdo.etf_manager.model.Investment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestmentRepository extends JpaRepository<Investment, Long> {
}
