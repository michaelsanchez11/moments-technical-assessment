package net.sevendays.android.code_check.network.model

import com.google.gson.annotations.SerializedName

data class GithubRepositoryDto(

    @SerializedName("full_name")
    var name: String? = null,

    @SerializedName("owner")
    var ownerIconUrlDto: OwnerIconUrlDto? = null,

    @SerializedName("language")
    var language: String? = null,

    @SerializedName("stargazers_count")
    var stargazersCount: Long? = null,

    @SerializedName("watchers_count")
    var watchersCount: Long? = null,

    @SerializedName("forks_count")
    var forksCount: Long? = null,

    @SerializedName("open_issues_count")
    var openIssuesCount: Long? = null
)