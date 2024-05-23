package com.certificacion.RetoSysman.util;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Iframe extends PageObject
{
    public void ingresarIframe (String idframe)
    {
        getDriver().switchTo().frame(idframe);
    }

    public void SalirIframe ()
    {
        getDriver().switchTo().defaultContent();
    }

    public void ingresarIframeXpath (String pathframe)
    {
        WebElement element = getDriver().findElement(By.xpath(pathframe));
        getDriver().switchTo().frame(element);
    }


}
