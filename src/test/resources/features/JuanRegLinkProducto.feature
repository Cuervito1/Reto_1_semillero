#language: en
  Feature: Visualizar la descripción de un producto de la tienda virtual

    Scenario: Seleccionar el producto de la tienda virtual y ver si descripcion

      Given quiero escoger un producto de la tienda virtual
      When Realizo click el producto de la tienda virtual
      Then me muestra los resultados o descripcion del producto


