package com.arashiq.model;

import com.arashiq.enums.ProjectKPI;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 * @author arashiQ
 * @data 2016/07/21
 */
public class Project {
    @Id
    private String id;
    @Indexed
    private String userId;

    private String ProjectType;
    private String name;
    private LocalDate start;
    private LocalDate finish;

    private List<Integer> employees;
    private Map<String, Integer> kpis;


}
