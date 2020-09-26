package br.com.invpatrim.model

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface InventarioDatabaseDao {
    @Insert
    fun insert(inventario: Inventario)

    @Update
    fun update(inventario: Inventario)

    @Delete
    fun delete(inventario: Inventario)

    @Query("SELECT * FROM inventario WHERE inventarioId = :key")
    fun get(key: Long): Inventario?

    @Query("DELETE FROM inventario")
    fun clear()

    @Query("SELECT * FROM inventario ORDER BY inventarioId DESC")
    fun getAllInventario(): LiveData<List<Inventario>>

}