package com.certificacion.RetoSysman.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class SalirDeIframe implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().switchTo().defaultContent();
    }

    public static SalirDeIframe alContenidoPrincipal() {
        return new SalirDeIframe();
    }
}