package com.arashiq.model;

import com.arashiq.enums.PlaceEffect;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author arashiQ
 * @data 2016/07/28
 */
@Document
public class Country {
    @Id
    private String name;
    private String image;
    private PlaceEffect countryEffect;
    private int effectValue;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public PlaceEffect getCountryEffect() {
        return countryEffect;
    }

    public void setCountryEffect(PlaceEffect countryEffect) {
        this.countryEffect = countryEffect;
    }

    public int getEffectValue() {
        return effectValue;
    }

    public void setEffectValue(int effectValue) {
        this.effectValue = effectValue;
    }

    public Country() {
    }

    public Country( String name, String image, PlaceEffect countryEffect, int effectValue) {
        this.name = name;
        this.image = image;
        this.countryEffect = countryEffect;
        this.effectValue = effectValue;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", countryEffect=" + countryEffect +
                ", effectValue=" + effectValue +
                '}';
    }
}
