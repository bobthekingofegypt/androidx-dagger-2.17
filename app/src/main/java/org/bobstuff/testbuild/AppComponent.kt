package org.bobstuff.testbuild

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by bob
 */
@Singleton
@Component(
        modules = [
            AndroidSupportInjectionModule::class,
            AppModule::class
        ]
)
interface AppComponent : AndroidInjector<MyApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<MyApplication>()
}