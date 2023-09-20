package com.example.cuadricula_josemgm.model
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringNameCourse: Int,
    val quotaCourse:Int,
    @DrawableRes val imageCourse: Int
)
