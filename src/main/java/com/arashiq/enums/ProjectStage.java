package com.arashiq.enums;

import java.util.Arrays;
import java.util.List;

/**
 * @author arashiQ
 * @data 2016/08/01
 */
public enum ProjectStage {

    PLAN,
    PREPARE,
    DEVELOP,
    DEBUG,
    FINISH,

    MARKET_RESEARCH,
    RESEARSH,

    REQUIREMENTS_ANALYSIS;

    public static final List<ProjectStage> APP_STAGES = Arrays.asList(PLAN, PREPARE, DEVELOP, DEBUG, FINISH);
    public static final List<ProjectStage> ENTERPRISE_STAGES = Arrays.asList(REQUIREMENTS_ANALYSIS, PREPARE, DEVELOP, DEBUG, FINISH);


    }
