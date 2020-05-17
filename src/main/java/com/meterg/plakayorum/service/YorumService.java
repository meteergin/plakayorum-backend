package com.meterg.plakayorum.service;

import com.meterg.plakayorum.entity.Yorum;
import com.meterg.plakayorum.repository.YorumRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class YorumService {

    private YorumRepository yorumRepository;

    YorumService(YorumRepository yorumRepository) {
        this.yorumRepository = yorumRepository;
    }

    public Optional<List<Yorum>> findAllByPlakaId(Long plakaId) {
        return yorumRepository.findAllByPlakaId(plakaId);
    }

    public Yorum save(Yorum yorum){
        return yorumRepository.save(yorum);
    }
}
