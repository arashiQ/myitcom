package com.arashiq.model;

import com.arashiq.enums.ProjectStage;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 * @author arashiQ
 * @data 2016/07/21
 */
@Document
public class Project {
    @Id
    private String id;
    @Indexed
    private String userId;

    private String ProjectType;
    private String name;
    //project start time
    private LocalDate start;
    //last time that the client update status to server
    private LocalDate update;
    private int bugs;

    private List<Integer> employees;
    private Map<String, Integer> kpis;
    private Map<String, Integer> expectedWork;
    private Map<String, Integer> doneWork;
    private Map<String, Float> bonus;

    private int developNow;
    private int developSum;
    private int designNow;
    private int designSum;
    private int planNow;
    private int planSum;

    private ProjectStage projectStage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProjectType() {
        return ProjectType;
    }

    public void setProjectType(String projectType) {
        ProjectType = projectType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getUpdate() {
        return update;
    }

    public void setUpdate(LocalDate update) {
        this.update = update;
    }

    public int getBugs() {
        return bugs;
    }

    public void setBugs(int bugs) {
        this.bugs = bugs;
    }

    public List<Integer> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Integer> employees) {
        this.employees = employees;
    }

    public Map<String, Integer> getKpis() {
        return kpis;
    }

    public void setKpis(Map<String, Integer> kpis) {
        this.kpis = kpis;
    }

    public Map<String, Integer> getExpectedWork() {
        return expectedWork;
    }

    public void setExpectedWork(Map<String, Integer> expectedWork) {
        this.expectedWork = expectedWork;
    }

    public Map<String, Integer> getDoneWork() {
        return doneWork;
    }

    public void setDoneWork(Map<String, Integer> doneWork) {
        this.doneWork = doneWork;
    }

    public Map<String, Float> getBonus() {
        return bonus;
    }

    public void setBonus(Map<String, Float> bonus) {
        this.bonus = bonus;
    }

    public int getDevelopNow() {
        return developNow;
    }

    public void setDevelopNow(int developNow) {
        this.developNow = developNow;
    }

    public int getDevelopSum() {
        return developSum;
    }

    public void setDevelopSum(int developSum) {
        this.developSum = developSum;
    }

    public int getDesignNow() {
        return designNow;
    }

    public void setDesignNow(int designNow) {
        this.designNow = designNow;
    }

    public int getDesignSum() {
        return designSum;
    }

    public void setDesignSum(int designSum) {
        this.designSum = designSum;
    }

    public int getPlanNow() {
        return planNow;
    }

    public void setPlanNow(int planNow) {
        this.planNow = planNow;
    }

    public int getPlanSum() {
        return planSum;
    }

    public void setPlanSum(int planSum) {
        this.planSum = planSum;
    }

    public ProjectStage getProjectStage() {
        return projectStage;
    }

    public void setProjectStage(ProjectStage projectStage) {
        this.projectStage = projectStage;
    }

    public Project() {
    }

    public Project(String id, String userId, String projectType, String name, LocalDate start, LocalDate update, int bugs, List<Integer> employees, Map<String, Integer> kpis, Map<String, Integer> expectedWork, Map<String, Integer> doneWork, Map<String, Float> bonus, int developNow, int developSum, int designNow, int designSum, int planNow, int planSum, ProjectStage projectStage) {
        this.id = id;
        this.userId = userId;
        ProjectType = projectType;
        this.name = name;
        this.start = start;
        this.update = update;
        this.bugs = bugs;
        this.employees = employees;
        this.kpis = kpis;
        this.expectedWork = expectedWork;
        this.doneWork = doneWork;
        this.bonus = bonus;
        this.developNow = developNow;
        this.developSum = developSum;
        this.designNow = designNow;
        this.designSum = designSum;
        this.planNow = planNow;
        this.planSum = planSum;
        this.projectStage = projectStage;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", ProjectType='" + ProjectType + '\'' +
                ", name='" + name + '\'' +
                ", start=" + start +
                ", update=" + update +
                ", bugs=" + bugs +
                ", employees=" + employees +
                ", kpis=" + kpis +
                ", expectedWork=" + expectedWork +
                ", doneWork=" + doneWork +
                ", bonus=" + bonus +
                ", developNow=" + developNow +
                ", developSum=" + developSum +
                ", designNow=" + designNow +
                ", designSum=" + designSum +
                ", planNow=" + planNow +
                ", planSum=" + planSum +
                ", projectStage=" + projectStage +
                '}';
    }
}
