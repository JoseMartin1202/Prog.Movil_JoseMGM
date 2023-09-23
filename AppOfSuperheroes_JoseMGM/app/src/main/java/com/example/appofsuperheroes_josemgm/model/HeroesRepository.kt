package com.example.appofsuperheroes_josemgm.model

import com.example.appofsuperheroes_josemgm.R

object HeroesRepository {
    val heroes = listOf(
        SuperHeroe(
            superheroeName = R.string.hero1,
            description = R.string.description1,
            image = R.drawable.android_superhero1
        ),
        SuperHeroe(
            superheroeName = R.string.hero2,
            description = R.string.description2,
            image = R.drawable.android_superhero2
        ),
        SuperHeroe(
            superheroeName = R.string.hero3,
            description = R.string.description3,
            image = R.drawable.android_superhero3
        ),
        SuperHeroe(
            superheroeName = R.string.hero4,
            description = R.string.description4,
            image = R.drawable.android_superhero4
        ),
        SuperHeroe(
            superheroeName = R.string.hero5,
            description = R.string.description5,
            image = R.drawable.android_superhero5
        ),
        SuperHeroe(
            superheroeName = R.string.hero6,
            description = R.string.description6,
            image = R.drawable.android_superhero6
        )
    )
}