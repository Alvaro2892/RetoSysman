package com.certificacion.RetoSysman.tasks;

import com.certificacion.RetoSysman.interactions.CambiarIframe;
import com.certificacion.RetoSysman.interactions.SalirDeIframe;
import com.certificacion.RetoSysman.interactions.Wait;
import com.certificacion.RetoSysman.model.ConstructorVar;
import com.certificacion.RetoSysman.userinterface.UIEnviarFormulario;
import com.certificacion.RetoSysman.userinterface.UIIniciarSesion;
import com.certificacion.RetoSysman.util.Iframe;
import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EnviarFormulario implements Task
{

    private List<ConstructorVar> constructorVars;

    private Iframe iframe;




    public EnviarFormulario(List<ConstructorVar> constructorVars)
    {
        this.constructorVars = constructorVars;
    }


    public static EnviarFormulario comprobanteSysman(List<ConstructorVar> constructorVars)
    {
        return Tasks.instrumented(EnviarFormulario.class, constructorVars);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        for (ConstructorVar constructorVar : constructorVars)
        {

            actor.attemptsTo
                    (
                            TaskIniciarSesion.webSysman(constructorVars),
                            Click.on(UIEnviarFormulario.CLICCONTABILIDAD),
                            Click.on(UIEnviarFormulario.CLICMOVIMIENTO),
                            Click.on(UIEnviarFormulario.CLICCUENTASPORPAGAR),
                            CambiarIframe.a(UIEnviarFormulario.CAMBIARIFRAME),
                            Wait.por(3000),
                            Click.on(UIEnviarFormulario.INGRESARMESCLICK),
                            //Wait.por(8000),
                            Click.on(UIEnviarFormulario.INGRESARMES)
                            //Wait.por(3000)

                    );
            actor.attemptsTo
                    (
                            Click.on(UIEnviarFormulario.INGRESARTIPOCOMPROBANTE)

                    );
            actor.attemptsTo
                    (
                            //CambiarIframe.a(UIEnviarFormulario.CAMBIARIFRAME),
                            Click.on(UIEnviarFormulario.ESCOGERCUENTASPORCOBRAR),
                            Click.on(UIEnviarFormulario.CLICBOTONACEPTAR),
                            SalirDeIframe.alContenidoPrincipal(),

                            Click.on(UIEnviarFormulario.CLICBOTONNUEVO),
                            Wait.por(2000),

                            //Click.on(UIEnviarFormulario.INGRESARDETALLE),
                            Enter.theValue(constructorVar.getUserName()).into(UIEnviarFormulario.INGRESARDETALLE),
                            Enter.theValue(constructorVar.getBaseGrabale()).into(UIEnviarFormulario.INGRESARBASEGRAVABLE),
                            Click.on(UIEnviarFormulario.CLICBOTONGUARDAR),
                            Wait.por(2000),
                            //Enter.theValue(constructorVar.getUserName()).into(UIEnviarFormulario.INGRESARDETALLE),
                            Click.on(UIEnviarFormulario.CLICBOTONCODIFICARRETENCIONES),
                            Click.on(UIEnviarFormulario.CLICBOTONNUEVO),
                            Click.on(UIEnviarFormulario.CLICRETENCION),
                            Click.on(UIEnviarFormulario.CLICCONTRIBUCIONES),
                            Click.on(UIEnviarFormulario.CLICCODIGO),
                            Click.on(UIEnviarFormulario.CLICESCOGERCODIGO),
                            Click.on(UIEnviarFormulario.CLICBOTONGUARDARREGISTRO),






                            Wait.por(2000)
                    );


        }
    }
}
