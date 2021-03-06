package com.keylesspalace.tusky

/**
 * Created by charlag on 3/7/18.
 */

class FakeTuskyApplication : TuskyApplication() {

    private lateinit var locator: ServiceLocator

    override fun initSecurityProvider() {
        // No-op
    }

    override fun initAppInjector() {
        // No-op
    }

    override fun initPicasso() {
        // No-op
    }

    override fun getServiceLocator(): ServiceLocator {
        return locator
    }
}