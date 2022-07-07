package com.gabo.intent

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.util.Log.d
import androidx.appcompat.app.AppCompatActivity
import com.gabo.intent.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {
        private var binding: ActivitySignInBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        d("tag", "Sign in onCreate")

        binding?.btnArrowBack?.setOnClickListener {
            finish()
            startActivity(Intent(this,GettingStartedActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        d("tag", "Sign in onStart")
    }

    override fun onResume() {
        super.onResume()
        d("tag", "Sign in onResume")
    }

    override fun onPause() {
        super.onPause()
        d("tag", "Sign in onPause")
    }

    override fun onStop() {
        super.onStop()
        d("tag", "Sign in onStop")
    }

    override fun onRestart() {
        super.onRestart()
        d("tag", "Sign in onRestart")
    }

    override fun onDestroy() {
        d("tag", "Sign in destroy")
        binding = null
        super.onDestroy()
    }
}