package com.arashiq.model;

import com.arashiq.enums.PlaceEffect;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author arashiQ
 * @data 2016/08/02
 */
@Document
public class City {
    @Id
    private String name;
    private String country;
    private PlaceEffect cityEffect;
    private int effectValue;

    public City() {
    }

    public City(String name, String country, PlaceEffect cityEffect, int effectValue) {
        this.name = name;
        this.country = country;
        this.cityEffect = cityEffect;
        this.effectValue = effectValue;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public PlaceEffect getCityEffect() {
        return cityEffect;
    }

    public void setCityEffect(PlaceEffect cityEffect) {
        this.cityEffect = cityEffect;
    }

    public int getEffectValue() {
        return effectValue;
    }

    public void setEffectValue(int effectValue) {
        this.effectValue = effectValue;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", country=" + country +
                ", cityEffect=" + cityEffect +
                ", effectValue=" + effectValue +
                '}';
    }
}
