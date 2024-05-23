package com.certificacion.RetoSysman.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class QVerificarMensaje
{
    public static final Target VERIFICARMENSAJE= Target.the("Verificar mensaje").located(By.xpath("(//div[contains(text (), 'DEMOSTRACIONES')])"));

}
