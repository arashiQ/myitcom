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
    private int fans;
    private int fame;
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

    public int getFans() {
        return fans;
    }

    public void setFans(int fans) {
        this.fans = fans;
    }

    public int getFame() {
        return fame;
    }

    public void setFame(int fame) {
        this.fame = fame;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Company() {
    }

    public Company(String id, String name, Long userId, int funds, int users, int fans, int fame, String country) {
        this.id = id;
        Name = name;
        this.userId = userId;
        this.funds = funds;
        this.users = users;
        this.fans = fans;
        this.fame = fame;
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
                ", fans=" + fans +
                ", fame=" + fame +
                ", country='" + country + '\'' +
                '}';
    }
}
