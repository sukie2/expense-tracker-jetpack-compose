package com.suki.expensetracker.di

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import com.suki.expensetracker.data.data_source.TransactionDao
import com.suki.expensetracker.data.data_source.TransactionDatabase
import com.suki.expensetracker.data.repository.TransactionRepositoryImpl
import com.suki.expensetracker.domain.repository.TransactionRepository
import com.suki.expensetracker.domain.use_case.GetTransactions
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun providesTransactionDatabase(app: Application): TransactionDatabase {
        return Room.databaseBuilder(
            app,
            TransactionDatabase::class.java,
            "Transaction_DB"
        ).build()
    }

    @Provides
    @Singleton
    fun providesTransactionRepository(db: TransactionDatabase): TransactionRepository {
        return TransactionRepositoryImpl(db.transactionDao)
    }

    @Provides
    @Singleton
    fun providesTransactionUseCases(repository: TransactionRepository): GetTransactions{
        return GetTransactions(repository)
    }
}