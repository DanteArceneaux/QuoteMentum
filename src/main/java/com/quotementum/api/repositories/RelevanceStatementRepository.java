package com.quotementum.api.repositories;

import com.quotementum.api.models.RelevanceStatement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelevanceStatementRepository extends JpaRepository<RelevanceStatement, Long> {
}
