package com.suki.expensetracker.domain.use_case

import com.suki.expensetracker.domain.model.Transaction
import com.suki.expensetracker.domain.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow

class GetTransactions(
    private val repository: TransactionRepository
){
    operator fun invoke(): Flow<List<Transaction>> {
        return repository.getTransactions()
    }
}
