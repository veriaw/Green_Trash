package com.veriaw.kriptografiapp.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.veriaw.kriptografiapp.data.entity.UserEntity

@Database(entities = [UserEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {
    abstract fun userDao(): UserDao

    companion object{
        @Volatile
        private var instance: AppDatabase? = null
        fun getInstance(context: Context):AppDatabase =
            instance?: synchronized(this){
                instance?: Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,"greentrash.db"
                ).build()
            }
    }
}