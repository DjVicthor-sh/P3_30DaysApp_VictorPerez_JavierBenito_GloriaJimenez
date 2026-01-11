// Victor Perez, Gloria Jimena y Javier Benito

package com.example.p3_30daysapp_victorperez_javierbenito_gloriajimenez.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// Modelo de datos para los perros que tendra el nombre, el numero de dia y la imagen
// guardamos las referencias a los textos R.stirng y a la foto R.drawable
data class Dog(

    @StringRes val name: Int,
    val dias: Int,
    @DrawableRes val imageRes: Int,
    @StringRes val description: Int,

    )
