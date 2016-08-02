package com.arashiq.dto;

import com.arashiq.model.*;

import java.time.LocalDate;
import java.util.List;

/**
 * @author arashiQ
 * @data 2016/08/02
 */

public class UserData {
    private User user;
    private Company company;
    private List<Employee> employees;
    private Project project;
    private List<Product> products;
    private String gameTime;
    private Long updateTime;

    public UserData(User user, Company company, List<Employee> employees, Project project, List<Product> products, String gameTime, Long updateTime) {
        this.user = user;
        this.company = company;
        this.employees = employees;
        this.project = project;
        this.products = products;
        this.gameTime = gameTime;
        this.updateTime = updateTime;
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
}
