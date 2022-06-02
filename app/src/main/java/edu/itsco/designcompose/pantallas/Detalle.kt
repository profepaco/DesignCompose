package edu.itsco.designcompose.pantallas


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Detalle() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(
            "Pantalla detalle",
            style = MaterialTheme.typography.h4
        )
    }
}

@Composable
@Preview(showBackground = true)
fun DetallePreview(){
    Detalle()
}