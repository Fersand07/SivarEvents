package com.project.sibarevents.network.restapi

data class Data(
    val date: String,
    val description: String,
    val id: Int,
    val image_url: String,
    val location: String,
    val name: String
)