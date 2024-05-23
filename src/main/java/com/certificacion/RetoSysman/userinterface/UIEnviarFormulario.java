package com.certificacion.RetoSysman.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UIEnviarFormulario
{
    public static final Target CLICCONTABILIDAD = Target.the("Clic en la opcion contabilidad ").located(By.id("menu1"));
    public static final Target CLICMOVIMIENTO = Target.the("Clic en la opcion movimiento ").located(By.id("menu103"));
    public static final Target CLICCUENTASPORPAGAR = Target.the("Clic en la opcion cuentas por pagar ").located(By.id("menu10306"));
    public static final Target CAMBIARIFRAME = Target.the("Cambiar iframe ").located(By.xpath("(//iframe[@class='heightIframe'])"));
    public static final Target INGRESARMESCLICK = Target.the("Ingresar mes ").located(By.xpath("(//label[@class='ui-selectonemenu-label ui-inputfield ui-corner-all'])[2]"));
    public static final Target INGRESARMES = Target.the("Ingresar mes ").located(By.xpath("(//li[@class='ui-selectonemenu-item ui-selectonemenu-list-item ui-corner-all'])[64]"));
    public static final Target INGRESARTIPOCOMPROBANTE = Target.the("Ingresar mes ").located(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'])[1]"));
    public static final Target ESCOGERCUENTASPORCOBRAR = Target.the("Escoger cuentas por cobrar").located(By.xpath("(//span[contains(text (), 'Compras y Cuentas por Pagar')])"));
    public static final Target CLICBOTONACEPTAR = Target.the("Clic boton aceptar").located(By.xpath("(//span[contains(text (), 'Aceptar')])"));
    public static final Target CLICBOTONNUEVO = Target.the("Clic boton NUEVO").located(By.xpath("(//div[contains(text (), 'Nuevo')])"));
    public static final Target INGRESARDETALLE = Target.the("Ingresar detalle").located(By.xpath("(//textarea[@class = 'ui-inputfield ui-inputtextarea ui-widget ui-state-default ui-corner-all inputTab'])[2]"));
    public static final Target INGRESARBASEGRAVABLE= Target.the("Ingresar base gravable").located(By.xpath("(//input[@class = 'ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all pe-inputNumber'])[3]"));
    public static final Target CLICBOTONGUARDAR= Target.the("Clic boton guardar").located(By.xpath("(//div[contains(text (), 'Guardar')])[1]"));
    public static final Target CLICBOTONCODIFICARRETENCIONES= Target.the("Clic boton codificar retenciones").located(By.xpath("(//span[contains(text (), 'Codificar Retenciones')])[1]"));
    public static final Target CLICRETENCION= Target.the("Clic tipo retencion").located(By.xpath("(//label[@class='ui-selectonemenu-label ui-inputfield ui-corner-all'])[1]"));
    public static final Target CLICCONTRIBUCIONES= Target.the("Clic contribuciones").located(By.xpath("(//li[@class='ui-selectonemenu-item ui-selectonemenu-list-item ui-corner-all'])[4]"));
    public static final Target CLICCODIGO= Target.the("Clic codigo").located(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'])[1]"));
    public static final Target CLICESCOGERCODIGO= Target.the("Clic escoger codigo").located(By.xpath("(//span[contains(text (), 'CONTRIB. ESPECIAL 5% COFINAN NACIONAL')])"));
    public static final Target CLICBOTONGUARDARREGISTRO= Target.the("Clic boton guardar").located(By.xpath("(//span[contains(text (), 'Guardar')])"));








}
