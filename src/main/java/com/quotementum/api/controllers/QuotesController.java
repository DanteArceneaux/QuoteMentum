package com.quotementum.api.controllers;

import com.quotementum.api.models.Quotes;
import com.quotementum.api.services.QuotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public ResponseEntity<Quotes> getQuoteById(@PathVariable Long id) {
        return quotesService.findQuoteById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Quotes createQuote(@RequestBody Quotes quote) {
        return quotesService.saveQuote(quote);
    }

    @PutMapping("/{id}")
    public Quotes updateQuote(@PathVariable Long id, @RequestBody Quotes updatedQuote) {
        return quotesService.updateQuote(id, updatedQuote);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuote(@PathVariable Long id) {
        quotesService.deleteQuote(id);
        return ResponseEntity.noContent().build();
    }
}
