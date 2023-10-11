package com.quotementum.api.repositories;

import com.quotementum.api.models.Quotes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuotesRepository extends JpaRepository<Quotes, Long> {

    @Query("SELECT q FROM Quotes q WHERE (:author IS NULL OR LOWER(q.author) LIKE LOWER(CONCAT('%', :author, '%'))) AND (:quote IS NULL OR LOWER(q.quote) LIKE LOWER(CONCAT('%', :quote, '%')))")
    List<Quotes> search(String author, String quote);
}
