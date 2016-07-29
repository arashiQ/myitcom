package com.arashiq.model;

import com.arashiq.enums.CountryEffect;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author arashiQ
 * @data 2016/07/28
 */
@Document
public class Country {
    @Id
    private String id;
    private String code;
    private String name;
    private String image;
    private CountryEffect countryEffect;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

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

    public CountryEffect getCountryEffect() {
        return countryEffect;
    }

    public void setCountryEffect(CountryEffect countryEffect) {
        this.countryEffect = countryEffect;
    }

    public Country() {
    }

    public Country(String id, String code, String name, String image, CountryEffect countryEffect) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.image = image;
        this.countryEffect = countryEffect;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", countryEffect=" + countryEffect +
                '}';
    }
}
