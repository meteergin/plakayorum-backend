package com.meterg.plakayorum.service;

import com.meterg.plakayorum.entity.Plaka;
import com.meterg.plakayorum.repository.PlakaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlakaService {

    private PlakaRepository plakaRepository;

    PlakaService(PlakaRepository plakaRepository) {
        this.plakaRepository = plakaRepository;
    }

    public Optional<Plaka> getPlaka(String no) {
        return plakaRepository.findByNo(no);
    }

    public Plaka save(Plaka plaka){
        return plakaRepository.save(plaka);
    }
}
