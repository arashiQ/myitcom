package com.arashiq.service;

import com.arashiq.Repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author arashiQ
 * @data 2016/06/20
 */
@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

}