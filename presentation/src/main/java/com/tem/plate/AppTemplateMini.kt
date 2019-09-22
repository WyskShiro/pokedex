package com.tem.plate
import androidx.multidex.MultiDexApplication
import com.tem.plate.util.dependecyinjector.applicationModule
import com.tem.plate.util.dependecyinjector.interactorModule
import com.tem.plate.util.dependecyinjector.repositoryModule
import com.tem.plate.util.dependecyinjector.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class AppTemplateMini : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@AppTemplateMini)
            modules(listOf(interactorModule, repositoryModule, applicationModule, viewModelModule))
        }
    }
}
