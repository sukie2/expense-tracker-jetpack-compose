package com.suki.expensetracker.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Transaction(
    val timestamp: Long,
    val name: String,
    val amount: Double,
    val type: String,
    @PrimaryKey val id: Int? = null
)