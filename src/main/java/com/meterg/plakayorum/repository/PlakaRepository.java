package com.meterg.plakayorum.repository;

import com.meterg.plakayorum.entity.Plaka;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlakaRepository extends JpaRepository<Plaka, Long> {

    Optional<Plaka> findByNo(String no);

    Plaka findById(long id);
}