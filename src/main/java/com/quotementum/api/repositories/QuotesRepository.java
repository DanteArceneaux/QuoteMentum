package com.quotementum.api.repositories;

import com.quotementum.api.models.Quotes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuotesRepository extends JpaRepository<Quotes, Long> {
}
