package com.arashiq.model;

import com.arashiq.enums.ProjectCategory;
import com.arashiq.enums.ProjectKPI;
import com.arashiq.enums.ProjectStage;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;


/**
 * @author arashiQ
 * @data 2016/07/21
 */
@Document
public class ProjectType {
    @Id
    private String id;
    private String name;

    private int complexity;
    private int scale;
    private int designLevel;

    private ProjectCategory projectCategory;
    private Map<ProjectKPI, Integer> requiredKPIs;
    private List<ProjectStage> projectStages;

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

    public int getComplexity() {
        return complexity;
    }

    public void setComplexity(int complexity) {
        this.complexity = complexity;
    }

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public int getDesignLevel() {
        return designLevel;
    }

    public void setDesignLevel(int designLevel) {
        this.designLevel = designLevel;
    }

    public ProjectCategory getProjectCategory() {
        return projectCategory;
    }

    public void setProjectCategory(ProjectCategory projectCategory) {
        this.projectCategory = projectCategory;
    }

    public Map<ProjectKPI, Integer> getRequiredKPIs() {
        return requiredKPIs;
    }

    public void setRequiredKPIs(Map<ProjectKPI, Integer> requiredKPIs) {
        this.requiredKPIs = requiredKPIs;
    }

    public List<ProjectStage> getProjectStages() {
        return projectStages;
    }

    public void setProjectStages(List<ProjectStage> projectStages) {
        this.projectStages = projectStages;
    }

    public ProjectType() {
    }

    public ProjectType(String name, int complexity, int scale, int designLevel, ProjectCategory projectCategory, Map<ProjectKPI, Integer> requiredKPIs, List<ProjectStage> projectStages) {
        this.name = name;
        this.complexity = complexity;
        this.scale = scale;
        this.designLevel = designLevel;
        this.projectCategory = projectCategory;
        this.requiredKPIs = requiredKPIs;
        this.projectStages = projectStages;
    }

    @Override
    public String toString() {
        return "ProjectType{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", complexity=" + complexity +
                ", scale=" + scale +
                ", designLevel=" + designLevel +
                ", projectCategory=" + projectCategory +
                ", requiredKPIs=" + requiredKPIs +
                ", projectStages=" + projectStages +
                '}';
    }
}
