package com.suki.expensetracker.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Transaction(
    val timestamp: Date,
    val name: String,
    val amount: Double,
    val type: String,
    @PrimaryKey val id: Int? = null
)