package com.automatedtest.infrastructure.driver;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {

    @AfterStep
    public void beforeEachStep(Scenario sc){
        if(sc.isFailed()) {
            ScreenShotUtil.takeScreenshot();
        }
    }

}
