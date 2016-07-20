package com.arashiq.model;

import com.arashiq.enums.Gender;
import org.springframework.data.mongodb.core.index.Indexed;

import javax.persistence.Id;
import java.util.Map;

/**
 * @author arashiQ
 * @data 2016/07/04
 */
public class Employee {

    @Id
    private Long employeeId;
    @Indexed
    private Long userId;
    private String employeeName;
    private Gender gender;
    private Integer age;
    private String avatar;
    private String country;
    private String position;

    private int intelligent;
    private int communication;
    private int creativity;
    private int spirit;

    private int lv;
    private int positionLv;
    private Map<Integer, Integer> skills;

}
