package com.certificacion.RetoSysman.tasks;

import com.certificacion.RetoSysman.model.ConstructorVar;
import com.certificacion.RetoSysman.userinterface.UIIniciarSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class TaskIniciarSesion implements Task

{
    private List<ConstructorVar> constructorVars;


    public TaskIniciarSesion(List<ConstructorVar> constructorVars)
    {
        this.constructorVars = constructorVars;
    }


    public static TaskIniciarSesion webSysman(List<ConstructorVar> constructorVars)
    {
        return Tasks.instrumented(TaskIniciarSesion.class, constructorVars);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {

        for (ConstructorVar constructorVar : constructorVars)
        {
            actor.attemptsTo
                    (
                            Click.on(UIIniciarSesion.ENTERUSERNAME),
                            Enter.theValue(constructorVar.getUserName()).into(UIIniciarSesion.ENTERUSERNAME),
                            Click.on(UIIniciarSesion.ENTERPASSWORD),
                            Enter.theValue(constructorVar.getPassword()).into(UIIniciarSesion.ENTERPASSWORD),
                            Click.on(UIIniciarSesion.BOTONLOGIN)


                    );
        }


    }
}
