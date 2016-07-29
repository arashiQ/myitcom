package com.arashiq.model;
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

    private String password;

    //employee id as ceo;
    private String avatar;

    private String companyId;

    private Integer fame;

    public User() {
    }

    public User(String userName, String password, String avatar, String companyId, Integer fame) {
        this.userName = userName;
        this.password = password;
        this.avatar = avatar;
        this.companyId = companyId;
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
                ", fame=" + fame +
                '}';
    }
}
