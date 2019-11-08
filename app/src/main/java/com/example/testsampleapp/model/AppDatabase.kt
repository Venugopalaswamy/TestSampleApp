package com.example.testsampleapp.model

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.testsampleapp.model.brand.BrandDao
import com.example.testsampleapp.model.brand.ClsBrand

@Database(entities = [ClsBrand::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun brandDao(): BrandDao
}