#language: en
  Feature: Busqueda exitosa con datos extraidos del Excel

    Scenario: Buscar en la url correspondiente

      Given que me encuentro en el buscador de JuanRegala
      When llamo los datos de mi archivo Excel
      Then realiza la busqueda y muestra resultados