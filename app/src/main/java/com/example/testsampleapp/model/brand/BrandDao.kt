package com.example.testsampleapp.model.brand

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
@Dao
interface BrandDao {


    @get:Query("SELECT * FROM clsbrand")
    val all: List<ClsBrand>

    @Insert
    fun insertAll(vararg users: ClsBrand)

}