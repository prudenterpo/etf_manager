package com.pdo.etf_manager.service;

import com.pdo.etf_manager.model.Etf;
import com.pdo.etf_manager.repository.EtfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EtfService {

    private final EtfRepository etfRepository;

    @Autowired
    public EtfService(EtfRepository etfRepository) {
        this.etfRepository = etfRepository;
    }

    public Etf saveEtf(Etf etf) {
        return etfRepository.save(etf);
    }

    public Optional<Etf> getEtfById(Long id) {
        return etfRepository.findById(id);
    }

    public List<Etf> getAllEtfs() {
        return etfRepository.findAll();
    }

    public void deleteEtfById(Long id) {
        etfRepository.deleteById(id);
    }
}
