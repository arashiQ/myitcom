package com.arashiq.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * @author arashiQ
 * @data 2016/07/26
 */
//   SECRUITY, NET
@Document
public class Technology {
    @Id
    private String id;
    private int generation;
    private String name;
    private String desc;
    //extra work load as persent. ex:20->120%*workload
    private int extraWork;
    private int extraScore;

}
