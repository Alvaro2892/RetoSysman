package com.certificacion.RetoSysman.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/MovimientosCuentasPorPagar.feature",
        glue = {"com.certificacion.RetoSysman.stepdefinitions","com.certificacion.RetoSysman.util"},
        snippets = CucumberOptions.SnippetType.CAMELCASE )

public class RunnerMovimientos
{
}
