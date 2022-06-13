package edu.itsco.designcompose.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import edu.itsco.designcompose.pantallas.Detalle
import edu.itsco.designcompose.pantallas.Principal

@Composable
fun ConfiguracionArbolNavegacion(
    navController: NavHostController
){
    NavHost(
     navController = navController,
     startDestination = Pantalla.Principal.ruta
    ){
        composable(
            route = Pantalla.Principal.ruta
        ){
            Principal(navController = navController)
        }
        composable(
            route = Pantalla.Detalle.ruta
        ){
            Detalle(navController = navController)
        }
    }
}