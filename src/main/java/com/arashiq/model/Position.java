package com.arashiq.model;

import com.arashiq.enums.PositionCategory;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


/**
 * @author arashiQ
 * @data 2016/07/19
 */
@Document
public class Position {
    @Id
    private String id;
    private String code;
    private String name;
    private String description;
    private String unlockTime;
    private Integer level;
    private Integer salary;
    private String unlockSkill;
    private String requiredPosition;
    private List<String> requiredSkills;
    private PositionCategory positionCategory;
    private Boolean isManager;


}
