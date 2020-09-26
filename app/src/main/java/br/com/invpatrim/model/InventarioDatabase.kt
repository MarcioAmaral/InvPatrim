package br.com.invpatrim.model


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Inventario::class], version = 1, exportSchema = false)
abstract class InventarioDatabase : RoomDatabase() {

    abstract val inventarioDatabaseDao: InventarioDatabaseDao

    companion object {

        @Volatile
        private var INSTANCE: InventarioDatabase? = null

        fun getInstance(context: Context): InventarioDatabase {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        InventarioDatabase::class.java,
                        "inv_patrim_database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}