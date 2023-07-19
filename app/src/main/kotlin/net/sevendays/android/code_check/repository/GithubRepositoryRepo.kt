package net.sevendays.android.code_check.repository

import net.sevendays.android.code_check.domain.model.GithubRepository

/**
 * This is the class that allows the UI to ask for the business model object. This interface should
 * not care about entities or dto's, therefore it should only return the Business Model Objects,
 * in this case the GithubRepository Model Object to represent in the UI.
 */
interface GithubRepositoryRepo {

    suspend fun search(query: String): List<GithubRepository>
}