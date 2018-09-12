package org.bobstuff.testbuild

import android.content.Context
import android.preference.PreferenceManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by bob
 */

@Module
class AppModule {
    @Provides
    fun provideContext(application: MyApplication): Context {
        return application.applicationContext
    }
}