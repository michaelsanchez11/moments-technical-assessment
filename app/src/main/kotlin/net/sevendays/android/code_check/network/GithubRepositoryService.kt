package net.sevendays.android.code_check.network

import net.sevendays.android.code_check.network.response.GithubRepositorySearchResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

/**
 * GithubRepository Service calls to our api.
 */

interface GithubRepositoryService {

    @Headers("Accept: application/vnd.github.v3+json")
    @GET("search/repositories")
    suspend fun search(
        @Query("q") query: String
    ): GithubRepositorySearchResponse
}