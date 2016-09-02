package com.arashiq.controller;

import com.arashiq.Repository.*;
import com.arashiq.enums.*;
import com.arashiq.model.*;
import com.arashiq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.*;

/**
 * Created by A13054 on 2016/06/17.
 */
@RestController
public class HelloController {

    @Autowired
    private UserService userService;
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private CityRepository cityRepository;
    @Autowired
    private CountryRepository countryRepository;
    @Autowired
    private SkillRepository skillRepository;
    @Autowired
    private PositionRepository positionRepository;
    @Autowired
    private ProjectTypeRepository projectTypeRepository;

    @RequestMapping(value="/hello", method= RequestMethod.GET)
    public Employee index(Model model){
        User user = new User("userName", "password", "avatar", "companyId", "1980-01-01", new Date().getTime(), 9);
//        User user = userService.getUser(1L);
        user = userService.createuser(user);
        Country china = new Country("China","chinaImage", PlaceEffect.BASE_SALARY, -20);
        china = countryRepository.save(china);
        City beijing = new City("BEIJING", china.getName(), PlaceEffect.BASE_COST, -20);

        Skill coding = new Skill( null, 1, "Coding", "Coding", SkillCategory.TECHNOLOGY, SkillEffect.DEVELOP, 0);
        Skill systemDesign = new Skill(null, 1, "System Design", "System Design", SkillCategory.TECHNOLOGY, SkillEffect.DEVELOP, 0);
        Skill design = new Skill(null, 1, "design", "design", SkillCategory.DESIGN, SkillEffect.DESIGN, 0);
        Skill plan = new Skill(null, 1, "plan", "plan", SkillCategory.COMMON, SkillEffect.PLAN, 0);
        skillRepository.save(coding);
        skillRepository.save(systemDesign);
        skillRepository.save(design);
        skillRepository.save(plan);

        Map<ProjectKPI, Integer> requiredKPIs = new HashMap<>();
        Random r = new Random();
        for(ProjectKPI kpi: ProjectKPI.APP_KPIS){
            requiredKPIs.put(kpi, r.nextInt(10));
        };
        ProjectType wordPresess = new ProjectType("Word Processor", 2, 2, 1, ProjectCategory.APP, requiredKPIs, Arrays.asList(ProjectStage.PLAN, ProjectStage.DEVELOP, ProjectStage.DEBUG, ProjectStage.FINISH));
        for(ProjectKPI kpi: ProjectKPI.APP_KPIS){
            requiredKPIs.put(kpi, r.nextInt(10));
        };
        ProjectType spreadsheet  = new ProjectType("Spreadsheet ", 2, 2, 1, ProjectCategory.APP, requiredKPIs, Arrays.asList(ProjectStage.PLAN, ProjectStage.DEVELOP, ProjectStage.DEBUG, ProjectStage.FINISH));

        projectTypeRepository.save(wordPresess);
        projectTypeRepository.save(spreadsheet);



        Position coder = new Position("coder","freah coder", "1980-01-01", 1, 200000, coding.getName(), new HashMap<>(), PositionCategory.TECH, false);
        Map<String, Integer> requiredSkills = new HashMap<>();
        requiredSkills.put(coding.getName(), 3);
        Position se = new Position("se","ソフトウェアエンジニアリング", "1981-01-01", 2, 300000, systemDesign.getName(), requiredSkills, PositionCategory.TECH, false);
        Position designer = new Position("designer","designer 0", "1981-01-01", 1, 200000, design.getName(), new HashMap<>(), PositionCategory.DESIGN, false);

        positionRepository.save(coder);
        positionRepository.save(designer);

        Map<String, Integer> initSkills = new HashMap<>();
        initSkills.put(coding.getName(), 1);
        Map<String, Integer> init2Skills = new HashMap<>();
        init2Skills.put(design.getName(), 1);



        Employee qiao = new Employee(1L, "Yicheng","Qiao", Gender.MALE, "1987-04-09", "MYET22", china.getName(), coder.getName(), true, 8, 7, 6, 7, 7, 50, 1, 1, initSkills);
        Employee jin = new Employee(1L, "Man","Jin", Gender.FEMALE, "1987-11-23", "FYEA09", china.getName(), designer.getName(), true, 7, 6, 6, 8, 6, 50, 1, 1, init2Skills);


        qiao = employeeRepository.save(qiao);
        jin = employeeRepository.save(jin);
        List<Employee> employeeList = employeeRepository.findByUserId(1L);
        employeeList.forEach(System.out::println);

        model.addAttribute("hello", "HelloHello");
        model.addAttribute("user", user);
        return qiao;
    }

}
