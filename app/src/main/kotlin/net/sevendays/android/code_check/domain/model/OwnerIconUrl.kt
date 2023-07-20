package net.sevendays.android.code_check.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * Model class for the Owner Object in the API.
 */

@Parcelize
data class OwnerIconUrl(
    val avatarUrl: String
) : Parcelable