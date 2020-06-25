# cp01: Rimac Procurador
@tag
Feature: RimacProcurador

  @Test @ContactarCliente
  Scenario Outline: Contactar cliente
    Given accedo al sistema Rimac Procurador con ubicacion "<ubicacion>" cerca al cliente
    When ingreso usuario "<usuario>" y password "<password>"
    And selecciono opcion Ingresar
    And selecciono opcion Ver Mapa
    And ingreso el ultimo digito de la placa "<placa>"
    And selecciono opcion Confirmar
    And selecciono Aceptar
    Then se debe mostrar mensaje "<mensaje>" satisfactorio

    ###DATOS###@DataPruebaMobile|1@01-ContactarCliente
    Examples: 
      |0|ubicación|usuario|password|placa|mensaje|
      |1|-12.0965159, -77.0278309|procuradorautoapp1@gmail.com|Test2020#|ABA417|El proceso terminó correctamente.|
      |2|-12.1691665, -77.0001753|procuradorautoapp2@gmail.com|Test2020#|ABA418|El proceso terminó correctamente.|
      |3|-12.1110620, -77.0315913|procuradorautoapp3@gmail.com|Test2020#|ABA419|El proceso terminó correctamente.|

  @FinalizarAtencion
  Scenario Outline: Finalizar Atencion
    Given accedo al sistema Rimac Procurador con ubicacion "<ubicacion>" cerca al cliente
    When ingreso usuario "<usuario>" y password "<password>"
    And selecciono opcion Ingresar
    And selecciono opcion Ver Mapa
    And ingreso el ultimo digito de la placa "<placa>"
    And selecciono opcion Confirmar
    And selecciono Aceptar
    And selecciono tipo de atencion "<tipo atencion>" y tipo de siniestro "<tipo siniestro>"
    And selecciono finalizar atencion
    Then se debe mostrar la pagina principal

    ###DATOS###@DataPruebaMobile|1@02-FinalizarAtencion
    Examples: 
      |0|ubicacion|usuario|password|placa|tipo atencion|tipo siniestro|mensaje|
      |1|-12.0965159, -77.0278309|procuradorautoapp1@gmail.com|Test2020#|ABA517|Denuncia Policial|Choque|El proceso terminó correctamente.|
      |2|-12.1691665, -77.0001753|procuradorautoapp2@gmail.com|Test2020#|ABA518|Constatación de daños|NA|El proceso terminó correctamente.|
      |3|-12.1110620, -77.0315913|procuradorautoapp3@gmail.com|Test2020#|ABA519|Speed|Choque|El proceso terminó correctamente.|
      |4|-12.0965159, -77.0278309|procuradorautoapp4@gmail.com|Test2020#|ABA520|Speed|Robo parcial|El proceso terminó correctamente.|
      |5|-12.1692327, -77.0002525|procuradorautoapp5@gmail.com|Test2020#|ABA521|Denuncia Policial|Choque|El proceso terminó correctamente.|
