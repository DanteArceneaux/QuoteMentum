package com.quotementum.api.services;


import com.quotementum.api.models.Quotes;
import com.quotementum.api.repositories.QuotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuotesService {
    private final QuotesRepository quotesRepository;


    @Autowired
    public QuotesService(QuotesRepository quotesRepository) {
        this.quotesRepository = quotesRepository;
    }

    public List<Quotes> findAllQuotes() {
        return quotesRepository.findAll();
    }
}
