package net.sevendays.android.code_check.repository

import android.util.Log
import net.sevendays.android.code_check.domain.model.GithubRepository
import net.sevendays.android.code_check.network.GithubRepositoryService
import net.sevendays.android.code_check.network.model.GithubRepositoryDtoMapper
import retrofit2.HttpException

class GithubRepositoryRepoImpl(
    private val githubRepositoryService: GithubRepositoryService,
    private val mapper: GithubRepositoryDtoMapper
) : GithubRepositoryRepo {

    override suspend fun search(query: String): List<GithubRepository> {
        try {
            val result = githubRepositoryService.search(query).githubRepositories
            return mapper.toDomainList(result)
        } catch (e: HttpException) {
            val errorBody = e.response()?.errorBody()?.string()
            Log.d("Error in Search", errorBody.toString())
        }
        return emptyList()
    }
}