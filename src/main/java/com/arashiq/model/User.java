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

    private long avatarId;

    private long companyId;

    private Integer fame;

    public User() {
    }

    public User(long id, String userName, String password, long avatarId, long companyId, Integer fame) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.avatarId = avatarId;
        this.companyId = companyId;
        this.fame = fame;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getAvatarId() {
        return avatarId;
    }

    public void setAvatarId(Long avatarId) {
        this.avatarId = avatarId;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Integer getFame() {
        return fame;
    }

    public void setFame(Integer fame) {
        this.fame = fame;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", avatarId=" + avatarId +
                ", companyId=" + companyId +
                ", fame=" + fame +
                '}';
    }
}
