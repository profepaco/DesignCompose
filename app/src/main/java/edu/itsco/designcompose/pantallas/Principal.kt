package edu.itsco.designcompose.pantallas

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import edu.itsco.designcompose.componentes.VolcanesCard
import edu.itsco.designcompose.data.Volcan
import edu.itsco.designcompose.data.Volcanes

@Composable
fun Principal(volcanes: List<Volcan> = Volcanes.listaDeVolcanes,
navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Volcanes de México") }
            )
        }
    ) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.surface
        ){
            LazyColumn{
                items(items = volcanes){ volcan ->
                    VolcanesCard(
                        volcan = volcan,
                        navController = navController
                    )
                }
            }
        }
    }

}

@Composable
@Preview(showBackground = true)
fun PrincipalPreview(){
    Principal(navController = rememberNavController())
}