package com.arashiq.controller;

import com.arashiq.dto.CommonData;
import com.arashiq.dto.State;
import com.arashiq.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author arashiQ
 * @data 2016/08/02
 */
@RestController
@RequestMapping(value="/state")
public class StateController {
    @Autowired
    private StateService stateService;

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public State init(@PathVariable Long id){
        return stateService.getState(id);
    }
    @RequestMapping(value="/a/{id}", method= RequestMethod.GET)
    public CommonData init2(@PathVariable Long id){
        return stateService.getCommonData();
    }

}
