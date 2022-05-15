package com.suki.expensetracker.data.data_source

import androidx.room.*
import com.suki.expensetracker.domain.model.Transaction
import kotlinx.coroutines.flow.Flow

@Dao
interface TransactionDao {
    @Query("SELECT * FROM [transaction]")
    fun getTransactions(): Flow<List<Transaction>>

    @Query("SELECT * FROM [transaction] WHERE id = :id")
    suspend fun getTransactionById(id: Int): Transaction?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTransaction(transaction: Transaction)

    @Delete
    suspend fun deleteTransaction(transaction: Transaction)
}