package com.example.testsampleapp.model.product


import com.squareup.moshi.Json

data class ClsProduct(
    @Json(name = "attributes")
    val attributes: Attributes,
    @Json(name = "id")
    val id: Int,
    @Json(name = "image")
    val image: Image,
    @Json(name = "name")
    val name: String
)