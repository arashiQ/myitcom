package com.arashiq.service;

import com.arashiq.Repository.*;
import com.arashiq.dto.CommonData;
import com.arashiq.dto.State;
import com.arashiq.dto.UserData;
import com.arashiq.enums.*;
import com.arashiq.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author arashiQ
 * @data 2016/08/02
 */
@Service
public class StateService {
    private static Long commonVersion = new Date().getTime();

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CompanyRepository companyRepository;
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
    @Autowired
    private ProjectRepository projectRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private TechnologyRepository technologyRepository;

    @Cacheable
    public CommonData getCommonData(){
        //enums
        List<PlaceEffect> placeEffects = Arrays.asList(PlaceEffect.values());
        List<PositionCategory>  positionCategories = Arrays.asList(PositionCategory.values());
        List<PositionFeature> positionFeatures = Arrays.asList(PositionFeature.values());
        List<ProjectCategory> projectCategories = Arrays.asList(ProjectCategory.values());
        List<ProjectKPI> projectKPIs = Arrays.asList(ProjectKPI.values());
        List<ProjectStage> projectStages = Arrays.asList(ProjectStage.values());
        List<SkillCategory> skillCategories = Arrays.asList(SkillCategory.values());
        List<SkillEffect> skillEffects = Arrays.asList(SkillEffect.values());
        List<SkillType> skillTypes = Arrays.asList(SkillType.values());
        List<TechnologyEffect> technologyEffects = Arrays.asList(TechnologyEffect.values());

        //data from mongodb
        List<City> cities = cityRepository.findAll();
        List<Country> countries = countryRepository.findAll();
        List<Position> positions = positionRepository.findAll();
        List<ProjectType> projectTypes = projectTypeRepository.findAll();
        List<Skill> skills = skillRepository.findAll();
        List<Technology> technologies = technologyRepository.findAll();

        return new CommonData(placeEffects,positionCategories,positionFeatures,projectCategories,projectKPIs,projectStages,skillCategories,skillEffects,skillTypes,technologyEffects,commonVersion,cities,countries,positions,projectTypes,skills,technologies);

    }

    public UserData getUserData(Long userId){

        User user = userRepository.findOne(userId);
        Company company = companyRepository.findByUserId(userId);
        List<Employee> employees = employeeRepository.findByUserId(userId);
        Project project = projectRepository.findByUserId(userId);
        List<Product> products = productRepository.findByUserId(userId);
        Long updateTime = user.getUpdateTime();

        return new UserData(user, company, employees,project, products,user.getGameDate(), user.getUpdateTime());

    }

    public State getState(Long userId){
        return new State(getCommonData(), getUserData(userId));
    }

}
