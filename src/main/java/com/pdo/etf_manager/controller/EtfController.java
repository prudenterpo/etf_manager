package com.pdo.etf_manager.controller;

import com.pdo.etf_manager.model.Etf;
import com.pdo.etf_manager.service.EtfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/etfs")
public class EtfController {

    private final EtfService etfService;

    @Autowired
    public EtfController(EtfService etfService) {
        this.etfService = etfService;
    }

    @PostMapping
    public ResponseEntity<Etf> createEtf(@RequestBody Etf etf) {
        Etf savedEtf = etfService.saveEtf(etf);
        return ResponseEntity.ok(savedEtf);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Etf> getEtfById(@PathVariable Long id) {
        return etfService.getEtfById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEtf(@PathVariable Long id) {
        etfService.deleteEtfById(id);
        return ResponseEntity.ok().build();
    }
}
