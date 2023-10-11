package com.quotementum.api.util;

import com.quotementum.api.models.Quotes;
import com.quotementum.api.models.QuoteJson;
import com.quotementum.api.repositories.QuotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DatabaseInserter {

    @Autowired
    private QuotesRepository quotesRepository;

    public void insertQuotes(List<QuoteJson> quoteJsonList) {
        List<Quotes> quotesList = quoteJsonList.stream().map(quoteJson -> {
            Quotes quotes = new Quotes();
            quotes.setAuthor(quoteJson.getAuthor());
            quotes.setQuote(quoteJson.getText());
            return quotes;
        }).collect(Collectors.toList());

        quotesRepository.saveAll(quotesList);
    }
}
