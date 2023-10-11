package com.quotementum.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuoteJson {
    @JsonProperty("author")
    private String author;

    @JsonProperty("text")
    private String text;

    // Getters and setters
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
