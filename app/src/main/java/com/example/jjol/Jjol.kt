package com.example.jjol

import android.app.Application
import android.content.Context
import android.content.Context.MODE_PRIVATE

class Jjol: Application() {
    companion object {
        lateinit var prefs: Prefs
        const val Authorization = "Authorization"
        const val token = "token"
    }

    override fun onCreate() {
        prefs = Prefs(applicationContext)
        super.onCreate()
    }
}

class Prefs(context: Context) {
    private val prefNm = "mPref"
    private val prefs = context.getSharedPreferences(prefNm,MODE_PRIVATE)

    var token: String?
        get() = prefs.getString(Jjol.token, null)
        set(value) {
            prefs.edit().putString(Jjol.token, value).apply()
        }
}