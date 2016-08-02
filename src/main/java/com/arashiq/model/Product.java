package com.arashiq.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Map;

/**
 * @author arashiQ
 * @data 2016/07/28
 */
@Document
public class Product {
    @Id
    private String id;
    @Indexed
    private String userId;

    private String ProjectCagegory;
    private String name;
    private LocalDate start;
    private LocalDate finish;
    private int sumScore;
    private Map<String, Float> scores;
    private float price;
    private int copies;
    //employee id
    private String operator;


}
