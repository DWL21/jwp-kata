package com.kata.kata.domain.repository;

import com.kata.kata.domain.TrendKeyword;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityNotFoundException;

public interface TrendKeywordRepository extends JpaRepository<TrendKeyword, Long> {

    default TrendKeyword get(Long id) {
        return findById(id).orElseThrow(EntityNotFoundException::new);
    }
}