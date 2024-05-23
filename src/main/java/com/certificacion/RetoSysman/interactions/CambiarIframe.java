package com.certificacion.RetoSysman.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class CambiarIframe implements Interaction
{
    private Target frameXpath;

    public CambiarIframe(Target  frameXpath) {
        this.frameXpath = frameXpath;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement element = frameXpath.resolveFor(actor);
        BrowseTheWeb.as(actor).getDriver().switchTo().frame(element);
    }

    public static CambiarIframe a(Target frameXpath) {
        return new CambiarIframe(frameXpath);
    }
}
