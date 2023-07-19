package net.sevendays.android.code_check.network.model

import com.google.gson.annotations.SerializedName

data class OwnerIconUrlDto(
    @SerializedName("avatar_url")
    val avatarUrl: String
)