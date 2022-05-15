package com.suki.expensetracker.data.repository

import com.suki.expensetracker.data.data_source.TransactionDao
import com.suki.expensetracker.domain.model.Transaction
import com.suki.expensetracker.domain.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow

class TransactionRepositoryImpl(
    private val dao: TransactionDao
) : TransactionRepository {
    override fun getTransactions(): Flow<List<Transaction>> {
        return dao.getTransactions()
    }

    override suspend fun getTransactionById(id: Int): Transaction? {
       return  dao.getTransactionById(id = id)
    }

    override suspend fun insertTransaction(transaction: Transaction) {
        dao.insertTransaction(transaction = transaction)
    }

    override suspend fun deleteTransaction(transaction: Transaction) {
        dao.deleteTransaction(transaction = transaction)
    }
}