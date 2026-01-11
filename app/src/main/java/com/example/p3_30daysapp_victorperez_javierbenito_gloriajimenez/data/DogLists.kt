package com.example.p3_30daysapp_victorperez_javierbenito_gloriajimenez.data

import com.example.p3_30daysapp_victorperez_javierbenito_gloriajimenez.R
import com.example.p3_30daysapp_victorperez_javierbenito_gloriajimenez.model.Dog

// Las 3 listas que contiene los 30 perros filtrados por macho, hembra y favoritos
object DogLists {
    // 15 primerps seran machos
    val male = listOf<Dog>(
        Dog(R.string.animal_01, 1, R.drawable.perro_01, R.string.descAnimal_01),
        Dog(R.string.animal_02, 2, R.drawable.perro_02, R.string.descAnimal_02),
        Dog(R.string.animal_03, 3, R.drawable.perro_03, R.string.descAnimal_03),
        Dog(R.string.animal_04, 4, R.drawable.perro_04, R.string.descAnimal_04),
        Dog(R.string.animal_05, 5, R.drawable.perro_05, R.string.descAnimal_05),
        Dog(R.string.animal_06, 6, R.drawable.perro_06, R.string.descAnimal_06),
        Dog(R.string.animal_07, 7, R.drawable.perro_07, R.string.descAnimal_07),
        Dog(R.string.animal_08, 8, R.drawable.perro_08, R.string.descAnimal_08),
        Dog(R.string.animal_09, 9, R.drawable.perro_09, R.string.descAnimal_09),
        Dog(R.string.animal_10, 10, R.drawable.perro_10, R.string.descAnimal_10),
        Dog(R.string.animal_11, 11, R.drawable.perro_11, R.string.descAnimal_11),
        Dog(R.string.animal_12, 12, R.drawable.perro_12, R.string.descAnimal_12),
        Dog(R.string.animal_13, 13, R.drawable.perro_13, R.string.descAnimal_13),
        Dog(R.string.animal_14, 14, R.drawable.perro_14, R.string.descAnimal_14),
        Dog(R.string.animal_15, 15, R.drawable.perro_15, R.string.descAnimal_15),
    )

    // El resto hembras, del 16 al 30
    val female = listOf<Dog>(
        Dog(R.string.animal_16, 1, R.drawable.perro_16, R.string.descAnimal_16),
        Dog(R.string.animal_17, 2, R.drawable.perro_17, R.string.descAnimal_17),
        Dog(R.string.animal_18, 3, R.drawable.perro_18, R.string.descAnimal_18),
        Dog(R.string.animal_19, 4, R.drawable.perro_19, R.string.descAnimal_19),
        Dog(R.string.animal_20, 5, R.drawable.perro_20, R.string.descAnimal_20),
        Dog(R.string.animal_21, 6, R.drawable.perro_21, R.string.descAnimal_21),
        Dog(R.string.animal_22, 7, R.drawable.perro_22, R.string.descAnimal_22),
        Dog(R.string.animal_23, 8, R.drawable.perro_23, R.string.descAnimal_23),
        Dog(R.string.animal_24, 9, R.drawable.perro_24, R.string.descAnimal_24),
        Dog(R.string.animal_25, 10, R.drawable.perro_25, R.string.descAnimal_25),
        Dog(R.string.animal_26, 11, R.drawable.perro_26, R.string.descAnimal_26),
        Dog(R.string.animal_27, 12, R.drawable.perro_27, R.string.descAnimal_27),
        Dog(R.string.animal_28, 13, R.drawable.perro_28, R.string.descAnimal_28),
        Dog(R.string.animal_29, 14, R.drawable.perro_29, R.string.descAnimal_29),
        Dog(R.string.animal_30, 15, R.drawable.perro_30, R.string.descAnimal_30)
    )

    val favorite = mutableListOf<Dog>(

    )
}