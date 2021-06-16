package com.example.parayo.signup

import android.os.Bundle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider
import net.codephobia.ankomvvm.components.BaseActivity
//import net.codephobia.ankomvvm.components.BaseActivity
import org.jetbrains.anko.setContentView

class SignupActivity : BaseActivity<SignupViewModel>(), LifecycleOwner {

    override val viewModelType = SignupViewModel::class

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        SignupActivityUI(getViewModel())
            .setContentView(this)
    }

}