Feature: Crear un nuevo comprobante de cuentas por pagar en la pagina Sysman

  Scenario: Crear un nuevo comprobante
    Given que estoy en la pagina de CONTABILIDAD de Sysman
    When  selecciono la opcion MOVIMIENTOS y elijo COMPROBANTES CUENTAS POR PAGAR yhago clic en el boton nuevo
      | userName   | password       | baseGrabale|
      | PRUEBAS_SS | PRUEBAS_SS2022 | 10000      |
    Then se abre un formulario para crear un nuevo comprobante y verifico el mensaje "DEMOSTRACIONES"
