package org.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Amazon\\amazon.feature",glue="org.step",monochrome=true)
public class RunnerClass {

}
