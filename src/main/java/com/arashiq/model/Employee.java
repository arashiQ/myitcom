package com.arashiq.model;

import com.arashiq.enums.Gender;
import org.springframework.data.mongodb.core.index.Indexed;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.*;

/**
 * @author arashiQ
 * @data 2016/07/04
 */
@Document
public class Employee {

    @Id
    private String id;
    @Indexed
    private long userId;
    private String firstName;
    private String lastName;
    private Gender gender;
    private String birthday;
    private String avatar;
    private String country;
    private String position;
    private boolean isCEO;

    private int intelligent;
    private int communication;
    private int creativity;
    private int spirit;
    private int loyalty;

    private int experience;
    private int lv;
    private int positionLv;
    private Map<String, Integer> skills;


    public Employee() {
    }

    public Employee(long userId, String firstName, String lastName, Gender gender, String birthday, String avatar, String country, String position, boolean isCEO, int intelligent, int communication, int creativity, int spirit, int loyalty, int experience, int lv, int positionLv, Map<String, Integer> skills) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthday = birthday;
        this.avatar = avatar;
        this.country = country;
        this.position = position;
        this.isCEO = isCEO;
        this.intelligent = intelligent;
        this.communication = communication;
        this.creativity = creativity;
        this.spirit = spirit;
        this.loyalty = loyalty;
        this.experience = experience;
        this.lv = lv;
        this.positionLv = positionLv;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", avatar='" + avatar + '\'' +
                ", country='" + country + '\'' +
                ", position='" + position + '\'' +
                ", isCEO=" + isCEO +
                ", intelligent=" + intelligent +
                ", communication=" + communication +
                ", creativity=" + creativity +
                ", spirit=" + spirit +
                ", loyalty=" + loyalty +
                ", experience=" + experience +
                ", lv=" + lv +
                ", positionLv=" + positionLv +
                ", skills=" + skills +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday.toString();
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isCEO() {
        return isCEO;
    }

    public void setCEO(boolean CEO) {
        isCEO = CEO;
    }

    public int getIntelligent() {
        return intelligent;
    }

    public void setIntelligent(int intelligent) {
        this.intelligent = intelligent;
    }

    public int getCommunication() {
        return communication;
    }

    public void setCommunication(int communication) {
        this.communication = communication;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public int getSpirit() {
        return spirit;
    }

    public void setSpirit(int spirit) {
        this.spirit = spirit;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public int getPositionLv() {
        return positionLv;
    }

    public void setPositionLv(int positionLv) {
        this.positionLv = positionLv;
    }

    public Map<String, Integer> getSkills() {
        return skills;
    }

    public void setSkills(Map<String, Integer> skills) {
        this.skills = skills;
    }
}
