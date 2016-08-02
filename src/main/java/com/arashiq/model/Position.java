package com.arashiq.model;

import com.arashiq.enums.PositionCategory;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;


/**
 * @author arashiQ
 * @data 2016/07/19
 */
@Document
public class Position {
    @Id
    private String id;
    private String name;
    private String description;
    private String unlockTime;
    private Integer level;
    private Integer salary;

    private String unlockSkill;
    private Map<String, Integer> requiredSkills;
    private PositionCategory positionCategory;
    private Boolean isManager;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getUnlockTime() {
        return unlockTime;
    }

    public void setUnlockTime(String unlockTime) {
        this.unlockTime = unlockTime;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getUnlockSkill() {
        return unlockSkill;
    }

    public void setUnlockSkill(String unlockSkill) {
        this.unlockSkill = unlockSkill;
    }


    public Map<String, Integer> getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(Map<String, Integer> requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

    public PositionCategory getPositionCategory() {
        return positionCategory;
    }

    public void setPositionCategory(PositionCategory positionCategory) {
        this.positionCategory = positionCategory;
    }

    public Boolean getManager() {
        return isManager;
    }

    public void setManager(Boolean manager) {
        isManager = manager;
    }

    public Position() {
    }

    public Position(String name, String description, String unlockTime, Integer level, Integer salary, String unlockSkill, Map<String, Integer> requiredSkills, PositionCategory positionCategory, Boolean isManager) {
        this.name = name;
        this.description = description;
        this.unlockTime = unlockTime;
        this.level = level;
        this.salary = salary;
        this.unlockSkill = unlockSkill;
        this.requiredSkills = requiredSkills;
        this.positionCategory = positionCategory;
        this.isManager = isManager;
    }

    @Override
    public String toString() {
        return "Position{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", unlockTime='" + unlockTime + '\'' +
                ", level=" + level +
                ", salary=" + salary +
                ", unlockSkill='" + unlockSkill + '\'' +
                ", requiredSkills=" + requiredSkills +
                ", positionCategory=" + positionCategory +
                ", isManager=" + isManager +
                '}';
    }
}
