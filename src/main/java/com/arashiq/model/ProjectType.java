package com.arashiq.model;

import com.arashiq.enums.ProjectCategory;
import com.arashiq.enums.ProjectKPI;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;


/**
 * @author arashiQ
 * @data 2016/07/21
 */
@Document
public class ProjectType {
    @Id
    private String id;
    private String code;
    private String name;

    private int complexity;
    private int scale;
    private int designLevel;

    private ProjectCategory projectCategory;
    private Map<ProjectKPI, Integer> requiredKPIs;

    public ProjectType() {
    }

    public ProjectType(String id, String code, String name, int complexity, int scale, int designLevel, ProjectCategory projectCategory, Map<ProjectKPI, Integer> requiredKPIs) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.complexity = complexity;
        this.scale = scale;
        this.designLevel = designLevel;
        this.projectCategory = projectCategory;
        this.requiredKPIs = requiredKPIs;
    }

    @Override
    public String toString() {
        return "ProjectType{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", complexity=" + complexity +
                ", scale=" + scale +
                ", designLevel=" + designLevel +
                ", projectCategory=" + projectCategory +
                ", requiredKPIs=" + requiredKPIs +
                '}';
    }
}
