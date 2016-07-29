package com.arashiq.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

/**
 * @author arashiQ
 * @data 2016/07/21
 */
@Document
public class Event {
    @Id
    private String id;
    private String name;
    private String detail;
    private LocalDate start;
    private boolean showDialog;
    private String unlockProjectType;
    private String unlockSkill;
    private String unlockPosition;
    private String unlockTechnology;
}
