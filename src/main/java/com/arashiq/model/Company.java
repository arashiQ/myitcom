package com.arashiq.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author arashiQ
 * @data 2016/07/28
 */
@Document
public class Company {
    @Id
    private String id;
    private String Name;
    private Long userId;
    private int funds;
    private int users;
    private int funs;
    private String country;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public int getFunds() {
        return funds;
    }

    public void setFunds(int funds) {
        this.funds = funds;
    }

    public int getUsers() {
        return users;
    }

    public void setUsers(int users) {
        this.users = users;
    }

    public int getFuns() {
        return funs;
    }

    public void setFuns(int funs) {
        this.funs = funs;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Company() {
    }

    public Company(String id, String name, Long userId, int funds, int users, int funs, String country) {
        this.id = id;
        Name = name;
        this.userId = userId;
        this.funds = funds;
        this.users = users;
        this.funs = funs;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id='" + id + '\'' +
                ", Name='" + Name + '\'' +
                ", userId=" + userId +
                ", funds=" + funds +
                ", users=" + users +
                ", funs=" + funs +
                ", country='" + country + '\'' +
                '}';
    }
}
