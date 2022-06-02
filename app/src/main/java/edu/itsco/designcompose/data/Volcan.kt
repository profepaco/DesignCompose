package edu.itsco.designcompose.data

data class Volcan(
    val nombre:String,
    val altura: Int,
    val imagenUrl: String = "https://phantom-marca.unidadeditorial.es/b69ab735c0b46837668b5d9e951afc52/resize/660/f/webp/assets/multimedia/imagenes/2021/09/28/16328549198511.jpg",
    val descripcion: String
)

object Volcanes{
    val listaDeVolcanes: List<Volcan> = listOf(
        Volcan(nombre ="Pico de Orizaba"
            ,altura = 5636,
            descripcion = "No es de Veracruz"
        ),
        Volcan(nombre ="Popocatepetl"
            ,altura = 5152,
            descripcion = "Este vato dejo que durmiera su mujer",
            imagenUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Mexico-Popocatepetl.jpg/275px-Mexico-Popocatepetl.jpg"
        ),
        Volcan(nombre ="Mujer dormida"
            ,altura = 4760,
            descripcion = "Se durmió esperando al Popo",
            imagenUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Lira_038.jpg/275px-Lira_038.jpg"
        ),
        Volcan(nombre ="Cofre de Perote"
            ,altura = 4235,
            descripcion = "No se mucho de el, pero tiene mas nieve que el de Orizaba",
            imagenUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/24/Perote_volcano.jpg/275px-Perote_volcano.jpg"
        ),
        Volcan(nombre ="Nevado de Colima"
            ,altura = 3970,
            descripcion = "Es de Colima",
            imagenUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/Nevado_de_Colima.JPG/275px-Nevado_de_Colima.JPG"
        )
    )
}