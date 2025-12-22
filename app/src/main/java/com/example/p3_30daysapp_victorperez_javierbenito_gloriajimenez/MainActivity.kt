package com.example.p3_30daysapp_victorperez_javierbenito_gloriajimenez

import android.os.Bundle
import android.view.Surface
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Preview
@Composable
fun preview() {
    //Esto son de ejemplo, mas tarde se pasara a una lista.
    var day1 =
        Day(1, "Dia1", painterResource(R.drawable.ic_launcher_foreground), "Descripcion dia1", 1)
    var day2 =
        Day(2, "Dia2", painterResource(R.drawable.ic_launcher_foreground), "Descripcion Dia2", 2)
    Surface(
        modifier = Modifier.fillMaxSize(),

        ) {

        tarjetaDia(day1)
    }

}
//Esta funcion es la encargada de hacer cada tarjeta individual.
@Composable
fun tarjetaDia(day: Day, modifier: Modifier = Modifier) {

    Column(
        modifier = modifier.padding(
            bottom = 24.dp
        ),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = null,
        )
    
    Row(



    ) {
        Text(
            text = "${day.numDia}"
        )
        Text(
            text = "${day.titulo}"
        )
    }

}
}

//Esta funcion organizara las distintas tarjetasDia dando el aspecto final
@Composable
fun mainView(modifier: Modifier = Modifier) {

}


