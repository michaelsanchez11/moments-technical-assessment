package net.sevendays.android.code_check.network.response

import com.google.gson.annotations.SerializedName
import net.sevendays.android.code_check.network.model.GithubRepositoryDto

data class GithubRepositorySearchResponse(

    @SerializedName("items")
    var githubRepositories: List<GithubRepositoryDto>
)