package com.quotementum.api.runner;

import com.quotementum.api.models.QuoteJson;
import com.quotementum.api.util.DatabaseInserter;
import com.quotementum.api.util.QuoteImporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QuoteImportRunner implements CommandLineRunner {

    @Autowired
    private DatabaseInserter databaseInserter;

    @Autowired
    private QuoteImporter quoteImporter;

    @Override
    public void run(String... args) throws Exception {
        List<QuoteJson> quoteJsonList = quoteImporter.importQuotes();
        databaseInserter.insertQuotes(quoteJsonList);
    }
}
