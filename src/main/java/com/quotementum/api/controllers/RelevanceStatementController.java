package com.quotementum.api.controllers;

import com.quotementum.api.models.RelevanceStatement;
import com.quotementum.api.services.RelevanceStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/relevance-statements")
public class RelevanceStatementController {

    private final RelevanceStatementService relevanceStatementService;

    @Autowired
    public RelevanceStatementController(RelevanceStatementService relevanceStatementService) {
        this.relevanceStatementService = relevanceStatementService;
    }

    @GetMapping
    public List<RelevanceStatement> getAllRelevanceStatements() {
        return relevanceStatementService.findAllStatements();
    }
}
