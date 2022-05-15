package com.suki.expensetracker.domain.repository

import com.suki.expensetracker.domain.model.Transaction
import kotlinx.coroutines.flow.Flow

interface TransactionRepository {

    fun getTransactions(): Flow<List<Transaction>>

    suspend fun getTransactionById(id: Int): Transaction?

    suspend fun insertTransaction(transaction: Transaction)

    suspend fun deleteTransaction(transaction: Transaction)
}