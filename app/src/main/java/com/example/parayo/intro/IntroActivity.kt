package com.example.parayo.intro

import android.app.Activity
import android.os.Bundle
import android.util.Log
import com.example.parayo.api.ParayoApi
import com.example.parayo.signup.SignupActivity
import kotlinx.coroutines.*
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.startActivity
//git test..
class IntroActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        GlobalScope.launch(Dispatchers.Main) {
            delay(1000)
            startActivity<SignupActivity>()
            finish()
        }
    }
}





