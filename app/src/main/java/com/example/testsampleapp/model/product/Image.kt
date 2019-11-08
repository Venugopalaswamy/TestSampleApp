package com.example.testsampleapp.model.product


import com.squareup.moshi.Json

data class Image(
    @Json(name = "0")
    val imageStr: String
)