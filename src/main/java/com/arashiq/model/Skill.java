package com.arashiq.model;

import com.arashiq.enums.SkillCategory;
import com.arashiq.enums.SkillEffect;
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
    private String parentSkill;
    private Integer level;
    private String name;
    private String description;
    private SkillCategory category;
    private SkillEffect effect;
    private Integer effectValue;

    public Skill() {
    }

    public Skill(String parentSkill, Integer level, String name, String description, SkillCategory category, SkillEffect effect, Integer effectValue) {
        this.parentSkill = parentSkill;
        this.level = level;
        this.name = name;
        this.description = description;
        this.category = category;
        this.effect = effect;
        this.effectValue = effectValue;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id='" + id + '\'' +
                ", parentSkill='" + parentSkill + '\'' +
                ", level=" + level +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", effect=" + effect +
                ", effectValue=" + effectValue +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentSkill() {
        return parentSkill;
    }

    public void setParentSkill(String parentSkill) {
        this.parentSkill = parentSkill;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SkillCategory getCategory() {
        return category;
    }

    public void setCategory(SkillCategory category) {
        this.category = category;
    }

    public SkillEffect getEffect() {
        return effect;
    }

    public void setEffect(SkillEffect effect) {
        this.effect = effect;
    }

    public Integer getEffectValue() {
        return effectValue;
    }

    public void setEffectValue(Integer effectValue) {
        this.effectValue = effectValue;
    }
}
