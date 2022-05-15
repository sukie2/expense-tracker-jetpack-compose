package com.suki.expensetracker.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.suki.expensetracker.domain.model.Transaction

@Database(entities = [Transaction::class], version = 1)
abstract class TransactionDatabase : RoomDatabase() {
    abstract val transactionDoa: TransactionDao
}