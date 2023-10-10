package com.quotementum.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Quotes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String quote;
    private String author;
}


