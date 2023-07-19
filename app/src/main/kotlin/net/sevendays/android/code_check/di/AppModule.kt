package net.sevendays.android.code_check.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import net.sevendays.android.code_check.BaseApplication
import javax.inject.Singleton

/**
 * Application scope dependencies will go here.
 */

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun providesApplication(@ApplicationContext app: Context): BaseApplication {
        return app as BaseApplication
    }
}