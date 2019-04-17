package com.jkgames

import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration
import android.os.Bundle
import com.badlogic.gdx.backends.android.AndroidApplication


class AndroidLauncher : AndroidApplication() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val config = AndroidApplicationConfiguration()
        config.useWakelock = true
        initialize(GdxGame(), config)
    }
}