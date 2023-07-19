package net.sevendays.android.code_check.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import net.sevendays.android.code_check.network.GithubRepositoryService
import net.sevendays.android.code_check.network.model.GithubRepositoryDtoMapper
import net.sevendays.android.code_check.repository.GithubRepositoryRepo
import net.sevendays.android.code_check.repository.GithubRepositoryRepoImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun providesGithubRepositoryRepo(
        githubRepositoryService: GithubRepositoryService,
        githubRepositoryDtoMapper: GithubRepositoryDtoMapper
    ): GithubRepositoryRepo {
        return GithubRepositoryRepoImpl(githubRepositoryService, githubRepositoryDtoMapper)
    }
}