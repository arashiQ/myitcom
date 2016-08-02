package com.arashiq.dto;

import com.arashiq.enums.*;
import com.arashiq.model.*;
import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * @author arashiQ
 * @data 2016/08/02
 */
public class State {

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

    private Long commonDataVersion;
    //data from mongodb
    private List<City> cities;
    private List<Country> countries;
    private List<Position> positions;
    private List<ProjectType> projectTypes;
    private List<Skill> skills;
    private List<Technology> technologies;

    private User user;
    private Company company;
    private List<Employee> employees;
    private Project project;
    private List<Product> products;
    private String gameTime;
    private Long updateTime;

    public State(CommonData commonData, UserData userData) {
        BeanUtils.copyProperties(commonData, this);
        BeanUtils.copyProperties(userData, this);
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

    public Long getCommonDataVersion() {
        return commonDataVersion;
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

    public User getUser() {
        return user;
    }

    public Company getCompany() {
        return company;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Project getProject() {
        return project;
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getGameTime() {
        return gameTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setPlaceEffects(List<PlaceEffect> placeEffects) {
        this.placeEffects = placeEffects;
    }

    public void setPositionCategories(List<PositionCategory> positionCategories) {
        this.positionCategories = positionCategories;
    }

    public void setPositionFeatures(List<PositionFeature> positionFeatures) {
        this.positionFeatures = positionFeatures;
    }

    public void setProjectCategories(List<ProjectCategory> projectCategories) {
        this.projectCategories = projectCategories;
    }

    public void setProjectKPIs(List<ProjectKPI> projectKPIs) {
        this.projectKPIs = projectKPIs;
    }

    public void setProjectStages(List<ProjectStage> projectStages) {
        this.projectStages = projectStages;
    }

    public void setSkillCategories(List<SkillCategory> skillCategories) {
        this.skillCategories = skillCategories;
    }

    public void setSkillEffects(List<SkillEffect> skillEffects) {
        this.skillEffects = skillEffects;
    }

    public void setSkillTypes(List<SkillType> skillTypes) {
        this.skillTypes = skillTypes;
    }

    public void setTechnologyEffects(List<TechnologyEffect> technologyEffects) {
        this.technologyEffects = technologyEffects;
    }

    public void setCommonDataVersion(Long commonDataVersion) {
        this.commonDataVersion = commonDataVersion;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }

    public void setProjectTypes(List<ProjectType> projectTypes) {
        this.projectTypes = projectTypes;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public void setTechnologies(List<Technology> technologies) {
        this.technologies = technologies;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setGameTime(String gameTime) {
        this.gameTime = gameTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}
