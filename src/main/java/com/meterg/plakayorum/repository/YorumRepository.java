package com.meterg.plakayorum.repository;

import com.meterg.plakayorum.entity.Yorum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface YorumRepository extends JpaRepository<Yorum, Long> {

    Optional<List<Yorum>> findAllByPlakaId(Long plakaId);
}