package com.arashiq.model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by A13054 on 2016/06/20.
 */
@Entity
public class User {
    @Id
    @GeneratedValue
    private long id;

    private String userName;

    @JsonIgnore
    private String password;

    //employee id as ceo;
    private String avatar;

    private String companyId;

    private String GameDate;

    private Long updateTime;

    private Integer fame;

    public User() {
    }

    public long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getCompanyId() {
        return companyId;
    }

    public String getGameDate() {
        return GameDate;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public Integer getFame() {
        return fame;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public void setGameDate(String gameDate) {
        GameDate = gameDate;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public void setFame(Integer fame) {
        this.fame = fame;
    }

    public User(String userName, String password, String avatar, String companyId, String gameDate, Long updateTime, Integer fame) {
        this.userName = userName;
        this.password = password;
        this.avatar = avatar;
        this.companyId = companyId;
        this.GameDate = gameDate;
        this.updateTime = updateTime;
        this.fame = fame;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", avatar='" + avatar + '\'' +
                ", companyId='" + companyId + '\'' +
                ", GameDate='" + GameDate + '\'' +
                ", updateTime=" + updateTime +
                ", fame=" + fame +
                '}';
    }
}
