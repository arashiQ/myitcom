package com.arashiq.dto;

import com.arashiq.enums.*;
import com.arashiq.model.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author arashiQ
 * @data 2016/08/02
 */
public class CommonData {
    //enums
    private List<PlaceEffect> placeEffects;
    private List<PositionCategory>  positionCategories;
    private List<PositionFeature> positionFeatures;
    private List<ProjectCategory> projectCategories;
    private List<ProjectKPI> projectKPIs;
    private List<ProjectStage> projectStages;
    private List<SkillCategory> skillCategories;
    private List<SkillEffect> skillEffects;
    private List<SkillType> skillTypes;
    private List<TechnologyEffect> technologyEffects;

    private Long version;
    //data from mongodb
    private List<City> cities;
    private List<Country> countries;
    private List<Position> positions;
    private List<ProjectType> projectTypes;
    private List<Skill> skills;
    private List<Technology> technologies;

    public CommonData(List<PlaceEffect> placeEffects, List<PositionCategory> positionCategories, List<PositionFeature> positionFeatures, List<ProjectCategory> projectCategories, List<ProjectKPI> projectKPIs, List<ProjectStage> projectStages, List<SkillCategory> skillCategories, List<SkillEffect> skillEffects, List<SkillType> skillTypes, List<TechnologyEffect> technologyEffects, Long version, List<City> cities, List<Country> countries, List<Position> positions, List<ProjectType> projectTypes, List<Skill> skills, List<Technology> technologies) {
        this.placeEffects = placeEffects;
        this.positionCategories = positionCategories;
        this.positionFeatures = positionFeatures;
        this.projectCategories = projectCategories;
        this.projectKPIs = projectKPIs;
        this.projectStages = projectStages;
        this.skillCategories = skillCategories;
        this.skillEffects = skillEffects;
        this.skillTypes = skillTypes;
        this.technologyEffects = technologyEffects;
        this.version = version;
        this.cities = cities;
        this.countries = countries;
        this.positions = positions;
        this.projectTypes = projectTypes;
        this.skills = skills;
        this.technologies = technologies;
    }

    public List<PlaceEffect> getPlaceEffects() {
        return placeEffects;
    }

    public List<PositionCategory> getPositionCategories() {
        return positionCategories;
    }

    public List<PositionFeature> getPositionFeatures() {
        return positionFeatures;
    }

    public List<ProjectCategory> getProjectCategories() {
        return projectCategories;
    }

    public List<ProjectKPI> getProjectKPIs() {
        return projectKPIs;
    }

    public List<ProjectStage> getProjectStages() {
        return projectStages;
    }

    public List<SkillCategory> getSkillCategories() {
        return skillCategories;
    }

    public List<SkillEffect> getSkillEffects() {
        return skillEffects;
    }

    public List<SkillType> getSkillTypes() {
        return skillTypes;
    }

    public List<TechnologyEffect> getTechnologyEffects() {
        return technologyEffects;
    }

    public Long getVersion() {
        return version;
    }

    public List<City> getCities() {
        return cities;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public List<ProjectType> getProjectTypes() {
        return projectTypes;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public List<Technology> getTechnologies() {
        return technologies;
    }
}
