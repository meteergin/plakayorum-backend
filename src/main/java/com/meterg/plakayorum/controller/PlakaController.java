package com.meterg.plakayorum.controller;

import com.meterg.plakayorum.entity.Plaka;
import com.meterg.plakayorum.service.PlakaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/plaka")
public class PlakaController {

    private PlakaService plakaService;
    private static final Logger logger = LoggerFactory.getLogger(PlakaController.class);

    PlakaController(PlakaService plakaService) {
        this.plakaService = plakaService;
    }

    @GetMapping("/{no}")
    public ResponseEntity<Plaka> findById(@PathVariable String no) {
        Optional<Plaka> plaka = plakaService.getPlaka(no);
        if (!plaka.isPresent()) {
            logger.error("Plaka {0} bulunamadı.", no);
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(plaka.get());
    }

    @PostMapping
    public ResponseEntity<Plaka> insert(@Valid @RequestBody Plaka plaka) {
        try {
            return ResponseEntity.ok(plakaService.save(plaka));
        }catch (Exception e){
            logger.error(e.getMessage());
            return ResponseEntity.badRequest().build();
        }

    }
}