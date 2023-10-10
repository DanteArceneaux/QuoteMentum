package com.quotementum.api.controllers;


import com.quotementum.api.models.Quotes;
import com.quotementum.api.services.QuotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/quotes")
public class QuotesController {

    private final QuotesService quotesService;

    @Autowired
    public QuotesController(QuotesService quotesService) {
        this.quotesService = quotesService;
    }

    @GetMapping
    public List<Quotes> getAllQuotes() {
        return quotesService.findAllQuotes();
    }
}
