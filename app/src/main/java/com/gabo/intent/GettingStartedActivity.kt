package com.gabo.intent

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.util.Log.d
import androidx.appcompat.app.AppCompatActivity
import com.gabo.intent.databinding.ActivityGettingStartedBinding

class GettingStartedActivity : AppCompatActivity() {
    private var binding: ActivityGettingStartedBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGettingStartedBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        d("tag", "Getting Started onCreate")

        binding?.btnGetStarted?.setOnClickListener {
            finish()
            startActivity(Intent(this, SignInActivity::class.java))
        }
    } override fun onStart() {
        super.onStart()
        d("tag", "Getting Started onStart")
    }

    override fun onResume() {
        super.onResume()
        d("tag", "Getting Started onResume")
    }

    override fun onPause() {
        super.onPause()
        d("tag", "Getting Started onPause")
    }

    override fun onStop() {
        super.onStop()
        d("tag", "Getting Started onStop")
    }

    override fun onRestart() {
        super.onRestart()
        d("tag", "Getting Started onRestart")
    }


    override fun onDestroy() {
        d("tag","Getting Started onDestroy")
        binding = null
        super.onDestroy()
    }
}