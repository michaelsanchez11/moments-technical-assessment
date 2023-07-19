/*
 * Copyright © 2021 YUMEMI Inc. All rights reserved.
 */
package net.sevendays.android.code_check.presentation

import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import net.sevendays.android.code_check.R
import java.util.Date

@AndroidEntryPoint
class TopActivity : AppCompatActivity(R.layout.activity_top) {

    companion object {
        lateinit var lastSearchDate: Date
    }
}
