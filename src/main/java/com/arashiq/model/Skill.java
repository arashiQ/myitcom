package com.arashiq.model;

import com.arashiq.enums.SkillCategory;
import com.arashiq.enums.SkillEffect;
import com.arashiq.enums.SkillType;
import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;

/**
 * @author arashiQ
 * @data 2016/07/04
 */
@Document
public class Skill {
    @Id
    private String id;
    private String code;
    private Integer level;
    private String name;
    private String description;
    private SkillType type;
    private SkillCategory category;
    private SkillEffect effect;
    private Integer effectValue;
    private String unlockTime;

    public Skill() {
    }

}
