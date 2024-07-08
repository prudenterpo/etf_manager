package com.pdo.etf_manager.repository;

import com.pdo.etf_manager.model.Etf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtfRepository extends JpaRepository<Etf, Long> {
}
