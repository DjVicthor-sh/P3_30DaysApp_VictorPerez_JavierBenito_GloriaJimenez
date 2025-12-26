package com.example.p3_30daysapp_victorperez_javierbenito_gloriajimenez.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

//modelo de datos para los dias que tendra el nombre, el numero de dia y la imagen
data class Day(
    @StringRes val name: Int,
    val dias: Int,
    @DrawableRes val ImageRes: Int,
    @StringRes val description: Int,
)
