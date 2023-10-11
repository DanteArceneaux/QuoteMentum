package com.quotementum.api.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.quotementum.api.models.QuoteJson;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class QuoteImporter {

    public List<QuoteJson> importQuotes() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        InputStream inputStream = QuoteImporter.class.getResourceAsStream("/data/quotes-100-en.json");
        Map<String, List<String>> quotesMap = objectMapper.readValue(inputStream, Map.class);

        List<QuoteJson> quoteJsonList = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : quotesMap.entrySet()) {
            String author = entry.getKey();
            List<String> quotes = entry.getValue();
            for (String quote : quotes) {
                QuoteJson quoteJson = new QuoteJson();
                quoteJson.setAuthor(author);
                quoteJson.setText(quote);
                quoteJsonList.add(quoteJson);
            }
        }

        return quoteJsonList;
    }
}
