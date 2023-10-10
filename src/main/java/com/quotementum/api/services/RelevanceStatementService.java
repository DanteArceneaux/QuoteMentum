package com.quotementum.api.services;

import com.quotementum.api.models.RelevanceStatement;
import com.quotementum.api.repositories.RelevanceStatementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelevanceStatementService {

    private final RelevanceStatementRepository relevanceStatementRepository;

    @Autowired
    public RelevanceStatementService(RelevanceStatementRepository relevanceStatementRepository) {
        this.relevanceStatementRepository = relevanceStatementRepository;
    }

    public List<RelevanceStatement> findAllStatements() {
        return relevanceStatementRepository.findAll();
    }
}
