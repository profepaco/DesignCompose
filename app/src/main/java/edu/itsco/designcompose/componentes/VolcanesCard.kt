package edu.itsco.designcompose.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.rememberImagePainter
import edu.itsco.designcompose.data.Volcan
import edu.itsco.designcompose.navegacion.Pantalla

@Composable
fun VolcanesCard(volcan: Volcan, navController: NavHostController){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clip(RoundedCornerShape(4.dp))
            .background(MaterialTheme.colors.surface)
            .clickable(
                onClick = { /*navegara a la siguiente */
                    navController.navigate(route = Pantalla.Detalle.ruta)
                }
            )
            .padding(16.dp)
    ){
        Surface(
            modifier = Modifier.size(50.dp),
            shape = CircleShape,
            color = MaterialTheme.colors.onSurface.copy(alpha = 0.25f)
        ){
            Image(
                painter = rememberImagePainter(
                    data = volcan.imagenUrl
                ),
                contentDescription = "Imagen Volcan",
                contentScale = ContentScale.FillBounds
            )
        }
        Column(
            modifier = Modifier
                .padding(horizontal = 8.dp)
                .align(Alignment.CenterVertically)
        ) {
            Text(
                volcan.nombre,
                fontWeight = FontWeight.Bold)
            Text(
                "${volcan.altura} metros",
                style = MaterialTheme.typography.body2
            )
        }
    }
}