package com.suki.expensetracker.presentation

import androidx.lifecycle.ViewModel
import com.suki.expensetracker.domain.use_case.GetTransactions
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TransactionsViewModel @Inject constructor(
    private val transactionUseCase: GetTransactions
) : ViewModel() {

}