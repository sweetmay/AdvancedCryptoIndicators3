package com.sweetmay.advancedcryptoindicators.app

import android.os.Bundle
import com.sweetmay.advancedcryptoindicators.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class DashboardActivity: BaseActivity() {
    val viewModel: DashBoardViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        viewModel.cunt()
    }
}