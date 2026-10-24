package android.ai.inventoryapp

import android.ai.inventoryapp.data.AppContainer
import android.ai.inventoryapp.data.AppDataContainer
import android.app.Application

class InventoryApplication : Application() {

    /**
     * AppContainer instance used by the rest of classes to obtain dependencies
     */
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}