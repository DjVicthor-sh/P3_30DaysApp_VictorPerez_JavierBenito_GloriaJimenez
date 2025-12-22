package com.example.p3_30daysapp_victorperez_javierbenito_gloriajimenez

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.painter.Painter

class Day (
    val numDia: Int,
    val titulo: String, @DrawableRes img: Painter, val desc: String,
){
}