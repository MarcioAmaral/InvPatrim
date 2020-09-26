package br.com.invpatrim.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Inventario(
    @PrimaryKey val inventarioId: Long,
    val empresa: Int = 0,
    val unid_negocio: String = "",
    val local: String,
    val descricao: String,
    val unid_medida: String,
    val endereco1: String = "",
    val endereco2: String = "",
    val endereco3: String = "",
    val endereco4: String = "",
    val endereco5: String = "",
    val endereco6: String = "",
    val fabricacao: Date?,
    val validade: Date?,
    val contagem1: Date?,
    val contagem2: Date?,
    val contagem3: Date?,
    val nt_fiscal: String?,
    val valor: Double = 0.00,
    val tecnico: String,
    val foto: String = ""
)