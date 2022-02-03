package com.sweetmay.advancedcryptoindicators.app

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { DashBoardViewModel() }
}