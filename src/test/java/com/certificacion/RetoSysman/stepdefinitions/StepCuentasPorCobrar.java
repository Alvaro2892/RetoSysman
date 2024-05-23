package com.certificacion.RetoSysman.stepdefinitions;

import com.certificacion.RetoSysman.model.ConstructorVar;
import com.certificacion.RetoSysman.questions.Verificar;
import com.certificacion.RetoSysman.tasks.EnviarFormulario;
import com.certificacion.RetoSysman.tasks.TaskAbrirPagina;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepCuentasPorCobrar
{
    @Given("que estoy en la pagina de CONTABILIDAD de Sysman")
    public void queEstoyEnLaPaginaDeCONTABILIDADDeSysman()
    {
        theActorCalled("Alvaro").wasAbleTo(TaskAbrirPagina.sysman());
    }
    @When("selecciono la opcion MOVIMIENTOS y elijo COMPROBANTES CUENTAS POR PAGAR yhago clic en el boton nuevo")
    public void seleccionoLaOpcionMOVIMIENTOSYElijoCOMPROBANTESCUENTASPORPAGARYhagoClicEnElBotonNuevo(List<ConstructorVar> constructorVars)
    {
        theActorInTheSpotlight().attemptsTo(EnviarFormulario.comprobanteSysman(constructorVars));

    }
    @Then("se abre un formulario para crear un nuevo comprobante y verifico el mensaje {string}")
    public void seAbreUnFormularioParaCrearUnNuevoComprobanteYVerificoElMensaje(String VerificarMensajePagina)
    {
        theActorInTheSpotlight().should(seeThat(Verificar.mensajeSitioWeb(VerificarMensajePagina)));

    }

}
