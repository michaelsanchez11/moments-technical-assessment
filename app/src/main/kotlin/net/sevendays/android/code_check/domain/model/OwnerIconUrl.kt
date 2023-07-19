package net.sevendays.android.code_check.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class OwnerIconUrl(
    val avatarUrl: String
) : Parcelable