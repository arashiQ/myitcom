package com.arashiq.enums;

import java.util.Arrays;
import java.util.List;

/**
 * @author arashiQ
 * @data 2016/07/19
 */
public enum ProjectKPI {

    FUNCTIONAL(5,0,5),
    CREATIVITY(3,0,7),
    SECURITY(10,0,0),

    UI(3,5,2),
    UX(0,10,0),
    NET(10,0,0),

    SCALABILITY(10,0,0),
    MAINTAINABILITY(10,0,0),
    CONTENT(0,10,0),

    //game
    FUN(0,0,10),
    GRAPHICS(4,6,0),
    SOUND(3,3,4),
    STORY(0,0,10);

    public final int develop;
    public final int design;
    public final int plan;

    ProjectKPI(int develop, int design, int plan) {
        this.develop = develop;
        this.design = design;
        this.plan = plan;
    }

    public static final List<ProjectKPI> APP_KPIS = Arrays.asList(FUNCTIONAL,CREATIVITY, SECURITY, UI, UX, NET);
    public static final List<ProjectKPI> ENTERPRISE_KPIS = Arrays.asList(FUNCTIONAL,SCALABILITY, MAINTAINABILITY, SECURITY, UI, NET);
    public static final List<ProjectKPI> WEBSITE_KPIS = Arrays.asList(CREATIVITY, CONTENT, MAINTAINABILITY, SECURITY, UI, NET);
    public static final List<ProjectKPI> GAME_KPIS = Arrays.asList(FUN, GRAPHICS, SOUND, CREATIVITY, STORY, NET);
    public static final List<ProjectKPI> TOOL_KPIS = Arrays.asList(FUNCTIONAL, CREATIVITY, SCALABILITY, SECURITY, UI, NET);
    public static final List<ProjectKPI> PLATFORM_KPIS = Arrays.asList(FUNCTIONAL, CONTENT, SCALABILITY, MAINTAINABILITY, SECURITY, NET);
}
