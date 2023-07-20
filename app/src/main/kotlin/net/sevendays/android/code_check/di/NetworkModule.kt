package net.sevendays.android.code_check.di

import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import net.sevendays.android.code_check.network.GithubRepositoryService
import net.sevendays.android.code_check.network.model.GithubRepositoryDtoMapper
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

private const val API_BASE_URL = "https://api.github.com/"

/**
 * These are dependencies that are required to make a network call and it is being scoped to the entire
 * application.
 */

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideGithubRepositoryDtoMapper(): GithubRepositoryDtoMapper {
        return GithubRepositoryDtoMapper()
    }

    @Singleton
    @Provides
    fun provideGithubRepositoryService(): GithubRepositoryService {
        return Retrofit.Builder()
            .baseUrl(API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
            .create(GithubRepositoryService::class.java)
    }
}