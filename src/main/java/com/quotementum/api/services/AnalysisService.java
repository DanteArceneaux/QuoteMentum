package com.quotementum.api.services;

import com.quotementum.api.models.Analysis;
import com.quotementum.api.repositories.AnalysisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnalysisService {

    private final AnalysisRepository analysisRepository;

    @Autowired
    public AnalysisService(AnalysisRepository analysisRepository) {
        this.analysisRepository = analysisRepository;
    }

    public List<Analysis> findAllAnalyses() {
        return analysisRepository.findAll();
    }
}
