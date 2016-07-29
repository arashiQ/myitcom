package com.arashiq.model;

import com.arashiq.enums.Gender;
import org.springframework.data.mongodb.core.index.Indexed;
import org.thymeleaf.util.ArrayUtils;

import javax.persistence.Id;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author arashiQ
 * @data 2016/07/04
 */
public class Employee {

    @Id
    private String id;
    @Indexed
    private long userId;
    private String employeeName;
    private Gender gender;
    private LocalDate birthday;
    private String avatar;
    private String country;
    private String position;

    private int intelligent;
    private int communication;
    private int creativity;
    private int spirit;
    private int loyalty;

    private int experience;
    private int lv;
    private int positionLv;
    private Map<Integer, Integer> skills;

}
