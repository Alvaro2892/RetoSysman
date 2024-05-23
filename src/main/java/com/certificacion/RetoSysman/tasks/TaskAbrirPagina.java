package com.certificacion.RetoSysman.tasks;

import com.certificacion.RetoSysman.userinterface.UIAbrirPaginaSysman;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class TaskAbrirPagina implements Task
{
    private UIAbrirPaginaSysman uiAbrirPaginaSysman;

    public static TaskAbrirPagina sysman()
    {
        return Tasks.instrumented(TaskAbrirPagina.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo
                (
                        Open.browserOn(uiAbrirPaginaSysman)

                );
    }
}