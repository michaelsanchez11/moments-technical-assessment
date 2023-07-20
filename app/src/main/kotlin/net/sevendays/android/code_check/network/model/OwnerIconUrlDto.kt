package net.sevendays.android.code_check.network.model

import com.google.gson.annotations.SerializedName

/**
 * Owner DTO Object, this can be changed if more params are needed for owner object.
 */
data class OwnerIconUrlDto(
    @SerializedName("avatar_url")
    val avatarUrl: String
)