#language: en

  Feature: Busqueda exitosa  con los productos de Bogota

    Scenario: Seleccionar un producto de Bogota y ver su descripcion

      Given me encuentro en la tienda virtual en los productos de Bogota
      When Hago click el producto de la tienda virtual
      Then me muestra la descripcion del producto


