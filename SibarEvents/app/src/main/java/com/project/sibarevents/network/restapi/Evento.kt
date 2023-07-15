package com.project.sibarevents.network.restapi

data class Evento(
    val `data`: List<Data>,
    val links: Links,
    val meta: Meta
)