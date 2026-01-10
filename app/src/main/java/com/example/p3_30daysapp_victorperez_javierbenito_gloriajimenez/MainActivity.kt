package com.example.p3_30daysapp_victorperez_javierbenito_gloriajimenez

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.p3_30daysapp_victorperez_javierbenito_gloriajimenez.data.DaySource
import com.example.p3_30daysapp_victorperez_javierbenito_gloriajimenez.model.Day
import com.example.p3_30daysapp_victorperez_javierbenito_gloriajimenez.ui.theme.P3_30DaysApp_VictorPerez_JavierBenito_GloriaJimenezTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            P3_30DaysApp_VictorPerez_JavierBenito_GloriaJimenezTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DaysListApp()
                }
            }
        }
    }
}

//muestra la lista de tarjetas de dias
@Composable
fun DaysListApp() {

    Surface(
        modifier = Modifier
        //.padding(top = 24.dp)

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()

        ) {


            Column(
                modifier = Modifier

                    .weight(5f)
            ) {

                LazyColumn(modifier = Modifier.padding(16.dp)) {
                    items(DaySource.days) { day ->
                        DayCard(day = day, modifier = Modifier.padding(bottom = 16.dp))
                    }
                }
            }

            Column(
                modifier = Modifier
                    .weight(1f)

            ) {

                navigationBar()

            }
        }

    }
}

@Composable
fun navigationBar() {
    NavigationBar(
        modifier = Modifier


    ) {


        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = null
                )
            },
            selected = true,
            onClick = {}
        )

        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Face,
                    contentDescription = null
                )
            },
            selected = true,
            onClick = {}
        )

        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = null
                )
            },
            selected = true,
            onClick = {}
        )

    }
}


//muestra una tarjeta de dia
@Composable
fun DayCard(day: Day, modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }
    Card(
        modifier = modifier
            .animateContentSize()
            .height(
                if (expanded) {
                    400.dp
                } else 280.dp

            )
            .fillMaxWidth()
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) {
                expanded = !expanded
            }
    ) {
        Column() {

            Image(
                painter = painterResource(id = day.ImageRes),
                contentDescription = stringResource(id = day.name),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),

                contentScale = ContentScale.FillBounds //Escalamos la imagen para las imagenes con distinto aspect ratio
            )


            Text(
                text = "Día ${day.dias}",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp)
            )




            Text(
                text = stringResource(id = day.name),
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 8.dp)
            )

            Text(
                text = stringResource(id = day.description),
                modifier = modifier
                    .padding(start = 16.dp, end = 16.dp, bottom = 8.dp)
                    .verticalScroll(
                        rememberScrollState()
                    )
            )
        }


    }
}


@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
fun DaysListPreview() {
    P3_30DaysApp_VictorPerez_JavierBenito_GloriaJimenezTheme {
        DaysListApp()

    }
}
