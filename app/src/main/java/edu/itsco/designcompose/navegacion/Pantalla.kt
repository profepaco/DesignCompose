package edu.itsco.designcompose.navegacion

sealed class Pantalla(val ruta: String){
    object Principal: Pantalla("pantalla_principal")
    object Detalle: Pantalla("pantalla_detalle")
}
