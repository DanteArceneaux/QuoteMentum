package com.quotementum.api.services;

import com.quotementum.api.models.Quotes;
import com.quotementum.api.repositories.QuotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Quotes> findQuoteById(Long id) {
        return quotesRepository.findById(id);
    }

    public Quotes saveQuote(Quotes quote) {
        return quotesRepository.save(quote);
    }

    public void deleteQuote(Long id) {
        quotesRepository.deleteById(id);
    }

    public Quotes updateQuote(Long id, Quotes updatedQuote) {
        return quotesRepository.findById(id).map(quote -> {
            quote.setQuote(updatedQuote.getQuote());
            quote.setAuthor(updatedQuote.getAuthor());
            return quotesRepository.save(quote);
        }).orElseGet(() -> {
            updatedQuote.setId(id);
            return quotesRepository.save(updatedQuote);
        });
    }
}
