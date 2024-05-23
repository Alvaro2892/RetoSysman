package com.certificacion.RetoSysman.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UIIniciarSesion
{
    public static final Target ENTERUSERNAME = Target.the("Clic en el input y luego ingreso el username ").located(By.xpath("(//input[@class = 'twelve'])[1]"));
    public static final Target ENTERPASSWORD = Target.the("Clic en el input y luego ingreso la password ").located(By.xpath("(//input[@class = 'twelve'])[2]"));
    public static final Target BOTONLOGIN = Target.the("Clic en el boton login ").located(By.xpath("(//input[@class = 'alert button'])[1]"));

}
